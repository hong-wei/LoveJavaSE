package day11;

class ExceptionDemo
{
	public static void main(String[] args)
	{
		int[] arr = new int[1024 * 1024];// java.lang.OutOfMemoryError: Java heap space
		// arr = null;
		// System.out.println(arr[3]);
		//
		//
		// sleep(-5);
	}

	public static void sleep2(int time)
	{
		if (time < 0)
		{
			// ����취��
			// ����취��
			// ����취��
			// ����취��
			// ����취��
		}
		if (time > 100000)
		{
			// ����취��
			// ����취��
			// ����취��
			// ����취��
			// ����취��
			// ����취��
		}
		System.out.println("��˯������" + time);

		// sleep(-5);
	}

	public static void sleep(int time)
	{
		if (time < 0)
		{
			// �׳� new FuTime();//�ʹ�����ʱ��Ϊ�����������������л��������������ƣ���Ϣ��λ�õ���Ϣ��
		}
		if (time > 100000)
		{
			// �׳� new BigTime();
		}
		System.out.println("��˯������" + time);
	}
}
/*
 * class FuTime { } class BigTime { }
 */