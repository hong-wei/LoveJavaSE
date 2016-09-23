package day0910;

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
			System.out.println("Inner Class show ..." + num);
		}
	}

	Demo demo1 = new Demo() // �����ڲ���1-���ɶ���
	{
		@Override
		void show()
		{
			System.out.println("Anonymouse Inner class show ........" + num);
		}
	};

	public void method()
	{
		new Inner().show(); // 1����������

		new Demo() // �����ڲ���2-ֱ�ӵ��÷����� // 2�����ڲ���
		{
			@Override
			void show()
			{
				System.out.println("Anonymouse Inner class show ........" + num);
			}
		}.show();

		demo1.show(); // 3�ڲ���������
	}
}

class InnerClassDemo4
{
	public static void main(String[] args)
	{
		new Outer4().method();
	}
}
