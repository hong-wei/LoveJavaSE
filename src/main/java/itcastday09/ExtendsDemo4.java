package itcastday09;

class Fu
{
	int num;

	Fu()
	{
		this.num = 10;
		System.out.println("A fu run");
	}

	Fu(int x)
	{
		System.out.println("B fu run..." + x);
	}
}

class Zi extends Fu
{
	int num;

	Zi()
	{
		// super();// Ĭ�ϵ��õľ��Ǹ����еĿղ����Ĺ��캯����
		System.out.println("C zi run" + this.num);
	}

	Zi(int x)
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
		new Zi(6);
	}
}
