package itcastday15.p1.string.test;

/*
 * 3�������ַ����������ͬ���Ӵ���
 * "qwerabcdtyuiop"
 * "xcabcdvbn"
 *
 * ˼·��
 * 1����Ȼȡ��������Ӵ����ȿ��̵��Ǹ��ַ����Ƿ��ڳ����Ǹ��ַ����С�
 * ������ڣ��̵��Ǹ��ַ�����������Ӵ���
 * 2����������أ���ô�ͽ��̵��Ǹ��Ӵ����г��ȵݼ��ķ�ʽȥ�Ӵ���ȥ�������ж��Ƿ���ڡ�
 * ������ھ����ҵ����Ͳ��������ˡ�
 *
 *
 */
public class StringTest_3
{
	public static void main(String[] args)
	{

		// String s1 = "qwerabcdtyuiop";
		// String s2 = "xcabcdbn";
		// String s1 = "abcdeeee";
		// String s2 = "xabcyy";
		String s1 = "accde";
		String s2 = "bcadsss";// bcd bc d

		String s = StringTest_3.getMaxSubstring(s2, s1);
		System.out.println("s=" + s);
	}

	/**
	 * ��ȡ����Ӵ�
	 *
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static String getMaxSubstring(String s1, String s2)
	{

		String max = null, min = null;
		max = (s1.length() > s2.length()) ? s1 : s2;

		min = max.equals(s1) ? s2 : s1;

		System.out.println("max=" + max);
		System.out.println("min=" + min);

		for (int i = 0; i < min.length(); i++)
		{ //

			for (int a = 0, b = min.length() - i; b != min.length() + 1; a++, b++)
			{// a=0,b=8,a=1,b=9
				String sub = min.substring(a, b);// a=0,b=8
				System.out.println(sub);
				if (max.contains(sub))
				{
					return sub;
				}
			}
		}

		return null;
	}
}
