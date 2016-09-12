package itcastday10;

class Fu
{
	int num = 1;

	void show()
	{
		System.out.println("fu show " + num);
		show2();
	}

	static void staticMethod()
	{
		System.out.println("fu static method");
	}

	private void show2()
	{
		System.out.println("fu show " + num);
	}
}

class Zi extends Fu
{
	int num = 2;

	@Override
	void show()
	{
		System.out.println("zi show " + num);
		show2();
	}

	void show1()
	{
		System.out.println("zi show " + num);
	}

	void show2()
	{
		System.out.println("zi show " + num);
	}

	static void staticMethod()
	{
		System.out.println("zi static method");
	}
}

class DuoTaiDemo3
{
	public static void main(String[] args)
	{

		// BK --day10 Class 8Polymorphism 4�������� 1��Ա����
		Zi z = new Zi();
		System.out.println(z.num); // Zi �� num

		Fu f = new Zi();
		System.out.println(f.num); // Fu �� num

		// BK --day10 Class 8Polymorphism 4�������� 2��Ա����
		// f.show1(); // Compile Error: no show1 in Fu
		f.show(); // zi show �� ��̬�󶨣�ֻ�����ұ߶���ĳ�Ա������

		// BK --day10 Class 8Polymorphism 4�������� 3��̬��Ա����
		Fu.staticMethod();
		Zi.staticMethod();

	}
}
