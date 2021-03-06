package day0910;

class FuT2
{

	int numNormal = 1;
	static int numStatic = 1;

	static
	{
		System.out.println("fu lei static construction code run ");

	}

	{
		System.out.println("fu lei construction code run ");
		show();
	}

	FuT2()
	{
		System.out.println("fu lei constructor run ");
		show();
	}

	void show()
	{
		System.out.println("fu show ");
		System.out.println("fu  show ... " + numStatic);
		System.out.println("fu numNormal show ... " + numNormal);
	}
}

class ZiT2 extends FuT2
{
	int numNormal = 2;
	static int numStatic = 2;
	static int ziNumStatic = 2;
	static
	{
		System.out.println("zi static constructor code ..." + ZiT2.numStatic);
		ZiT2.numStatic = 3;
	}
	{
		System.out.println("zi constructor code ..." + ZiT2.numStatic);
		System.out.println("zi constructor code ..." + numNormal);
		ZiT2.numStatic = 4;
		numNormal = 5;
		show();
	}

	ZiT2()
	{
		super();
		System.out.println("zi constructor ..." + ZiT2.numStatic);
	}

	@Override
	void show()
	{
		System.out.println("zi numStatic show ... " + ZiT2.numStatic);
		System.out.println("zi numNormal show ... " + numNormal);
	}

}

public class FinalConstructions2
{
	public static void main(String[] args)
	{
		System.out.println("----new1 object");
		new ZiT2();
		System.out.println("----new2 object");
		new ZiT2();
	}
}