package commontools;

public class Algorithm07ArrayMaxMin {
	public static void main(String[] args) {		
		int[] arr = new int[]{34, 19, 11, 109, 3, 56 };
		// lecture
		int max = getMax(arr);
		System.out.println("max="+max);
		int max_2 = getMax_2(arr);
		System.out.println("max="+max_2);
	}
	public static int getMax(int[] arr) {
		// ���������¼�ϴ��ֵ��
		int maxElement = arr[0];// ��ʼ��Ϊ�����е�����һ��Ԫ�ء�
		for (int x = 1; x < arr.length; x++) {
			if (arr[x] > maxElement)
				maxElement = arr[x];
		}
		return maxElement;
	}

	public static int getMax_2(int[] arr) {
		// ���������¼�ϴ��ֵ��
		int maxIndex = 0;// ��ʼ��Ϊ����������һ���Ǳꡣ
		for (int x = 1; x < arr.length; x++) {
			if (arr[x] > arr[maxIndex])
				maxIndex = x;
		}
		return arr[maxIndex];
	}
}
