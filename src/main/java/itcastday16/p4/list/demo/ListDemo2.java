package itcastday16.p4.list.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo2
{
	public static void main(String[] args)
	{

		List<String> list = new ArrayList<String>();

		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");

		Iterator<String> it = list.iterator();
		while (it.hasNext())
		{
			System.out.println("next:" + it.next());
		}
		// list���е�ȡ��Ԫ�صķ�ʽ֮һ��������һ�������Ǳꡣ
		for (int i = 0; i < list.size(); i++)
		{
			System.out.println("get" + list.get(i));
		}

		ListDemo2.commonAbtain(list);
		ListDemo2.listSepcialAbtain(list);

	}

	/**
	 * common way to get the content of list not use the item in the iterator and list at the same time.
	 *
	 * @exception java.util.ConcurrentModificationException
	 * @param list
	 * @throws java.util.ConcurrentModificationException
	 *
	 */
	private static void commonAbtain(List<String> list)
	{
		Iterator<String> it1 = list.iterator();
		while (it1.hasNext())
		{
			Object obj = it1.next();
			// �ڵ����������У���Ҫʹ�ü��ϲ���Ԫ�أ����׳����쳣��
			// ����ʹ��Iterator�ӿڵ��ӽӿ�ListIterator������ڵ����ж�Ԫ�ؽ��и���Ĳ�����
			if (obj.equals("abc9"))
			{
				// list.add("abc2"); // java.util.ConcurrentModificationException
			}
			else
			{
				System.out.println("next:" + obj);
			}
		}
		System.out.println(list);
	}

	/**
	 * @param list
	 */
	private static void listSepcialAbtain(List<String> list)
	{
		ListIterator<String> it = list.listIterator();// ��ȡ�б����������

		// ע�⣺ֻ��list���Ͼ߱��õ�������.

		while (it.hasNext())
		{
			Object obj = it.next();
			if (obj.equals("abc2"))
			{
				it.add("abc9"); // ������ʵ���ڵ�����������ɶ�Ԫ�ص���ɾ�Ĳ顣
			}
		}

		System.out.println("hasNext:" + it.hasNext());
		System.out.println("hasPrevious:" + it.hasPrevious());

		while (it.hasPrevious())
		{
			System.out.println("previous:" + it.previous());
		}
		System.out.println("list:" + list);
	}

}
