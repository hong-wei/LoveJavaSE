package day03;

/**
 * <pre>
 * for(��ʼ�����ʽ��ѭ���������ʽ��ѭ����Ĳ������ʽ) {
 * 	   ִ����䣻(ѭ����)
 * }
 * </pre>
 */
class ForDemo
{
	public static void main(String[] args)
	{
		for (int x = 1; x < 3; x++)
		{
			System.out.println("x=" + x);
		}

		int x = 1;
		for (System.out.println("a"); x < 3; System.out.println("c"))
		{
			System.out.println("d");
			x++;
		}
		// a d c d c

		for (int a = 0, b = 0; a < 3; a++, b--)
		{

		}

		int sum = 0;
		for (int i = 0; i < 10; i++)
		{
			sum = sum + i;
		}
		System.out.println(sum);

	}
}
