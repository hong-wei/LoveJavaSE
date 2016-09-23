package day15;

import java.util.Arrays;

/*
 * ��һ���ַ����е���ֵ���д�С���������
 *
 * "20 78 9 -7 88 36 29"
 *
 * ˼·��
 * 1�������Һ��졣������ֻ��int��
 * 2����λ�ȡ������ַ����е���Щ��Ҫ�������ֵ��
 * ��������ַ�������ʵ���ǿո�������ֵ���зָ��ġ�
 * ���Ծ��뵽���ַ���������и�����󴮱�ɶ��С����
 * 3����ֵ���ձ��С�ַ�������ô���һ��int���أ�
 * �ַ���-->�������� ����ʹ�ð�װ�ࡣ
 *
 */

public class WrapperTest
{

	private static final String SPACE_SEPARATOR = " ";

	public static void main(String[] args)
	{

		String numStr = "20 78 9 -7 88 36 29";
		rankString(numStr);
		numStr = sortStringNumber(numStr);
		System.out.println(numStr);

	}

	/**
	 * 1 ���int������ 2 �������� 3 String ��� String [];
	 *
	 * @param numStr
	 */
	private static void rankString(String numStr)
	{
		String[] numStr1 = numStr.split(" ");
		for (int i = 0; i < numStr1.length - 1; i++)
		{
			for (int j = i + 1; j < numStr1.length; j++)
			{
				if (Integer.parseInt(numStr1[i]) > Integer.parseInt(numStr1[j]))
				{
					swap(numStr1, i, j);
				}
			}
		}
		for (String string : numStr1)
		{
			System.out.print(string + " ");
		}
		System.out.println();
	}

	private static void swap(String[] numStr1, int i, int j)
	{
		String s1 = numStr1[i];
		numStr1[i] = numStr1[j];
		numStr1[j] = s1;
	}

	public static String sortStringNumber(String numStr)
	{

		// 1,���ַ�������ַ������顣
		String[] str_arr = stringToArray(numStr);

		// 2,���ַ���������int���顣

		int[] num_arr = toIntArray(str_arr);

		// 3,��int��������
		mySortArray(num_arr);

		// 4,��������int�������ַ�����

		String temp = arrayToString(num_arr);

		return temp;
	}

	public static String arrayToString(int[] num_arr)
	{

		StringBuilder sb = new StringBuilder();
		for (int x = 0; x < num_arr.length; x++)
		{
			if (x != num_arr.length - 1)
			{
				sb.append(num_arr[x] + SPACE_SEPARATOR);
			}
			else
			{
				sb.append(num_arr[x]);
			}
		}

		return sb.toString();
	}

	public static void mySortArray(int[] num_arr)
	{

		Arrays.sort(num_arr);
	}

	public static int[] toIntArray(String[] str_arr)
	{

		int[] arr = new int[str_arr.length];

		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = Integer.parseInt(str_arr[i]);
		}

		return arr;
	}

	public static String[] stringToArray(String numStr)
	{
		String[] str_arr = numStr.split(SPACE_SEPARATOR);

		return str_arr;
	}

}
