package itcastday10;
/*
1 definition: 
	ǰ�᣺
		�ڲ������̳л���ʵ��һ���ⲿ����߽ӿڡ�
	���ʣ������ڲ��ࣺ��ʵ����һ������������󣬾����ڲ���ļ�д��ʽ�� 

2	��ʽ��new ����or�ӿ�(){��������}
	
3  ͨ����ʹ�ó���֮һ�� InnerClassDemo5.java
	�����������ǽӿ�����ʱ�����ҽӿ��еķ���������������
	�����������ڲ�����Ϊʵ�ʲ������д���
	eg:show(new Inter()

4 һ�������⣺InnerClassDemo6.java

	Object obj = new Object()
	{
		public void show()
		{
			System.out.println("show run");
		}

	};
	obj.show();//��Ϊ�����ڲ�����������������ת��Ϊ��Object���͡�
					//�����Ͳ�����ʹ���������еķ����ˡ�

*/

abstract class Demo {
	abstract void show();
}

class Outer4 {
	int num = 5;

	public void method() {
		class Inner extends Demo { // Formal Inner Class
			void show() {
				System.out.println("Inner Class show ..." + num);
			}
		}
		new Inner().show();

		new Demo()// �����ڲ��ࡣ
		{
			void show() {
				System.out.println("Anonymouse Inner class show ........" + num);
			}
		}.show();
	}
}

class InnerClassDemo4 {
	public static void main(String[] args) {
		new Outer4().method();
	}
}
