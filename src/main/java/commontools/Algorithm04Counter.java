package commontools;

public class Algorithm04Counter {
	public static void main(String[] args) {

		/*
		 * ��ϰ�� 1~100֮�� 6�ı������ֵĴ����� Ҫ���Լ��������˼�����д���Ͳ��������������
		 */

		// ������˼��
		// mine:
		int i = 1;
		int sixTimeCount = 0;
		while (i < 100) {
			if (i % 6 == 0)
				sixTimeCount++;
			i++;
		}
		System.out.println("mine is " + sixTimeCount);
	}
}
