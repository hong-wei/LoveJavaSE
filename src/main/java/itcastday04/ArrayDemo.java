package itcastday04;

class ArrayDemo
{
	public static void main(String[] args)
	{
		// Ԫ������[] ������ = new Ԫ������[Ԫ�ظ��������鳤��];

		{// �ֲ�����顣�޶��ֲ��������������ڡ�
			int age = 3;
			System.out.println(age);
		}

		char[] charArray = new char[5];
		System.out.println(charArray[0]); // default initialization

		int[] arr = new int[3];
		System.out.println(arr[0]); // default initialization

		int[] a = new int[3];
		int[] a1 = new int[] { 1, 2, 3 };
		int[] a2 = { 1, 2, 3 };
		Demo99[] d1 = new Demo99[3]; // array save class references
	}
}
