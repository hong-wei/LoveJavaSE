package itcastday06;

//�����������Ͳ�������
class Demo06
{
	public static void main(String[] args)
	{
		int x = 3;
		show(x);
		System.out.println("x=" + x);
	}

	public static void show(int x)
	{
		x = 4;
	}
}

// �����������Ͳ�������
class Demo1
{
	int x = 3;

	public static void main(String[] args)
	{
		Demo1 d = new Demo1();
		d.x = 9;
		show(d);
		System.out.println(d.x);

	}

	public static void show(Demo1 d)
	{
		d.x = 4;
	}
}
