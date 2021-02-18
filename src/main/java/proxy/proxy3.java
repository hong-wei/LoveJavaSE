//https://zhuanlan.zhihu.com/p/62660956
package proxy;

import java.lang.reflect.*;
import java.util.Date;

import java.lang.reflect.Method;

import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class proxy3 {
    //�����Ƚ�Calculator�ӿڵ�Class���� �� CalculatorImplʵ�����Class����
    public static void main(String[] args) {
		/*Calculator�ӿڵ�Class����
          �õ�Class��������ַ�ʽ��1.Class.forName(xxx) 
                                2.xxx.class 
                                3.xxx.getClass()
          ע�⣬�Ⲣ��������new��һ��Class���󣬶�������������ز�����Class����            
        */
        // ������JVM ���ز�����Class����.
        Class<Calculator> calculatorClazz = Calculator.class;
        
        //Calculator�ӿڵĹ�������Ϣ
        Constructor[] calculatorClazzConstructors = calculatorClazz.getDeclaredConstructors();
        //Calculator�ӿڵķ�����Ϣ
        Method[] calculatorClazzMethods = calculatorClazz.getDeclaredMethods();
        //��ӡ
        System.out.println("------�ӿ�Class�Ĺ�������Ϣ------");
        printClassInfo(calculatorClazzConstructors);
        System.out.println("------�ӿ�Class�ķ�����Ϣ------");
        printClassInfo(calculatorClazzMethods);

        //Calculatorʵ�����Class����
        Class<CalculatorImpl> calculatorImplClazz = CalculatorImpl.class;
        //Calculatorʵ����Ĺ�������Ϣ
        Constructor<?>[] calculatorImplClazzConstructors = calculatorImplClazz.getDeclaredConstructors();
        //Calculatorʵ����ķ�����Ϣ
        Method[] calculatorImplClazzMethods = calculatorImplClazz.getDeclaredMethods();
        //��ӡ
        System.out.println("------ʵ����Class�Ĺ�������Ϣ------");
        printClassInfo(calculatorImplClazzConstructors);
        System.out.println("------ʵ����Class�ķ�����Ϣ------");
        printClassInfo(calculatorImplClazzMethods);


        //��Ŀ�����ͨ������������������
        Calculator calculator = new CalculatorProxy(new CalculatorImpl());
        //����������Ŀ����󷽷���ɼ��㣬����ǰ���ӡ��־
        calculator.add(1, 2);
        calculator.subtract(2, 1);
    }

    public static void printClassInfo(Executable[] targets){
        for (Executable target : targets) {
            // ������/��������
            String name = target.getName();
            StringBuilder sBuilder = new StringBuilder(name);
            // ƴ��������
            sBuilder.append('(');
            Class[] clazzParams = target.getParameterTypes();
            // ƴ�Ӳ���
            for(Class clazzParam : clazzParams){
                sBuilder.append(clazzParam.getName()).append(',');
            }
            //ɾ�����һ�������Ķ���
            if(clazzParams!=null && clazzParams.length != 0) {
                sBuilder.deleteCharAt(sBuilder.length()-1);
            }
            //ƴ��������
            sBuilder.append(')');
            //��ӡ ������/����
            System.out.println(sBuilder.toString());
        }
    }
}

/**
 * Calculator�ӿ�
 */
interface Calculator {
    int add(int a, int b);
    int subtract(int a, int b);
}



/**
 * Ŀ�����ʵ���࣬ʵ��Calculator�ӿ�
 */
class CalculatorImpl implements Calculator {

    //��
    public int add(int a, int b) {
        int result = a + b;
        return result;
    }

    //��
    public int subtract(int a, int b) {
        int result = a - b;
        return result;
    }

    //�˷�������...
}

/**
 * �������ʵ���࣬ʵ��Calculator�ӿ�
 */
class CalculatorProxy implements Calculator {
    //��������ڲ�ά��һ��Ŀ���������
    private Calculator target;

    //���췽��������Ŀ�����
    public CalculatorProxy(Calculator target) {
        this.target = target;
    }

    //����Ŀ������add������ǰ���ӡ��־
    @Override
    public int add(int a, int b) {
        System.out.println("add������ʼ...");
        int result = target.add(a, b);
        System.out.println("add��������...");
        return result;
    }

    //����Ŀ������subtract������ǰ���ӡ��־
    @Override
    public int subtract(int a, int b) {
        System.out.println("subtract������ʼ...");
        int result = target.subtract(a, b);
        System.out.println("subtract��������...");
        return result;
    }

    //�˷�������...
}



//����new����calculatorImpl ��Ϊ����:
class ProxyTest {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        /*
         * ����1��Calculator�����������������Calculator���ؽ��ڴ�����������
         * ����2�����������Ҫ��Ŀ�����ʵ����ͬ�ӿ�Calculator
         * */
        Class calculatorProxyClazz = Proxy.getProxyClass(Calculator.class.getClassLoader(), Calculator.class);
        //��Calculatorʵ�����Class�������Աȣ���������Class��ʲô����
        System.out.println(CalculatorImpl.class.getName());
        System.out.println(calculatorProxyClazz.getName());
        //��ӡ����Class����Ĺ�����
        Constructor[] constructors = calculatorProxyClazz.getConstructors();
        System.out.println("----������----");
        printClassInfo(constructors);
        //��ӡ����Class����ķ���
        Method[] methods = calculatorProxyClazz.getMethods();
        System.out.println("----����----");
        printClassInfo(methods);
        
        //�����������
        
        //�õ��в������캯��: 
        Constructor constructor = calculatorProxyClazz.getConstructor(InvocationHandler.class);
        
