package algorithms;

import java.util.Arrays;

public class A10ArrayTableLookup
{
	// BK --day05 8Array 2A10����ת�� ���
	public static void main(String[] args)
	{
		toHex(0xff);
		// toBinary(-6);
		// toOctal(26);
	}

	// ʮ����-->�����ơ�
	public static void toBinary(int num)
	{
		trans(num, 1, 1);
	}

	// ʮ����-->ʮ�����ơ�
	public static void toHex(int num)
	{
		trans(num, 15, 4);
	}

	// ʮ����-->�˽��ơ�
	public static void toOctal(int num)
	{
		trans(num, 7, 3);
	}

	public static void trans(int num, int base, int offset)
	{

		if (num == 0)
		{
			System.out.println("0");
			return;
		}
		// ����һ����Ӧ��ϵ��
		char[] chs = { //
				'0', '1', '2', '3', //
				'4', '5', '6', '7', //
				'8', '9', 'A', 'B', //
				'C', 'D', 'E', 'F' };//
		/*
		 * һ�����鵽�Ƚϵ����ݡ� ����һ�࣬���ȴ洢�������ڽ��в����� ���Զ���һ�����顣 ��ʱ������
		 */
		char[] arr = new char[32];
		int pos = arr.length;

		while (num != 0)
		{
			int temp = num & base;// base =1111 num=ff
			arr[--pos] = chs[temp];// pos = arr.length;
			num = num >>> offset;
		}

		System.out.print(Arrays.toString(arr));

	}

}
