package day10;

/*
Ϊʲô�ڲ�����ֱ�ӷ����ⲿ���г�Ա�أ�
������Ϊ�ڲ���������ⲿ������á�  �ⲿ����.this
*/
class Outer2
{
	int num = 3;

	class Inner
	{
		int num = 4;

		void show()
		{
			int num = 5;
			System.out.println(Outer2.this.num);
			System.out.println(Inner.this.num);
			System.out.println(num);
		}
	}

	void method()
	{
		new Inner().show();
	}
}

public class InnerClassDemo2
{
	public static void main(String[] args)
	{
		new Outer2().method();
	}
}
