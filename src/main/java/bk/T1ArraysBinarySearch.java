package bk;
import java.util.Arrays;

public class T1ArraysBinarySearch {
	public static void main(String[] args) {
		//1 
		int [] arr ={1,2,3,4,5,7,8};
		int index = Arrays.binarySearch(arr, 5);
		System.out.println(index);
		
		int index1 = Arrays.binarySearch(arr,6); // return : the right point-1;because of the arr[0] has value.
		System.out.println(index1);				// ������ڷ��صľ���ĽǱ�λ�ã������ڷ��ص���
												// -�����-1: �����ء�-����㡱�����һ�����������:����5���᷵��0��
	}

}
