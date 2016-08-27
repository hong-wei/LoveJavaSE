package itcastday17.p2.linkedlist.demo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		LinkedList<String> link = new LinkedList<String>();

		// 1������
		link.addFirst("abc1");
		link.add(1, "abc5");
		link.addFirst("abc2");
		link.addFirst("abc3");
		link.addFirst("abc4");
		link.offerFirst("abc5");
		link.offerLast("abc6");
		// 2��ɾ��
		link.removeFirst();// ��ȡ���Ƴ����������Ϊ�գ��׳�NoSuchElementException.
		link.removeLast();
		link.pollFirst();// ��ȡ���Ƴ����������Ϊ�գ�����null.
		link.pollLast();

		link.remove("abc4");
		link.remove(2);

		// 3,��
		link.set(2, "abc7");

		// 4����
		link.get(2);
		link.getFirst();// ��ȡ�����Ƴ����������Ϊ�գ��׳�NoSuchElementException.
		link.getLast();
		link.peekFirst();// ��ȡ�����Ƴ����������Ϊ�գ�����null.
		link.peekLast();
		System.out.println(link.getFirst()); // ��ȡ��һ������ɾ����
		System.out.println(link.getFirst());

		System.out.println(link.removeFirst());// ��ȡԪ�ص��ǻ�ɾ����
		System.out.println(link.removeFirst());

		System.out.println(link);
		Iterator<String> it = link.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}

		while (!link.isEmpty())
		{
			System.out.println(link.removeLast());
		}

	}

}
