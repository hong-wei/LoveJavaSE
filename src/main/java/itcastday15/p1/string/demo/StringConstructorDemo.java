package itcastday15.p1.string.demo;

public class StringConstructorDemo
{

	public static void main(String[] args)
	{
		// 1 �ղ���
		String s = new String();// ��Ч��String s = ""; ����ЧString s = null;
		String s1 = " "; // "" �ǿ��ַ���������" ",ǰ��û���ַ���ռ�ռ�ġ�"'\\u000'"
		String s2 = null;
		System.out.println(s.equals(s1));// ture
		System.out.println(s.equals(s2));// ture

		StringConstructorDemo.stringConstructorDemo();
		StringConstructorDemo.stringConstructorDemo2();
		StringConstructorDemo.stringConstuctorDemo3();

	}

	/**
	 * 2���ֽ�����ת���ַ�������ͨ��String��Ĺ��캯����ɡ�
	 */
	public static void stringConstructorDemo()
	{
		byte[] byteArray = { 97, 98, 99, 65 };
		String s = new String(byteArray);
		String s1 = new String(byteArray, 1, 3);
		System.out.println(s);
		System.out.println(s1);

		int[] intArray = { 1, 2, 3, 4 };
		String s3 = new String(intArray, 1, 3);
		System.out.println("-----s3: " + s3);

	}

	/**
	 * 3�ַ�����ת���ַ�������ͨ��String��Ĺ��캯����ɡ�
	 */
	public static void stringConstructorDemo2()
	{
		char[] arr = { 'w', 'a', 'p', 'q', 'x' };
		String s = new String(arr);
		String s1 = new String(arr, 1, 3);
		System.out.println("s=" + s);
		System.out.println("s1=" + s1);
		String s2 = new String();
		String s4 = new String(arr);

	}

	/**
	 * 4 ��StringBuilder ��StringBuffer����String
	 */
	public static void stringConstuctorDemo3()
	{

		StringBuffer s4 = new StringBuffer(97);// ����Ĭ��buffer��С
		System.out.println(s4.length());
		s4.append("").append(" ").append("1");
		System.out.println(s4.length());

		String s5 = new String(s4); // copy s4��s5
		System.out.println(s5.length());

		StringBuilder s6 = new StringBuilder(97);// ����Ĭ��Builder��С
		System.out.println(s4.length());

		String s7 = new String(s6); // copy s4��s5
		System.out.println(s7.length());
	}

}
