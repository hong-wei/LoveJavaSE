package itcastday15.p1.string.demo;

public class StringDemo {
	public static void main(String[] args) {
		//1 String����ص㣺�ַ�������һ������ʼ���Ͳ��ᱻ�ı䡣
		stringDemo1();
		stringDemo2();
	}

	public static void stringDemo2() {
		String s = "abc";                 // ����һ���ַ��������ڳ������С�
		String s1 = new String("abc");    // newһ���ַ��������ڶ��ڴ��С�

		System.out.println(s == s1);      // false����ַ��ͬ��һ���ڶѣ�һ���ڳ����ء�
		System.out.println(s.equals(s1)); // string���е�equals��дObject�е�equals������string���Լ����ж��ַ��������Ƿ���ͬ�����ݡ�
	}

	/**
	 * ��ʾ�ַ�������ĵ�һ�ַ�ʽ������ȷ�ַ��������ص��ص�. ����û�оͽ����������У�ֱ���á�
	 */
	private static void stringDemo1() {
		String s = "abc";// "abc"�洢���ַ����������С�
		// s = "nba";   //�����ı����ã����ܸı��ַ�����ֵ��
		String s1 = "abc";
		System.out.println(s == s1);// true --���ڳ������У�Ӧ�õ�ַһ����
		
		String a2[] = {"ab"};
		String a3[] = {"ab"};
		System.out.println(a2==a3); // false --�ַ������Ƚϵ�ַ
		System.out.println(a2[0]==a3[0]); // true --���ڳ������У�Ӧ�õ�ַһ����
		
		String[] a4 = {"asdf","ab"};
		String a5   = "asdf";
		System.out.println(a4[0]==a5);// true --���ڳ������У�Ӧ�õ�ַһ����
		System.out.println(a4[1]==a2[0]);// true --���ڳ������У�Ӧ�õ�ַһ����
	}

}