        //���䴴������ʵ��:
        Calculator calculatorProxyImpl = (Calculator) constructor.newInstance(new InvocationHandler() {
            //ÿ�ε��ô�����󷽷��ͻ����invoke,�������ֵ���Ǵ������ķ���ֵ��.
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                
//                ���跨��invoke()�����õ�Ŀ����󣬲�����Ŀ������ͬ��������
                //����Ϳ���ģ��ʵ�־��巽����ʵ����.
                CalculatorImpl calculatorImpl = new CalculatorImpl();
                
                //�����������
                Object result = method.invoke(calculatorImpl, args);
                
                return result;
            }
        });
        System.out.println(calculatorProxyImpl.add(1,2));
        System.out.println(calculatorProxyImpl.subtract(2,1));
    }

    public static void printClassInfo(Executable[] targets) {
        for (Executable target : targets) {
            // ������/��������
            String name = target.getName();
            StringBuilder sBuilder = new StringBuilder(name);
            // ƴ��������
            sBuilder.append('(');
            Class[] clazzParams = target.getParameterTypes();
            // ƴ�Ӳ���
            for (Class clazzParam : clazzParams) {
                sBuilder.append(clazzParam.getName()).append(',');
            }
            //ɾ�����һ�������Ķ���
            if (clazzParams != null && clazzParams.length != 0) {
                sBuilder.deleteCharAt(sBuilder.length() - 1);
            }
            //ƴ��������
            sBuilder.append(')');
            //��ӡ ������/����
            System.out.println(sBuilder.toString());
        }
    }
}
//������װ,��calculatorImpl ��Ϊ��������: 
class ProxyTest2 {
    public static void main(String[] args) throws Throwable {
        CalculatorImpl target = new CalculatorImpl();
        //����Ŀ�����
        //Ŀ�ģ�1.������ʵ�ֵĽӿ����ɴ������ 2.����������Ŀ����󷽷�
        Calculator calculatorProxy = (Calculator) getProxy(target);
        calculatorProxy.add(1, 2);
        calculatorProxy.subtract(2, 1);
    }

    private static Object getProxy(final Object target) throws Exception {
        //����1������Ҹ�������������� ����2��Ŀ�����ʵ�ֵĽӿڣ��ô������ʵ����ͬ�ӿ�
        Class proxyClazz = Proxy.getProxyClass(target.getClass().getClassLoader(), target.getClass().getInterfaces());
        Constructor constructor = proxyClazz.getConstructor(InvocationHandler.class);
        Object proxy = constructor.newInstance(new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method.getName() + "������ʼִ��...");
                Object result = method.invoke(target, args);
                System.out.println(result);
                System.out.println(method.getName() + "����ִ�н���...");
                return result;
            }
        });
        return proxy;
    }
}

//ֱ�Ӵ���������:
class ProxyTest3 {
    public static void main(String[] args) throws Throwable {
        CalculatorImpl target = new CalculatorImpl();
        Calculator calculatorProxy = (Calculator) getProxy(target);
        calculatorProxy.add(1, 2);
        calculatorProxy.subtract(2, 1);
    }

    private static Object getProxy(final Object target) throws Exception {
        Object proxy = Proxy.newProxyInstance(
                target.getClass().getClassLoader(),/*�������*/
                target.getClass().getInterfaces(),/*�ô�������Ŀ�����ʵ����ͬ�ӿ�*/
                new InvocationHandler(){/*�������ķ������ն��ᱻJVM��������invoke����*/
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println(method.getName() + "������ʼִ��...");
                        Object result = method.invoke(target, args);
                        System.out.println(result);
                        System.out.println(method.getName() + "����ִ�н���...");
                        return result;
                    }
                }
        );
        return proxy;
    }
}


interface Advice {
    void beforeMethod(Method method);
    void afterMethod(Method method);
}

class MyLogger implements Advice {

    public void beforeMethod(Method method) {
        System.out.println(method.getName() + "����ִ�п�ʼ...");
    }

    public void afterMethod(Method method) {
        System.out.println(method.getName() + "����ִ�н���...");
    }
}

class ProxyTest4 extends ClassLoader{
    public static void main(String[] args) throws Throwable {
        CalculatorImpl target = new CalculatorImpl();
        Calculator calculatorProxy = (Calculator) getProxy(target, new MyLogger());
        calculatorProxy.add(1, 2);
        calculatorProxy.subtract(2, 1);
    }

    private static Object getProxy(final Object target, Advice logger) throws Exception {
        /*�������ķ������ն��ᱻJVM��������invoke����*/
        Object proxy = Proxy.newProxyInstance(
                target.getClass().getClassLoader(),/*�������*/
                target.getClass().getInterfaces(),/*�ô�������Ŀ�����ʵ����ͬ�ӿ�*/
                (proxy1, method, args) -> {
                    logger.beforeMethod(method);
                    Object result = method.invoke(target, args);
                    System.out.println(result);
                    logger.afterMethod(method);
                    return result;
                }
        );
        return proxy;
    }

//    @Override
//    public Class<?> findClass(String name) throws ClassNotFoundException {
//        try {
//		   /*�Լ�����дһ��getClassData() ͨ��IO����ָ��λ�ö�ȡxxx.class�ļ��õ��ֽ�����*/
//            byte[] datas = getClassData(name);
//            if(datas == null) {
//                throw new ClassNotFoundException("��û���ҵ���" + name);
//            }
//            //����������������defineClass()���������ֽ���õ�Class����
//            return this.defineClass(name, datas, 0, datas.length);
//        } catch (IOException e) {
//            e.printStackTrace();
//            throw new ClassNotFoundException("���Ҳ�����" + name);
//        }
//    }
}































































