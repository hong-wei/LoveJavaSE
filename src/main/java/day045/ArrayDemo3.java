package day045;

class ArrayDemo3
{
	public static void main(String[] args)
	{
		// ��ʽ1 -- ��Ҫһ�����������ǲ���ȷ�����ľ������ݡ�
		// int[] arr = new int[3];

		// ��ʽ2 -- ��Ҫһ���������洢��֪�ľ������ݡ�
		// Ԫ������[] ������ = new Ԫ������[]{Ԫ�أ�Ԫ�أ�����};
		int[] arr = new int[] { 89, 34, 270, 17 };// Dynamic value: Run step
		int[] arr1 = { 89, 34, 270, 17 }; // static value :compile step
		// ���������������Ķ������Ǵ��ȡ�� ����˼�룺���ǶԽǱ�Ĳ�����
		System.out.println("length:" + arr.length);
		System.out.println(arr[arr.length - 1]);

		for (int x = 0; x < arr.length; x++)
		{
			System.out.print("arr[" + x + "] = " + arr[x] + ";");// arr[0] =
		}
		System.out.println();
		for (int x = arr.length - 1; x >= 0; x--)
		{
			System.out.print("arr[" + x + "] = " + arr[x] + ";");// arr[0] = 89;
		}
	}
}
