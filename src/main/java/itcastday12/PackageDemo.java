package itcastday12;

/**
 * <pre>
--1------------------------------------
PackageDemo.java:8: �Ҳ�������
���ţ� �� DemoA
λ�ã� �� mypack.PackageDemo
                DemoA d = new DemoA();
                ^
PackageDemo.java:8: �Ҳ�������
���ţ� �� DemoA
λ�ã� �� mypack.PackageDemo
                DemoA d = new DemoA();
                              ^
2 ����

ԭ������д��

��ΪDemoA���Ѿ��а������������Ա���Ҫ��ȷ�䱨����
��ס��DemoA������ʴ�ġ� ��ȷ�����Ǳ���.����  packa.DemoA

--2------------------------------------


PackageDemo.java:8: ����� packa ������
                packa.DemoA d = new packa.DemoA();
                     ^
PackageDemo.java:8: ����� packa ������
                packa.DemoA d = new packa.DemoA();
                                         ^
2 ����


ԭ�����ڵ�ǰĿ¼��û�ҵ�����Ϊpacka���������Ŀ¼�£�
Ӧ������һ��classpath��


--3-----------------------------------

PackageDemo.java:8: packa.DemoA �� packa �в��ǹ����ģ��޷����ⲿ������ж����
�з���
                packa.DemoA d = new packa.DemoA();
                     ^
PackageDemo.java:8: packa.DemoA �� packa �в��ǹ����ģ��޷����ⲿ������ж����
�з���
                packa.DemoA d = new packa.DemoA();
                                         ^
2 ����
--4------------------------------------

PackageDemo.java:9: show() �� packa.DemoA �в��ǹ����ģ��޷����ⲿ������ж����
�з���
                d.show();
                 ^
1 ����

�ܽ᣺
�����֮�������з��ʣ������ʵİ��е��������public�ģ������ʵİ��е���ķ���Ҳ������public�ġ�

--------------------------------------
 * </pre>
 *
 */
class PackageDemo
{
	public static void main(String[] args)
	{

		DemoA d = new DemoA();
		d.show();

		DemoB b = new DemoB();
		b.method();// ͬһ�����е�protected����Ҳ���Է���

		System.out.println("Hello Package!");
		PackageDemo1.main(args);
		Class a = PackageDemo1.class;
	}
}

class PackageDemo1
{
	public static void main(String[] args)
	{

		DemoA d = new DemoA();
		d.show();

		DemoB b = new DemoB();
		b.method();// ͬһ�����е�protected����Ҳ���Է���

		System.out.println("Hello Package!");
	}
}