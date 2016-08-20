package itcastday05;

/*
����һ�����飬������з�ת��

{3,1,6,5,8,2} -->
{2,8,5,6,1,3};

��ʵ����ͷβԪ�ص�λ���û���

*/

class ArrayTest
{

	public void reverseArray1(int[] arr)
	{
		for (int i = 0; i < arr.length / 2; i++)
		{
			swap(arr, i, arr.length - 1 - i);
		}
	}

	public void reverseArray(int[] arr)
	{
		for (int start = 0, end = arr.length - 1; start < end; start++, end--)
		{
			swap(arr, start, end);
		}
	}

	public void swap(int[] arr, int a, int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
