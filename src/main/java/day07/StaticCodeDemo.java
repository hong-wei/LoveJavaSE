package day07;

/*
��̬����顣������ļ��ض�ִ�С�����ִֻ��һ�Ρ�
���ã�
	���ڸ�����г�ʼ����
*/
class StaticCode
{
	static int num;
	static
	{
		StaticCode.num = 10;
		// num *=3;
		System.out.println("hahahah");
	}

	{
		StaticCode.num = 10;
		// num *=3;
		System.out.println("heh");
	}

	StaticCode()
	{
	}

	static void show()
	{
		System.out.println(StaticCode.num);
	}
}

class PersonDemo
{
	private String name;
	{// �������顣���Ը����ж�����г�ʼ���ġ�

		System.out.println("constructor code ");
		// cry();
	}

	static
	{
		System.out.println("static code");
	}

	PersonDemo()/// �������顣���Ը����ж�����г�ʼ����,�Ǹ���Ӧ�Ķ����������Եĳ�ʼ����
	{
		name = "baby";
		System.out.println(name);
		// cry();
	}

	PersonDemo(String name)
	{
		this.name = name;
		// cry();
	}

	public void cry()
	{
		System.out.println("����");

	}

	public void speak()
	{
		System.out.println("name:" + name);
	}

	static void show()
	{
		System.out.println("show run");
	}
}

class StaticCodeDemo
{
	static
	{
		System.out.println("a");
	}

	public static void main(String[] args)
	{

		PersonDemo p = null;
		PersonDemo.show();
		PersonDemo p1 = new PersonDemo();
		p1.speak();
		PersonDemo p2 = new PersonDemo("����");
		p2.speak();
		new PersonDemo();
		new StaticCode().show();
		new StaticCode().show();
		StaticCode.show();
		System.out.println("b");
	}
}
