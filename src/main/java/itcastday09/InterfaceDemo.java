package itcastday09;

/*
abstract class AbsDemo
{
	abstract void show1();
	abstract void show2();
}
֪ʶ�㣺 key points
1 definition: ��һ���������еķ������ǳ����ʱ����ʱ���Խ��ó���������һ����ʽ����ͱ�ʾ������ �ӿ� interface��
  ����ӿ�ʹ�õĹؼ��ֲ���class����interface.

2 characteristic: ���ڽӿڵ��г����ĳ�Ա��������Щ��Ա���й̶������η���
	1��ȫ�ֳ���: public static final --if don't write the compiler do it 
	2�����󷽷�: public abstract 
	�ɴ˵ó����ۣ��ӿ��еĳ�Ա���ǹ�����Ȩ��
3 implement:������֮���Ǽ̳й�ϵ������ӿ�ֱ����ʵ�ֹ�ϵ�� 
	�ӿڲ�����ʵ����,ֻ����ʵ���˽ӿڵ����ಢ�����˽ӿ������еĳ��󷽷��󣬸�����ſ���ʵ������
	��������������һ�������ࡣ
	
4 many implements:
	��java�в�ֱ��֧�ֶ�̳У���Ϊ����ֵ��õĲ�ȷ���ԡ�
	����java����̳л��ƽ��и�������java�б���˶�ʵ�֡�
	һ�������ʵ�ֶ���ӿڡ� 
	
	bug: Search "public int show();",It can not work like this.

5 һ�����ڼ̳���һ�����ͬʱ��������ʵ�ֶ���ӿڡ�eg:class Q and Class Test
	�ӿڵĳ��ֱ����˵��̳еľ����ԡ�eg: class Test2
	�ӿ���ӿ�֮���Ǽ̳й�ϵ�����ҽӿڿ��Զ�̳С� eg:CC QQ MM ,��Ϊû�з����壬����Ӱ�칦�ܡ�

6 4.8.1 �ӿڵ��ص�      -- Ref:P9 ���ǲ���_Java��ѵ_����_Java����[04-�̳���]
7 4.8.2 �ӿ������������ -- ��Ref:P9 ���ǲ���_Java��ѵ_����_Java����[04-�̳���]��

8 ������ͽӿڵ���ͬ�㣺 eg: InterfaceDemo2.java
	��ͬ�㣺
		���ǲ������ϳ�ȡ�����ġ�
	
	
	��ͬ�㣺
		1����������Ҫ���̳У�����ֻ�ܵ��̳С�
		   �ӿ���Ҫ��ʵ�֣����ҿ��Զ�ʵ�֡� 
		2���������п��Զ�����󷽷��ͷǳ��󷽷�������̳к󣬿���ֱ��ʹ�÷ǳ��󷽷���
		   �ӿ���ֻ�ܶ�����󷽷�������������ȥʵ�֡� 
		3��������ļ̳У���is a��ϵ���ڶ������ϵ�Ļ����������ݡ�
		   �ӿڵ�ʵ���� like a ��ϵ���ڶ�����ϵ���⹦�ܡ�
	
	Ȯ�����ܷ֣��е�äȮ���ѱ�Ȯ��
	
*/

interface DemoInterface
{
	public static final int NUM = 4;

	public abstract void show1();
	public abstract void show2();
}


class DemoImpleeement implements DemoInterface{

	int a;
	@Override
	public void show1() {
	}

	@Override
	public void show2() {
	}
	
}


class DemoImpl implements DemoInterface
{
	public void show1()
	{}

	public void show2()
	{
	
	}
}


interface A
{
	public void show();
}

interface Z
{
	public int add(int a,int b);
//	public int show();
}

class Test implements A,Z//��ʵ��
{
	
	public int add(int a,int b)
	{
		return a+b+3;	
	}
	/**/
	public void show(){}
	
}

class Q
{
	public void method()
	{}
}

abstract class Test2 extends Q implements A,Z
{

}

interface CC
{
	void show();
}
interface MM
{
	void method();
}

interface QQ extends  CC,MM//
{
	void function();
}

class WW implements QQ
{
//����3��������
	public void show(){}
	public void method(){}
	public void function(){}
}










