package itcastday16.p4.list.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo2 {
	public static void main(String[] args) {

		List list = new ArrayList();

		show(list);

		listSepcialAbtain(list);
		commonAbtain(list);

		 list.clear();
		
		 myTest(list);
		

	}

	/**
	 * common way to get the content of list
	 * not use the item in the iterator and list at the same time.
	 * 
	 * @exception java.util.ConcurrentModificationException
	 * @param list
	 * @throws java.util.ConcurrentModificationException 
	 * 
	 */
	private static void commonAbtain(List list) {
		Iterator it1 = list.iterator();
		while (it1.hasNext()) {
			Object obj = it1.next();
			// �ڵ����������У���Ҫʹ�ü��ϲ���Ԫ�أ����׳����쳣��
			// ����ʹ��Iterator�ӿڵ��ӽӿ�ListIterator������ڵ����ж�Ԫ�ؽ��и���Ĳ�����
			if (obj.equals("abc9")) {
				list.add("abc2"); // java.util.ConcurrentModificationException
			} else
				System.out.println("next:" + obj);
		}
		System.out.println(list);
	}

	public static void show(List list) {
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");

		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println("next:" + it.next());
		}
		// list���е�ȡ��Ԫ�صķ�ʽ֮һ��
		for (int i = 0; i < list.size(); i++) {
			System.out.println("get" + list.get(i));
		}
	}

	/**
	 * @param list
	 */
	private static void listSepcialAbtain(List list) {
		ListIterator it = list.listIterator();// ��ȡ�б����������
		// ������ʵ���ڵ�����������ɶ�Ԫ�ص���ɾ�Ĳ顣
		// ע�⣺ֻ��list���Ͼ߱��õ�������.

		while (it.hasNext()) {
			Object obj = it.next();
			if (obj.equals("abc2")) {
				it.set("abc9");
			}
		}

		System.out.println("hasNext:" + it.hasNext());
		System.out.println("hasPrevious:" + it.hasPrevious());

		while (it.hasPrevious()) {
			System.out.println("previous:" + it.previous());
		}
		System.out.println("list:" + list);
	}

	/**
	 * common way to abtain the ojects in the list. use the iterator interface
	 * <br><br>
	 * Class {@code Object} is the root of the class hierarchy.
     * Every class has {@code Object} as a superclass. All objects,
     * including arrays, implement the methods of this class.
     *
     * @author  unascribed
     * @see     java.lang.Class
     * @since   JDK1.0
	 * @param   list
	 * 
	 */

	private static void myTest(List list) {
		System.out.println("---------My Place---------");
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		// Iterator iterator = list.iterator();
		// System.out.println(list);
		// System.out.println(iterator.next());
		// System.out.println(iterator.next());
		// iterator.remove();
		//// iterator.remove();
		//
		// System.out.println(list);
		// Iterator iterator2 = list.iterator();
		// System.out.println(iterator2.next());
		// System.out.println(iterator2.next());

		// listIterator

		ListIterator listIterator = list.listIterator();
		System.out.println(listIterator.next());
		listIterator.set("a");
		listIterator.set("a");
		listIterator.set("a");
		System.out.println(listIterator.next());
		while (listIterator.hasNext()) {
			Object object = (Object) listIterator.next();
			System.out.println(object);
			// listIterator.remove();
			// listIterator.set("a");
		}
		System.out.println("-----------");
		System.out.println(list.indexOf("a"));
		System.out.println(list.contains("a"));
	}

}
