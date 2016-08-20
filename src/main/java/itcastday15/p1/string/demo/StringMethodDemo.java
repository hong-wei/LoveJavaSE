package itcastday15.p1.string.demo;

import javax.security.auth.x500.X500Principal;

public class StringMethodDemo {
	public static void main(String[] args) {
		System.out.println("-----------------1,��ȡ------------------");
		stringMethodDemo_1();
		System.out.println("-----------------2,ת��------------------");
		stringMethodDemo_2();
		System.out.println("-----------------3,�ж�------------------");
		stringMethodDemo_3();
		System.out.println("-----------------4,�Ƚ�------------------");		
		stringMethodDemo_4();
		
		

	}

	private static void stringMethodDemo_4() {

		System.out.println("abc".compareTo("aqz"));
	}

	private static void stringMethodDemo_3() {
		String s = "abc";
	
		System.out.println(s.equals("ABC".toLowerCase()));
		System.out.println(s.equalsIgnoreCase("ABC"));

		System.out.println(s.contains("cc"));

		String str = "ArrayDemo.java";

		System.out.println(str.startsWith("Array"));
		System.out.println(str.endsWith(".java"));
		System.out.println(str.contains("Demo"));
	}

	private static void stringMethodDemo_2() {

		String s = "����,����,����";
		//0 my practice
		// 2.1 ���ַ�������ַ�������
		String[] split = s.split(",");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		// 2.2 ���ַ�������ַ����顣
		char[] charArray = s.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			char c = charArray[i];
			System.out.println(c);
		}
		// 2.3 ���ַ�������ֽ����顣
		s = "ab��";
		byte[] bytes2 = s.getBytes();
		for (int i = 0; i < bytes2.length; i++) {
			byte b = bytes2[i];
			System.out.println(b);
		}
		// 2.4 ���ַ����е���ĸת�ɴ�Сд��
		System.out.println("Abc".toUpperCase());
		System.out.println("Abc".toLowerCase());
		// 2.5 ���ַ����е����ݽ����滻
		String s1 = "java";
		String s2 = s1.replace('q', 'z');
		System.out.println(s1 == s2);// true
		// 2.6 ���ַ������˵Ŀո�ȥ����
		System.out.println("    -   ".trim() + "    ab  c    ".trim() + "   -   ".trim());
		//2.7 ���ַ����������� ��
		 System.out.println("abc".concat("kk"));
		 System.out.println("abc"+"kk");
		// 2.8 ��̬�������ѱ��ֵ��Ϊ�ַ���
		 System.out.println(String.valueOf(4)+1);
		 System.out.println(""+4+1);
	}
	private static void stringMethodDemo_1() {
		String s = "abcdae";
		System.out.println("length:" + s.length());    // 6
		System.out.println("char:" + s.charAt(1));     // c//StringIndexOutOfBoundsException
		System.out.println("index:" + s.indexOf('k')); // 0//-1
													   // ���ǿ��Ը���-1�����жϸ��ַ������ַ����Ƿ���ڡ�
		System.out.println("lastIndex:" + s.lastIndexOf("aa"));// 4
		System.out.println("lastIndex:" + s.lastIndexOf('a'));// 4

		System.out.println("substring:" + s.substring(2, 4));
		s.length();
		s.charAt(3);
		s.indexOf('1');
		s.substring(2);
		
	}

}
