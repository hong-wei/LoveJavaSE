package day16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo
{

	public static void main(String[] args)
	{
		Collection<String> c1 = new ArrayList<String>();
		Collection<String> c2 = new ArrayList<String>();

		// 1 ���Ԫ�ء�
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");

		c2.add("abc3");
		c2.add("abc1");
		c2.add("abc2");
		// c2.add("abc4");
		// c2.add("abc5");
		c1.containsAll(c2);

		// ��ʾaddAll
		c1.addAll(c2);// ��c2�е�Ԫ����ӵ�c1�С�

		// 2��ɾ��Ԫ�ء�remove
		c1.remove("abc2");// ��ı伯�ϵĳ���
		// ��ʾremoveAll
		boolean b = c2.removeAll(c1);// �����������е���ͬԪ�شӵ���removeAll�ļ�����ɾ����
		System.out.println("removeAll:" + b);
		// ��ռ���.
		c2.clear();

		// 3���ж�
		System.out.println(c1.contains("abc3"));
		// ��ʾcontainsAll

		System.out.println("containsAll:" + b);

		// 4, ��ȡ��
		c1.size();

		// 4.1 ʹ����Collection�е�iterator()����,���ü����еĵ�������������Ϊ�˻�ȡ�����еĵ���������
		Iterator<String> iteratorWhile = c1.iterator();
		while (iteratorWhile.hasNext())
		{
			final String next = iteratorWhile.next();
			System.out.println(next); // java.util.NoSuchElementException
		}

		System.out.println(c1.size());

		// 4.2 use the for loop
		for (Iterator<String> iteratorFor = c1.iterator(); iteratorFor.hasNext();)
		{
			System.out.println(iteratorFor.next());
		}

		// 5 ����
		// ��ʾretainAll,��removeAll�����෴ ��
		b = c1.retainAll(c2);// ȡ������������ָ���ļ�����ͬ��Ԫ�أ���ɾ����ͬ��Ԫ�ء�
		System.out.println("retainAll:" + b);
		System.out.println("c1:" + c1);

	}

}
