package day04;

class FunctionDemo
{

	// �ӷ����㡣����С���ĺ͡�
	public static void add(Double... arr)
	{
		double sum = 0;
		for (Double double1 : arr)
		{
			sum += double1;
		}
		System.out.println(sum);
	}

	// �ӷ����㡣���������ĺ͡�
	public static int add(int a, int b) // BK --day04 7Functions 1Overload
	{
		return a + b;
	}

	// �ӷ����㣬���������ĺ͡�
	public static int add(int a, int b, int c)
	{
		return add(a, b) + c;
	}

	public static void main(String[] args)
	{
		add(4, 6, 9);
		add(4, 6, 9, 10, 11);
		add(4.12, 6.12);
	}

	private static void add(Integer... arr)
	{
		int sum = 0;
		for (Integer element : arr)
		{
			sum += element;
		}
		System.out.println(sum);
	}

}
