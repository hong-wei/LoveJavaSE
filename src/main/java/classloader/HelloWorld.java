//https://blog.csdn.net/briblue/article/details/54973413
//һ����Ͷ�������ϸjava�е�ClassLoader���


package classloader;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class HelloWorld {

    public void say(){
        System.out.println("Say Hello");
    }

    //HelloWorld.class�ֽ����ʽ�ļ�.java�����������ֱ��ʶ��.javaԴ�ļ�,��Ҫjavac����.class�ļ�.
    //C����Python��Ҳ����ת��.class�ļ�.

    //classloader �������3���ط�ȥ��.class�ļ�.
    //JAVA_HOME,  eg:C:\Program Files\Java\jdk1.8.0_91
    //         �ǰ�װjava��·��
    // PATH,  eg: PATH=%JAVA_HOME%\bin;%JAVA_HOME%\jre\bin;%PATH%;
    //         ԭ����PATH·�������JDKĿ¼�µ�binĿ¼��jreĿ¼��bin. --> javac, java �Ϳ���ֱ��������.
    // CLASSPATH, eg: CLASSPATH=.;%JAVA_HOME%\lib;%JAVA_HOME%\lib\tools.jar
    //         һ������ָ��jar��·������Ҫע�����ǰ���.;��.����ǰĿ¼


    //Java�Դ�3���������: --> ���ļ����࣬��Ҫ���غ�����⣬%JRE_HOME%\lib�µ�rt.jar��resources.jar��charsets.jar��class��.
    //1st: Bootstrap ClassLoader
    //2rd: Extension ClassLoader --> ��չ���������������Ŀ¼%JRE_HOME%\lib\extĿ¼�µ�jar����class�ļ��������Լ���-D java.ext.dirsѡ��ָ����Ŀ¼
    //3rd: Appclass Loader(SystemAppClass) --> ��ǰӦ�õ�classpath��������
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("sun.boot.class.path:" + System.getProperty("sun.boot.class.path"));
        System.out.println("java.ext.dirs:" + System.getProperty("java.ext.dirs"));
        System.out.println("java.class.path:" + System.getProperty("java.class.path"));

        // TODO Auto-generated method stub

        ClassLoader cl = HelloWorld.class.getClassLoader();
        //HelloWorld.class�ļ�����AppClassLoader���صġ�
        System.out.println("ClassLoader is:" + cl.toString());
        //-->ClassLoader is:sun.misc.Launcher$AppClassLoader@33909752

//        cl = int.class.getClassLoader();
//        System.out.println("int ClassLoader is:"+cl.toString()); 
// --> Exception in thread "main" java.lang.NullPointerException
        //��Ϊ: int.class����Bootstrap ClassLoader���ص�

        //ÿ������������и�������.
        System.out.println("ClassLoader\'s parent is:" + cl.getParent().toString());
        //-->ClassLoader's parent is:sun.misc.Launcher$ExtClassLoader@42a57993
        //AppClassLoader�ĸ���������ExtClassLoader

//        System.out.println("ClassLoader\'s grand father is:"+cl.getParent().getParent().toString());
        //-->Exception in thread "main" java.lang.NullPointerException
        //ExtClassLoaderҲû�и�������


//        cl = String.class.getClassLoader();
//
//        System.out.println("String ClassLoader is:"+cl.toString());

        //�����������Ǹ���

        //Bootstrap ClassLoader����C++��д�ġ�
        //��������JVM��һ����,����һ��Java���. JVM����ʱ, ͨ��Boostrap�����������rt.jar�Ⱥ���jar���е�class�ļ�,
        //int.class String.class ������������.
        //JVM ��ʼ��sun.misc.Launcher --> ����ExtClassLoader and AppClassLoader. 

        //˫��ί��--> �鿴��ͼ: 
//        classloader/HelloWorld.java:65

//        �Զ���ClassLoader
//        �Զ��岽��
//        1 ��дһ����̳���ClassLoader�����ࡣ
//        2 ��д����findClass()������
//        3 ��findClass()�����е���defineClass()��

        //�����Զ���classloader����
        DiskClassLoader diskLoader = new DiskClassLoader("/Users/zhanghongwei/Documents/workspaceScala/LoveJavaSE/src/main/java/lib");
        try {
            //����class�ļ�
            Class c = diskLoader.loadClass("classloader.Test");

            if(c != null){
                try {
                    Object obj = c.newInstance();
                    Method method = c.getDeclaredMethod("say",null);
                    //ͨ���������Test���say����
                    method.invoke(obj, null);
                } catch (InstantiationException | IllegalAccessException
                        | NoSuchMethodException
                        | SecurityException |
                        IllegalArgumentException |
                        InvocationTargetException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }



//        �����֮Class�����������
//        ���Լ��ܽ���class
        
        
//        Context ClassLoader �߳��������������
        //ÿ���̶߳����Լ���classloader. Ĭ����AppClassLoader, ���߳�Ĭ��ʹ�ø��̵߳�.
        
        
    }       
}

class DiskClassLoader extends ClassLoader {

    private String mLibPath;

    public DiskClassLoader(String path) {
        // TODO Auto-generated constructor stub
        mLibPath = path;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        // TODO Auto-generated method stub

        String fileName = getFileName(name);

        File file = new File(mLibPath, fileName);

        try {
            FileInputStream is = new FileInputStream(file);

            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            int len = 0;
            try {
                while ((len = is.read()) != -1) {
                    bos.write(len);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            byte[] data = bos.toByteArray();
            is.close();
            bos.close();

            return defineClass(name, data, 0, data.length);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return super.findClass(name);
    }

    //��ȡҪ���� ��class�ļ���
    private String getFileName(String name) {
        // TODO Auto-generated method stub
        int index = name.lastIndexOf('.');
        if (index == -1) {
            return name + ".class";
        } else {
            return name.substring(index + 1) + ".class";
        }
    }

}

