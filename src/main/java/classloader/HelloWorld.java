//https://blog.csdn.net/briblue/article/details/54973413
package classloader;

public class HelloWorld{

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
    public static void main(String[] args){
        System.out.println("Hello world!");
        System.out.println("sun.boot.class.path:"+System.getProperty("sun.boot.class.path"));
        System.out.println("java.ext.dirs:"+System.getProperty("java.ext.dirs"));
        System.out.println("java.class.path:"+System.getProperty("java.class.path"));
    }
}