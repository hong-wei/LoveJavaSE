package day19.p3.toolclass.arrays.demo;

import java.util.Arrays;
import java.util.List;

/**
 * ����ת�ɼ��ϡ�Arrays�����Ͽ�ܵĹ����ࡣ����ķ������Ǿ�̬�ġ�
 *
 * @author zhanghongwei
 *
 */
public class ArraysDemo
{
	public static void main(String[] args)
	{
		int[] arr = { 3, 1, 5, 6, 3, 6 };
		// �������������,Ĭ����class��ʽ
		System.out.println(Arrays.toString(arr));
		System.out.println(arr);

		/**
		 * �ص㣺List asList(����)������ת�ɼ��ϡ�
		 *
		 * �ô�����ʵ����ʹ�ü��ϵķ������������е�Ԫ�ء�
		 *
		 * ע�⣺����ĳ����ǹ̶��ģ����Զ��ڼ��ϵ���ɾ�����ǲ�����ʹ�õ� ����ᷢ��UnsupportedOperationException
		 *
		 */

		String[] arrString = { "abc", "haha", "xixi" };
		// �����ṩ�ķ�������,Ҫ�Լ�д���°�������,����תΪListȥ�ж�
		boolean b = ArraysDemo.myContains(arrString, "xixi");
		System.out.println("contains:" + b);

		List<String> list = Arrays.asList(arrString);
		boolean b1 = list.contains("xixi");
		System.out.println("list contaisn:=" + b1);
		list.set(1, "hiahia");// �����޸�,���ǲ��ܸı䳤��
		// list.add(1, "hiahia");// UnsupportedOperationException

		/**
		 * ��������е�Ԫ���Ƕ�����ôת�ɼ���ʱ��ֱ�ӽ������е�Ԫ����Ϊ�����е�Ԫ�ؽ��м��ϴ洢��
		 *
		 * ��������е�Ԫ���ǻ���������ֵ����ô�Ὣ��������Ϊ�����е�Ԫ�ؽ��д洢��
		 *
		 */

		int[] arrInt = { 31, 11, 51, 61 };
		List<int[]> listInt = Arrays.asList(arrInt);
		System.out.println(listInt);// [[I@7852e922]

		String[] arrString1 = { "abc", "haha", "xixi" };
		List<String> listString = Arrays.asList(arrString1);
		System.out.println(listString); // [abc, haha, xixi]

	}

	public static boolean myContains(String[] arr, String key)
	{
		for (String element : arr)
		{
			if (element.equals(key))
			{
				return true;
			}
		}
		return false;
	}
}
