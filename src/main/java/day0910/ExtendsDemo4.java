package day0910;

class Fu2
{
	int num;

	Fu2()
	{
		num = 10;
		System.out.println("A fu run");
	}

	Fu2(int x)
	{
		System.out.println("B fu run..." + x);
	}
}

class Zi2 extends Fu2
{
	int num;

	Zi2()
	{
		// super();// Ĭ�ϵ��õľ��Ǹ����еĿղ����Ĺ��캯����
		System.out.println("C zi run" + num);
	}

	Zi2(int x)
	{
		this();
		// super();
		// super(x);
		System.out.println("D zi run " + x);
	}
}

class ExtendsDemo4
{
	public static void main(String[] args)
	{
		new Zi2(6);
	}
}
