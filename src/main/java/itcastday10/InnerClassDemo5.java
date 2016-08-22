package itcastday10;

interface Inter
{
	void show1();

	void show2();
}

class Outer5
{
	/*
	 * class Inner implements Inter { public void show1() { } public void show2() {
	 *
	 * } }
	 */

	public void method()
	{
		// Inner in = new Inner();
		// in.show1();
		// in.show2();

		Inter in = new Inter()
		{
			@Override
			public void show1()
			{

			}

			@Override
			public void show2()
			{

			}

		};
		in.show1();
		in.show2();
	}
}

/*
 * ͨ����ʹ�ó���֮һ�� �����������ǽӿ�����ʱ�����ҽӿ��еķ��������������� �����������ڲ�����Ϊʵ�ʲ������д���
 */
public class InnerClassDemo5
{

	class Inner
	{
	}

	public static void main(String[] args)
	{
		System.out.println("Hello World!");
		InnerClassDemo5.show(new Inter() // BK --day10 Class 9Inner class 3Anonymous ��������
		{
			@Override
			public void show1()
			{
			}

			@Override
			public void show2()
			{
			}
		});

		// new Inner();
	}

	public void method()
	{
		new Inner();
	}

	public static void show(Inter in)
	{
		in.show1();
		in.show2();
	}
}
