package day1234;

//����ʽ
class Single2
{
	private static final Single2 s = new Single2();

	private Single2()
	{
	}

	public static Single2 getInstance()
	{
		return Single2.s;
	}
}

// ����ʽ

// ����ͬ��Ϊ�˽�����̰߳�ȫ���⡣
//
// ����˫���ж���Ϊ�˽��Ч�����⡣

class Single1
{
	private static Single1 s = null;

	private Single1()
	{
	}

	public static Single1 getInstance()
	{
		if (Single1.s == null) // Ч������
		{
			synchronized (Single1.class) // ͬ����ȫ����, ��̬����ֻ�����ֽ���
			{
				if (Single1.s == null)
				{
					// -->0 -->1
					Single1.s = new Single1();
				}
			}
		}
		return Single1.s;
	}
}

class SingleDemo
{
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
	}
}
