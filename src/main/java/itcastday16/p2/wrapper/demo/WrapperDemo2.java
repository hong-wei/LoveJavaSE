package itcastday16.p2.wrapper.demo;

public class WrapperDemo2 {
	public static void main(String[] args) {

		int num = 4;
		num = num + 5;
		//1 �Զ�װ��
		Integer i = 4;// i = new Integer(4);�Զ�װ�� ����д��
		i = i + 6;    // i = new Integer(i.intValue() + 6); 
					  // i.intValue() �Զ�����
		//1.1 ʹ��ע�⣺
//		Integer i1 = null;// i1=null,�� java.lang.NullPointerException
//		i1 = i1 + 6; 
		
		//1.2 ��ʽ��������
		show(55);

		//2 С��1Byte �Ὺ�ٹ���ռ�
		Integer a = new Integer(127);
		Integer b = new Integer(127);

		System.out.println(a == b);     // false
		System.out.println(a.equals(b));// true

		Integer x = 127;           // jdk1.5�Ժ��Զ�װ�䣬���װ�����һ���ֽڣ���ô�����ݻᱻ���������¿��ٿռ䡣
		Integer y = 127;
		System.out.println(x == y);//
		System.out.println(x.equals(y));// true
		
		Integer x1 = 128;// jdk1.5�Ժ��Զ�װ�䣬���װ�����һ���ֽڣ���ô�����ݻᱻ���������¿��ٿռ䡣
		Integer y1 = 128;
		System.out.println(x1 == y1);//
		System.out.println(x1.equals(y1));// true

	}

	public static void show(Object a) {// Object a = new Integer(55);
		System.out.println("a=" + a);
	}

}
