package day09;

class Fu5
{
	int num = 1;

	Fu5()
	{
		// super();
		this.fuMethodOnly();
		this.overideMethod();
		return;
	}

	void fuMethodOnly()
	{
		System.out.println("fu show " + this.num);
	}

	void overideMethod()
	{
		System.out.println("fu show" + this.num);
	}
}

class Zi5 extends Fu5
{
	int num = 2;

	Zi5()
	{
		super();
		// ͨ��super��ʼ����������ʱ������ĳ�Ա������δ��ʾ��ʼ����
		// ��super()�����ʼ����Ϻ󣬲Ž�������ĳ�Ա������ʾ��ʼ����
		System.out.println("fu cons run...." + super.num);
		System.out.println("zi cons run...." + this.num);
		return;
	}

	@Override
	void overideMethod()
	{
		System.out.println("zi show..." + this.num);
	}
}

class ExtendsDemo5
{
	public static void main(String[] args)
	{
		Zi5 z = new Zi5();
		z.overideMethod();
	}

}
