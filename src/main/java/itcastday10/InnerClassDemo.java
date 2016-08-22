package itcastday10;

class Outer
{
	private static int num = 31;

	class Inner// �ڲ��ࡣ
	{
		void show()
		{
			System.out.println("show run..." + Outer.num);
		}
		/*
		 * static void function()//����ڲ����ж����˾�̬��Ա�����ڲ���Ҳ�����Ǿ�̬�ġ� { System.out.println("function run ...."+num); }
		 */
	}

	static class InnerStatic// �ڲ��ࡣ
	{
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
		// ֱ�ӷ����ⲿ���е��ڲ����еĳ�Ա-�����
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
