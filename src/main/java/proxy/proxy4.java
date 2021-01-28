//https://www.jianshu.com/p/4e6fff9d27b5

package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//������Ļ���
interface CakeMachine{
    void makeCake();
}

//ר����ˮ������Ļ���
class FruitCakeMachine implements CakeMachine{
    public void makeCake() {
        System.out.println("Making a fruit cake...");
//        System.out.println("adding apricot..."); ����ֱ�Ӽ���仰,Ӧ���ô�������ʵ�ְ�., �鿴FruitCakeMachineProxy
    }
}

//ר�����ɿ�������Ļ���
class ChocolateCakeMachine implements CakeMachine{
    public void makeCake() {
        System.out.println("making a Chocolate Cake...");
    }
}

//ˮ�����������(����Ǿ�̬����),��ҪΪÿһ���������д����: �ɿ�������,ˮ������,,,�����������̫����.
class FruitCakeMachineProxy implements CakeMachine{
    private CakeMachine cakeMachine;
    public FruitCakeMachineProxy(CakeMachine cakeMachine) {
        this.cakeMachine = cakeMachine;
    }
    public void makeCake() {
        cakeMachine.makeCake();
        System.out.println("adding apricot...");
    }
}

class ChocolateCakeMachineProxy implements CakeMachine{
    private CakeMachine cakeMachine;
    public ChocolateCakeMachineProxy(CakeMachine cakeMachine) {
        this.cakeMachine = cakeMachine;
    }
    public void makeCake() {
        cakeMachine.makeCake();
        System.out.println("adding apricot...");
    }
}

//Java �����Ѿ�������������������Ƶ�һ���ӿڣ�ר������������Ƶ����⣬�����Ƕ�̬���� ���� InvocationHandler��
//��̬�����뾲̬����������Ǿ�̬����ֻ������ض�һ�����ͣ�ĳ�ֵ��������ĳ�ִ������������ʣ�������̬��������Զ��������ͣ����е������
//��ĳ�ִ������������ʣ���

//���ʶ�̬����
class ApricotHandler implements InvocationHandler {

    private Object object;

    public ApricotHandler(Object object) {
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(object, args);    //���������ĵ����������
        System.out.println("adding apricot...");
        return result;
    }
}

//�����
class CakeShop {
    public static void main(String[] args) {
        
        FruitCakeMachine fruitCakeMachineStatic = new FruitCakeMachine();
        FruitCakeMachineProxy fruitCakeProxyStatic = new FruitCakeMachineProxy(fruitCakeMachineStatic);
        fruitCakeProxyStatic.makeCake();   //making a Fruit Cake...   adding apricot...

        ChocolateCakeMachine chocolateCakeMachineStatic = new ChocolateCakeMachine();
        ChocolateCakeMachineProxy chocolateCakeProxyStatic = new ChocolateCakeMachineProxy(chocolateCakeMachineStatic);
        chocolateCakeProxyStatic.makeCake();   //making a Fruit Cake...   adding apricot...
        
        
        //ˮ��������һ������
        CakeMachine fruitCakeMachine = new FruitCakeMachine();
        ApricotHandler fruitCakeApricotHandler = new ApricotHandler(fruitCakeMachine);
        CakeMachine fruitCakeProxyDynamic = (CakeMachine) Proxy.newProxyInstance(
                fruitCakeMachine.getClass().getClassLoader(),
                fruitCakeMachine.getClass().getInterfaces(), 
                fruitCakeApricotHandler
        );
        fruitCakeProxyDynamic.makeCake();

        //�ɿ���������һ������
        CakeMachine chocolateCakeMachine = new ChocolateCakeMachine();
        ApricotHandler chocolateCakeApricotHandler = new ApricotHandler(chocolateCakeMachine);
        CakeMachine chocolateCakeProxy = (CakeMachine) Proxy.newProxyInstance(
                chocolateCakeMachine.getClass().getClassLoader(),
                chocolateCakeMachine.getClass().getInterfaces(), 
                chocolateCakeApricotHandler
        );
        chocolateCakeProxy.makeCake();
    }
}