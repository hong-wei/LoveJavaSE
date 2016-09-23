package day15;

/**
 * ��һ��int[]�������ַ����� eg1����String���˷ѿռ䣬ÿ�ζ�������µ�String�ڳ������С� eg2����StringBuffer�������Ч�ʡ� ����㱣�������Ҫ���ַ�������ʽ��ʹ������stringbuffer ��stringbuilder����ʽ��
 * һ����������ȡ���ľ�ֻ���ַ��������飬�����ȡ���ĸ�ʽһ���ġ�
 *
 * @author zhanghongwei
 * @param arr
 * @return
 *
 */

public class StringBuilderTest
{
	public static void main(String[] args)
	{

		int[] arr = { 3, 1, 5, 3, 8 };
		String s = StringBuilderTest.arrayToString2(arr);
		String s1 = StringBuilderTest.arrayToString(arr);

		System.out.println(s);
		System.out.println(s1);
	}

	public static String arrayToString2(int[] arr)
	{

		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < arr.length - 1; i++)
		{
			sb.append(arr[i] + ", ");
		}
		sb.append(arr[arr.length - 1] + "]");
		return sb.toString();
	}

	public static String arrayToString(int[] arr)
	{

		String str = "[";
		for (int i = 0; i < arr.length - 1; i++)
		{
			str += arr[i] + ", ";
		}
		str += arr[arr.length - 1] + "]";
		return str;
	}

}
