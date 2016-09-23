package day11;

class FuShuIndexException4 extends Exception
{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	FuShuIndexException4()
	{
	}

	FuShuIndexException4(String msg)
	{
		super(msg);
	}
}

class Demo4
{
	public int method(int[] arr, int index) throws FuShuIndexException4
	{
		if (arr == null)
		{
			throw new NullPointerException("û���κ�����ʵ��");
		}
		if (index < 0)
		{
			throw new FuShuIndexException4();
		}

		return arr[index];
	}
}

class ExceptionDemo4
{
	public static void main(String[] args)
	{
		int[] arr = new int[3];
		Demo4 d = new Demo4();
		try
		{
			int num = d.method(arr, -1);
			System.out.println("num=" + num);
		}
		catch (NullPointerException e)
		{
			System.out.println(e.toString());
		}
		catch (FuShuIndexException4 e)
		{
			System.out.println("message:" + e.getMessage());
			System.out.println("string:" + e.toString());
			System.out.println("string:" + e.getCause());
			e.printStackTrace();// JVMĬ�ϵ��쳣������ƾ��ǵ����쳣��������������

			System.out.println("�����Ǳ��쳣!!!!");
		}
		/*
		 * catch(Exception e)//��catch�����catch���������档 {
		 *
		 * }
		 */
		System.out.println("over");
	}

}
