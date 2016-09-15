package day10;

import java.util.Iterator;

class Outer
{
	private static int num = 31;
	InnerPrivate innerPrivate = new InnerPrivate();
	Inner innerPublic = new Inner();

	public InnerPrivate getInnerPrivateInstance()
	{
		return new InnerPrivate();
	}

	class Inner// �ڲ��ࡣ
	{
		int test = 5;

		void show()
		{
			System.out.println("show run..." + Outer.num);
		}

		// BK --day10 Class 9Inner class 4ע������ 2Static
		// ����ڲ����ж����˾�̬��Ա�����ڲ���Ҳ�����Ǿ�̬�ġ�
		// static int number = 5;// ���߱��final
		//
		// static void function()
		// {
		// System.out.println("function run ...." + Outer.num);
		// }

	}

	// BK --day10 Class 9Inner class 4ע������ 3Priavte �����ܷ���
	private class InnerPrivate implements Iterable<Object>// �ڲ��ࡣ
	{
		int test = 5;

		void show()
		{
			System.out.println("show run..." + Outer.num);
		}

		@Override
		public Iterator<Object> iterator()
		{
			return null;
		}

	}

	static class InnerStatic// �ڲ��ࡣ
	{
		static int number = 5;

		void show()
		{
			System.out.println("show run..." + Outer.num);
		}

		public static void showStatic()
		{
		}
	}

	public void method()
	{
		Inner in = new Inner();
		in.show();
	}

	static public void methodStatic()
	{
		Inner in = new Outer().new Inner();
	}
}

class InnerClassDemo
{

	public static void main(String[] args)
	{
		Outer out = new Outer();
		Outer.methodStatic();

		// BK --day10 Class 9Inner class 1���ַ��ʷ�ʽ
		// �ȴ����ⲿ������ٴ����ڲ������-�����
		Outer.Inner in1 = new Outer().new Inner();
		in1.show();

		// ����ڲ����Ǿ�̬�ġ� �൱��һ���ⲿ�࣬�������ⲿ��Ķ����ˡ�
		Outer.InnerStatic innerStatic = new Outer.InnerStatic();
		// InnerStatic innerStatic = new InnerStatic();
		innerStatic.show();

		// ����ڲ����Ǿ�̬�ģ���Ա�Ǿ�̬�ġ�-����
		Outer.InnerStatic.showStatic();

	}

}
