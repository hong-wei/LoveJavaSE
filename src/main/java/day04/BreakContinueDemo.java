package day04;

class BreakContinueDemo
{
	public static void main(String[] args)
	{
		/***
		 * <pre>
		break:������
		break���õķ�Χ��Ҫô��switch��䣬Ҫô��ѭ����䡣
		��ס����break��䵥������ʱ�����治Ҫ����������䣬��Ϊִ�в�����
			break�������ڵĵ�ǰѭ����
			���������ѭ��Ƕ�ף�break��Ҫ����ָ����ѭ��������ͨ���������ɡ�
		 * </pre>
		 */

		System.out.println("1-------------1");

		for (int x = 0; x < 3; x++)
		{
			if (x == 1)
			{
				break;
			}
			System.out.println("x=" + x);
		} // 0

		System.out.println("2-------------2");

		LabelOuter: for (int x = 0; x < 3; x++) // BK --day04 6��� 3For 1break���
		{
			LabelInner: for (int y = 0; y < 4; y++)
			{
				System.out.println("x=" + x);
				break LabelOuter;
			}
		} // 0

		System.out.println("3-------------3");
		/**
		 * <pre>
		continue:������
		���õķ�Χ��ѭ���ṹ��
		continue����������ѭ���������´�ѭ����
		���continue��������ʱ�����治Ҫ���κ���䣬��Ϊִ�в�����
		 * </pre>
		 */

		for (int x = 0; x < 11; x++)
		{
			if (x % 2 == 0)
			{
				continue;
			}
			System.out.println("x=" + x);
		} // 1 3 5 7 9

		System.out.println("4-------------4");
		LabelOuter: for (int x = 0; x < 2; x++) // BK --day04 6��� 3For 2continue���
		{
			LabelInner: for (int y = 0; y < 3; y++)
			{
				System.out.println("x=" + x);
				continue LabelOuter;
			}
		} // 0 1 2
	}
}
