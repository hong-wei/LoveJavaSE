package algorithms;

public class Algorithm02BitsSwap
{
	/*
	 * ��һ�����������һ���ֽڣ�����λ�͵���λ���л�λ�� int num = 0101-1100 & 255; 1100-0101
	 * 
	 * 61 = 0011-1101 1101-0011 = 211
	 * 
	 */
	public static void main(String[] args)
	{
		int num = 61;

		int n1 = num & 15; // ����λ
		int n2 = num & (15 << 4);// ����λ

		int n = n1 << 4 | n2 >>> 4;

		System.out.println("n=" + n);
	}

}
