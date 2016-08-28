package itcastday16.p4.list.demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();
		// 1 ���Ԫ��
		list.add("abc1");
		list.add("abc55");
		List<String> linkedList = new LinkedList<String>();
		linkedList.add("aa");

		list.add("abc2");
		list.add("abc3");
		System.out.println(list);
		// 2 ����Ԫ�ء�
		list.set(2, "abc9");

		// 3 ɾ��Ԫ�ء�
		System.out.println("remove:" + list.remove(2));

		// 4 �޸�Ԫ�ء�
		System.out.println("set:" + list.set(1, "abc8"));

		// 5 ��ȡԪ�ء�
		System.out.println("get:" + list.get(0));

		// 6 ��ȡ���б�
		System.out.println("sublist:" + list.subList(1, 2));

		System.out.println(list);
	}

}
