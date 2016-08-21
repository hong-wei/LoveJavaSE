package itcastday05;

/*
	�����⣺ answer is BinarySearchInterview. only care about the arrMin.
	����һ����������飬������������д洢һ��Ԫ�أ�����֤������黹������ģ�
	��ô��Ԫ�صĴ洢�ĽǱ�Ϊ��λ�ȡ��
	{13,15,19,28,33,45,78,106};
*/
class ArrayDemo5
{
	/*
	 * ���ֲ��ҷ���
	 *
	 */
	public int halfSearch(int[] arr, int key)
	{
		int max, min, mid;
		min = 0;
		max = arr.length - 1;
		mid = (max + min) / 2;

		while (arr[mid] != key)
		{
			if (key > arr[mid])
			{
				min = mid + 1;
			}
			else if (key < arr[mid])
			{
				max = mid - 1;
			}

			if (max < min)
			{
				return -1;
			}

			mid = (max + min) / 2;
		}
		return mid;

	}

	public int halfSearch_2(int[] arr, int key)
	{
		int max, min, mid;
		min = 0;
		max = arr.length - 1;

		while (min <= max)
		{
			mid = (max + min) / 2;

			if (key > arr[mid])
			{
				min = mid + 1;
			}
			else if (key < arr[mid])
			{
				max = mid - 1;
			}
			else
			{
				return mid;
			}
		}
		return -min - 1;
	}

	/*
	 * ���鳣�����ܣ����ҡ�
	 */
	public int getIndex(int[] arr, int key)
	{
		for (int x = 0; x < arr.length; x++)
		{
			if (arr[x] == key)
			{
				return x;
			}
		}
		return -1;
	}
}
