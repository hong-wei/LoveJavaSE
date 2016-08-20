package goodtests;

public class T04ArrayHalfSearchTest 
{
	public static void main(String[] args) 
	{
		/*
		�����⣺ 
		question?
			����һ����������飬������������д洢һ��Ԫ�أ�����֤������黹������ģ�
			��ô��Ԫ�صĴ洢�ĽǱ�Ϊ��λ�ȡ��
			{13,15,19,28,33,45,78,106};
		answer:
			answer is halfSearchInterview. only care about the arrMin.
		
	*/
		int[] arr = {13, 15, 19, 28, 33, 45, 78, 106 };
		
		System.out.println(halfSearchInterview(arr, 0));
		System.out.println(halfSearchInterview(arr, 50));
		System.out.println(halfSearchInterview(arr, 14));
		System.out.println(halfSearchInterview(arr, 200));
		
	}
	
	private static int halfSearchInterview(int[] arr, int key) {
		int arrMax,arrMin,arrMid;
		arrMax=arr.length-1;
		arrMin=0;
		arrMid=(arrMax+arrMin)/2;
		
		while(arrMax>=arrMin){
			if(key>arr[arrMid])
				arrMin=arrMid+1;
			else if(key<arr[arrMid])
				arrMax=arrMid-1;
			else {
				return arrMid;
			}
			arrMid=(arrMax+arrMin)/2;
		}
		return arrMin;
	}
}
