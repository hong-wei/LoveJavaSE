package itcastday10;

/*
1 definition
	��һ���ඨ������һ��������棬�������Ǹ� ��ͳ�Ϊ�ڲ��ࣨ�����࣬Ƕ���ࣩ��

2 �ڲ�������ص㣺
	1���ڲ������ֱ�ӷ����ⲿ���еĳ�Ա�� 		--��ʹprivate Ҳ���Է���
	2���ⲿ��Ҫ�����ڲ��࣬���뽨���ڲ���Ķ��� --��ʹprivate Ҳ���Է���
	
	eg: Outer out = new Outer();
		out.method();

3 һ�����������ƣ�
	��������ʱ�����ָ����������л����������������ﻹ�ڷ��ʱ�������������ݡ�
	��ʱ���ǻ��е����ﶨ����ڲ�����������
	eg: I have heart. The heart is inner class, it use lots of my body resource.

4  three call ways
	1  ֱ�ӷ����ⲿ���е��ڲ����еĳ�Ա��
	// Outer.Inner in = new Outer().new Inner();
	// in.show();
	
	2  ����ڲ����Ǿ�̬�ġ� �൱��һ���ⲿ��
	// Outer.Inner in = new Outer.Inner();
	// in.show();
	
	3  ����ڲ����Ǿ�̬�ģ���Ա�Ǿ�̬�ġ� 
	// Outer.Inner.function();
	
	tips:if Inner method is static,  the inner class must be static.

5 Ϊʲô�ڲ�����ֱ�ӷ����ⲿ���г�Ա�أ�
	������Ϊ�ڲ���������ⲿ������á�  "�ⲿ����.this"
	eg: System.out.println(Outer2.this.num);
	
6 �ڲ�����Դ���ھֲ�λ���ϡ� 
	�ڲ����ھֲ�λ����ֻ�ܷ��ʾֲ��б�final���εľֲ�������
	
*/

class Outer {
	private static int num = 31;

	class  Inner// �ڲ��ࡣ
	{
		void show() {
			System.out.println("show run..." + num);
		}
		/*
		 * static void function()//����ڲ����ж����˾�̬��Ա�����ڲ���Ҳ�����Ǿ�̬�ġ� {
		 * System.out.println("function run ...."+num); }
		 */
	}

	static public void method() {
//		Inner in = new Inner();
//		in.show();
	}
}

class InnerClassDemo {
	public static void main(String[] args) {
		 Outer out = new Outer();
		 out.method();
		// ֱ�ӷ����ⲿ���е��ڲ����еĳ�Ա��
		// Outer.Inner in = new Outer().new Inner();
		// in.show();

		// ����ڲ����Ǿ�̬�ġ� �൱��һ���ⲿ��
		// Outer.Inner in = new Outer.Inner();
		// in.show();

		// ����ڲ����Ǿ�̬�ģ���Ա�Ǿ�̬�ġ�
		// Outer.Inner.function();

	}
}
