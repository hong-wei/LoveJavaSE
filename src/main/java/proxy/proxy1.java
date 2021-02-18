//https://www.liaoxuefeng.com/wiki/1252599548343744/1264804593397984
package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
public class proxy1 {
    //interface ����ʵ����,��������ת�Ͳ�ָ��ĳ��ʵ��.��Dynamic Proxy ���Բ���дʵ����,ֱ���������ڼ䴴��ĳ��interface��ʵ��.
    // �����ڼ䶯̬���� vs ��̬����
    public static void main(String[] args) {
        //ͨ���ķ�ʽ: ����interface --> ʵ���� --> �ٴ���ʵ��,����method
//        Hello hello = new HelloWorld();
//        hello.morning("Bob");

        // dynamic code.
        // �����һ�������object --> �ұ���һ��������ʵ����.
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method);
                if (method.getName().equals("morning")) {//������ͨ��method��ȷ������
                    System.out.println("Good morning, " + args[0]);
                } else if(method.getName().equals("test")){
                    System.out.println("Good testing, name=" + args[0] +", age = "+ args[1]);
                }
                return null;
            }
        };
        // newProxyInstance ���ص�object ǿ��ת��Ϊ Hello �ӿ�.
        Class[] interfaceClasses = {Hello.class};
        Hello hello = (Hello) Proxy.newProxyInstance(
                Hello.class.getClassLoader(), // ����ClassLoader
                interfaceClasses,             // ����Ҫʵ�ֵĽӿ� Class<?>[]
                handler                       // InvocationHandler--> ʵ�ֽӿ�δʵ�ֵķ���.
        ); // ���봦����÷�����InvocationHandler
        hello.morning("Bob");
//        hello.test("Bob",12);
        //������ʵ����,ֻ�ṩһ���ӿ�,û�о���ʵ��,Ҳ����
        
        //��̬����ʵ������JVM�������ڶ�̬����class�ֽ��벢���صĹ���.--> ����JVM ������д�����µĴ���: 


    }
    
}

//��̬����:
interface Hello {
    void morning(String name);
//    void test(String name, int age);
}

class HelloWorld implements Hello {
    public void morning(String name) {
        System.out.println("Good morning, " + name);
    }
}

//
class HelloDynamicProxy implements Hello {
    InvocationHandler handler;
    public HelloDynamicProxy(InvocationHandler handler) {
        this.handler = handler;
    }
    public void morning(String name) {
        try {
            handler.invoke(
                    this,
                    Hello.class.getMethod("morning", String.class),
                    new Object[] { name }
                    );
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}






















































































