package itcastday03;

class WhileTest2
{
	public static void main(String[] args)
	{

		/**
		 * <pre>
		��ϰ��
		1~100֮�� 6�ı������ֵĴ�����
		Ҫ���Լ��������˼�����д���Ͳ��������������
		 * </pre>
		 */
		int x = 1;
		int count = 0;
		while (x <= 100)
		{
			if (x % 6 == 0)
			{
				count++;
			}
			x++;
		}
		System.out.println("count=" + count);
	}
}
