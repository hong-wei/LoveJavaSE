package commontools;

public class Algorithm03Accumulation
{ // BK --day38 Algorithm-1���Accumulation
	public static void main(String[] args)
	{
		/**
		 * <pre>
		 * ��ϰ�� ��ȡ1��10 10�����ֵĺ͡�
		 *
		 * 0 + 1
		 *     1 + 2
		 *         3 + 3
		 *             6 + 4
		 *                 10 + 5
		 * ˼·��
		 * 1��ÿ�β���ӷ�����ֵ��ȷ����
		 * 2��ÿ�εĳ��ֵĺ�����Ҳ��ȷ����
		 * 3�����ֲ���ӷ��������ֵ�е������ɡ�
		 * 4��ÿһ�ζ��Ǽӷ��������ظ������Ҷ��Ǻ��ټ�����һ����ֵ��
		 *
		 * ���裺
		 * 1������һ����������¼ס����ӷ���������ݡ�
		 * 2������һ����������¼��ÿһ�εĳ��ֵĺ͡�
		 * 3�����ڼ�¼����ӷ���������ݽ���������
		 * 4����Ϊ�ӷ�������Ҫ�ظ�����Ҫ�뵽ѭ���ṹ��
		 * </pre>
		 */

		// �ۼ�˼��-normal ��
		int sum = 0;
		for (int i = 1; i < 101; i++)
		{
			sum = sum + i;
		}
		System.out.println("sum=" + sum);

		// �ۼ�˼��-2,��˹���
		int n = 100;
		int sum1 = 0;
		sum1 = n * (n + 1) / 2;
		System.out.println("sum1 = " + sum1);
	}

}
