package algorithms;

//BK --day02 5Operators 3λ����
public class A02BitsSwap
{
	/*
	 * ��һ�����������һ���ֽڣ�����λ�͵���λ���л�λ�� int num = 0101-1100 & 255; 1100-0101
	 *
	 * 61 = 0011-1101 1101-0011 = 211
	 *
	 */
	public static void main(String[] args)
	{

		// ����Ч�ʵķ�ʽ���2����8���ڼ���
		System.out.println(2 << 3);

		int num = 61;

		int n1 = num & 15; // ����λ
		int n2 = num & (15 << 4);// ����λ

		int n = n1 << 4 | n2 >>> 4;

		System.out.println("n=" + n);
	}
}
