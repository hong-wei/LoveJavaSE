package day15;

public class WrapperDemo2
{
	public static void main(String[] args)
	{

		int num = 4;
		num = num + 5;
		// 1 �Զ�װ��
		Integer i = 4;// i = new Integer(4);�Զ�װ�� ����д��
		i = i + 6; // i = new Integer(i.intValue() + 6);
					// i.intValue() �Զ�����
		// 1.1 ʹ��ע�⣺
		// Integer i1 = null;
		// i1=null,�� java.lang.NullPointerException
		// i1 = i1 + 6;

		// 1.2 ��ʽ��������
		Integer input = 1; // BK --day06 Class 2��������&���ò��� 1Integer
		show(input); // answer:Final -> look inside Inter-- private final int value;
		Integer input1 = input;
		input1 = 3;
		StringBuilder stringBuilder = new StringBuilder("hongwei");
		show2(stringBuilder);

		// 2 С��1Byte �Ὺ�ٹ���ռ�

		Integer x = 127; // jdk1.5�Ժ��Զ�װ�䣬���װ�����һ���ֽڣ���ô�����ݻᱻ���������¿��ٿռ䡣
		Integer y = 127;
		System.out.println(x == y);//
		System.out.println(x.equals(y));// true

		Integer x1 = 128;// jdk1.5�Ժ��Զ�װ�䣬���װ�����һ���ֽڣ���ô�����ݻᱻ���������¿��ٿռ䡣
		Integer y1 = 128;
		System.out.println(x1 == y1);//
		System.out.println(x1.equals(y1));// true

	}

	private static void show2(StringBuilder stringBuilder)
	{
		stringBuilder = stringBuilder.append("yanlu");
	}

	public static void show(Integer a)
	{
		a = 666;
		System.out.println("a=" + a);
	}

}
