package itcastday17.p3.arraylist.test;

import java.util.ArrayList;
import java.util.Iterator;

import itcastday17.p.bean.Person;

/*
 * ���幦��ȥ��ArrayList�е��ظ�Ԫ�ء�
 */

public class ArrayListTest2
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		ArrayList<Object> al = new ArrayList<Object>();
		al.add(new Person("lisi1", 21));
		al.add(new Person("lisi2", 22));
		al.add(new Person("lisi3", 23));
		al.add(new Person("lisi4", 24));
		al.add(new Person("lisi2", 22));
		al.add(new Person("lisi3", 23));
		System.out.println(al);

		al = ArrayListTest2.getSingleElement(al);

		System.out.println(al.remove(new Person("lisi2", 22)));
		System.out.println(al);

	}

	public static ArrayList<Object> getSingleElement(ArrayList<Object> al)
	{

		// 1,����һ����ʱ������
		ArrayList<Object> temp = new ArrayList<Object>();

		// 2,����al���ϡ�
		Iterator<Object> it = al.iterator();

		while (it.hasNext())
		{
			Object obj = it.next();
			// 3,�жϱ���������Ԫ���Ƿ�����ʱ�������ڡ�
			if (!temp.contains(obj))
			{
				temp.add(obj);
			}
		}

		return temp;
	}

}
