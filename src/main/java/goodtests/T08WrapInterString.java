package goodtests;

/**
 * �ο���http://www.jianshu.com/p/c7f47de2ee80
 *
 * eg1 line 16 -- 20:/LoveJavaSE/src/itcastday16/p2/wrapper/demo/WrapperDemo2.java
 * answer:jdk1.5�Ժ��Զ�װ�䣬���װ�����һ���ֽڣ���ô�����ݻᱻ���������¿��ٿռ䡣
 *
 */
public class T08WrapInterString
{
	public static void main(String[] args)
	{
		// ��.8�ֻ������͵İ�װ��ͳ�����
		Integer i1 = 40;
		Integer i2 = 40;
		Integer i3 = 0;
		Integer i4 = new Integer(40);
		Integer i5 = new Integer(40);
		Integer i6 = new Integer(0);

		System.out.println("i1=i2   " + (i1 == i2)); // true
		System.out.println("i1=i2+i3   " + (i1 == i2 + i3));// true
		System.out.println("i1=i4   " + (i1 == i4));// false
		System.out.println("i4=i5   " + (i4 == i5));// false
		System.out.println("i4=i5+i6   " + (i4 == i5 + i6)); // false
		System.out.println("40=i5+i6   " + (40 == i5 + i6));// true

		// ��.String��ͳ�����
		/*
		 * ���ӱ��ʽ + ��1��ֻ��ʹ�����Ű����ı��ķ�ʽ������String����֮��ʹ�á�+�����Ӳ������¶���Żᱻ�����ַ������С�
		 * ��2���������а���new��ʽ�½����󣨰���null���ġ�+�����ӱ��ʽ�������������¶��󶼲��ᱻ�����ַ������С�
		 */
		String str1 = "str";
		String str2 = "ing";

		String str3 = "str" + "ing";
		String str4 = "str" + str2; // str1 +str2;
		System.out.println("str3 == str4 " + (str3 == str4));// false

		String str5 = "string";
		System.out.println("str3 == str5 " + (str3 == str5));// true

		// ����1
		final String A = "ab"; // ����A
		final String B = "cd"; // ����B
		String s = A + B; // ������������+���Ӷ�s���г�ʼ��
		String t = "abcd";
		if (s == t)
		{
			System.out.println("s����t��������ͬһ������");
		}
		else
		{
			System.out.println("s������t�����ǲ���ͬһ������");
		}
		// s����t��������ͬһ������,
		// A��B���ǳ�����ֵ�ǹ̶��ģ����s��ֵҲ�ǹ̶��ģ������౻����ʱ���Ѿ�ȷ���ˡ�
		// Ҳ����˵��String s=A+B; ��ͬ�ڣ�String s="ab"+"cd";

		// ����2
		String s1 = new String("�����");
		String s2 = s1.intern();
		String s3 = "�����";
		System.out.println("s1 == s2? " + (s1 == s2)); // false
		System.out.println("s3 == s2? " + (s3 == s2)); // true

	}
}
/*
 * ���ͣ����i4 == i5 + i6����Ϊ+�����������������Integer���� ����i5��i6�����Զ����������������ֵ��ӣ���i4 == 40��
 * Ȼ��Integer�����޷�����ֵ����ֱ�ӱȽϣ�����i4�Զ�����תΪintֵ40�� �����������תΪ40 == 40������ֵ�Ƚϡ�
 *
 */
