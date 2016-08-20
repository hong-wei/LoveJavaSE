package itcastday16.p4.list.demo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
//		show(list);
		myPractice(list);
	}

	private static void myPractice(List list) {
		//1 add
		list.add("adb");
		list.add(null);
		list.add(null);
		list.add(1, "adb");
		list.set(1, list);
		list.set(1, null);
		list.set(2,"abss");
		System.out.println(list);
		System.out.println(list.size());
		//2 remove
		list.remove(0);
		list.remove(1);
//		list.retainAll(c)
		list.remove((Integer)2);
		list.remove((Integer)2);
//		list.clear();
		//3 modify
		list.set(2, "aa");
		list.set(0, "nnnn");
		System.out.println(list);
		//4 Obtain
		list.get(2);
		list.indexOf(1);
		list.isEmpty();
		list.get(2);
		list.subList(1, 2);
//		list.size();
		list.isEmpty();
		list.indexOf(1);
		list.indexOf(2);
//		list.size();
		list.addAll(list);
		list.subList(0, 1);
	}

	public static void show(List list) {
		//1 ���Ԫ��
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		System.out.println(list);
		String s= null;
		//2 ����Ԫ�ء�
		// list.add(1,"abc9");

		//3 ɾ��Ԫ�ء�
		// System.out.println("remove:"+list.remove(2));

		//4 �޸�Ԫ�ء�
		// System.out.println("set:"+list.set(1, "abc8"));

		// 5 ��ȡԪ�ء�
		// System.out.println("get:"+list.get(0));

		// 6 ��ȡ���б�
		// System.out.println("sublist:"+list.subList(1, 2));

		System.out.println(list);
	}

}
