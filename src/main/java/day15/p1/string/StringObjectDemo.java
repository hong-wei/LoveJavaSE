package day15.p1.string;

public class StringObjectDemo
{
	public static void main(String[] args)
	{

		// String s1 = "abc";
		// String s2 = "abc";

		// intern():���ַ����ؽ��в�����

		String s1 = new String("abc");
		String s2 = s1.intern(); // ���ַ������뵽��������,�ٸ�ֵ��s2
		String s3 = "abc";
		System.out.println(s1 == s2);// s1�ڶ��У�s2�ٶ������
		System.out.println(s3 == s2);// s1�ڶ��У�s2�ٶ������

	}

}
