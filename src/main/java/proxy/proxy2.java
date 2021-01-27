//https://www.zhihu.com/question/20794107

package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//1 static proxy:
interface Subject
{
    public void doSomething();
}

// ʵ�� һ���ӿ�, Ȼ��ʵ������ӿڵķ���.
class RealSubject implements Subject {
    @Override
    public void doSomething() {
        System.out.println( "call doSomething()" );
    }
}

//Subject �ľ�̬����
// String AOP �� Struts 2 ��������:
class SubjectProxy implements Subject
{
    Subject subimpl = new RealSubject();
    
    @Override
    public void doSomething()
    {
        System.out.println( "before ---- call doSomething " );
        subimpl.doSomething();
        System.out.println( "after ----- call doSomething()" );
    }
}


// ��̬����
class ProxyHandler implements InvocationHandler
{
    private Object tar;

    //��ί�ж��󣬲����ش�����
    public Object bind(Object tar)
    {
        this.tar = tar;
        //�󶨸���ʵ�ֵ����нӿڣ�ȡ�ô����� 
        return Proxy.newProxyInstance(
                tar.getClass().getClassLoader(),
                tar.getClass().getInterfaces(),
                this
        );
    }

    public Object invoke(Object proxy , Method method , Object[] args)throws Throwable
    {
        Object result = null;
        //����Ϳ��Խ�����ν��AOP�����
        //�ڵ��þ��庯������ǰ��ִ�й��ܴ���
        result = method.invoke(tar,args);
        //�ڵ��þ��庯��������ִ�й��ܴ���
        return result;
    }
}

public class proxy2
{
    public static void main(String args[])
    {
        //���������һ��RealSubject
        RealSubject realSubject = new RealSubject();
        realSubject.doSomething();
        
        //����һ������Subject
        Subject sub = new SubjectProxy();
        sub.doSomething();

        //���Ƕ�̬����example:
        ProxyHandler proxy = new ProxyHandler();
        //�󶨸���ʵ�ֵ����нӿ�
        Subject sub1 = (Subject) proxy.bind(new RealSubject());
        sub1.doSomething();

    }
}




