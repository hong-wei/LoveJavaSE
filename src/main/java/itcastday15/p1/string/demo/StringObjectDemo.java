package itcastday15.p1.string.demo;

public class StringObjectDemo {
	public static void main(String[] args) {

//		String s1 = "abc";
//		String s2 = "abc";
		
		//intern():���ַ����ؽ��в����� 
		
		String s1 = new String("abc");
		String s2 = s1.intern(); // ���ַ������뵽�������С�
		
		System.out.println(s1==s2);
		
		
		
	}

}
