package itcastday03;

class ForTest
{
	public static void main(String[] args)
	{
		/*
		 * ��for����ۼӡ�
		 */
		int sum = 0;
		for (int i = 0; i < 10; i++)
		{
			sum += i;
		}

		System.out.println("sum=" + sum);

		// for get the 6 times from 1--100
		int sixCounter = 0;

		for (int i = 1; i < 100; i++)
		{
			if (i % 6 == 0)
			{
				sixCounter++;
			}
		}
		System.out.println("six times is " + sixCounter);

		/**
		 * <pre>
		 * for��while���ص㣺
			1,for��while���Ի�����
			2,��ʽ�ϵĲ�ͬ����ʹ�����е�С���� �����Ҫͨ����������ѭ�����п��ƣ��ñ���ֻ��Ϊѭ����������ʱ����������ֳ����ˡ�
			3,they are mostly the same ,just make a difference for the people to read.
		 * </pre>
		 */

		// ��ӡ1~10ʮ������
		int x = 1;
		while (x < 10)
		{
			System.out.println("x=" + x);
			x++;
		}
		System.out.println("x====" + x);

		int y = 1;
		for (; y < 10;)
		{
			System.out.println("y=" + y);
			y++;
		}
		System.out.println("y====" + y);
		// ����ѭ����򵥵���ʽ��
		// while(true){}

		// for(;;){}

	}
}
