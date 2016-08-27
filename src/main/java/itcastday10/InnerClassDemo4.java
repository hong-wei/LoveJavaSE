package itcastday10;

abstract class Demo
{
	abstract void show();
}

class Outer4
{
	int num = 5;

	class Inner extends Demo // �����ڲ��ࡣ
	{
		@Override
		void show()
		{
			System.out.println("Inner Class show ..." + Outer4.this.num);
		}
	}

	Demo demo1 = new Demo() // �����ڲ���1-���ɶ���
	{
		@Override
		void show()
		{
			System.out.println("Anonymouse Inner class show ........" + Outer4.this.num);
		}
	};

	public void method()
	{
		new Inner().show();

		new Demo() // �����ڲ���2-ֱ�ӵ��÷�����
		{
			@Override
			void show()
			{
				System.out.println("Anonymouse Inner class show ........" + Outer4.this.num);
			}
		}.show();

		this.demo1.show();
	}
}

class InnerClassDemo4
{
	public static void main(String[] args)
	{
		new Outer4().method();
	}
}
