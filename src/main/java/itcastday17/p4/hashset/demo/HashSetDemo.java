package itcastday17.p4.hashset.demo;

import java.util.HashSet;
import java.util.Iterator;

import itcastday17.p.bean.Person;

public class HashSetDemo
{
	public static void main(String[] args)
	{

		// Store String
		HashSet<String> hs = new HashSet<String>();

		hs.add("hehe");
		hs.add("heihei");
		hs.add("hahah");
		hs.add("xixii");
		hs.add("hehe");

		Iterator<String> it = hs.iterator();

		while (it.hasNext())
		{
			System.out.println(it.next());
		}

		// Store Classes
		HashSet<Person> hsPerson = new HashSet<Person>();

		// ��hashSet�����д洢Person����:���������������ͬ����Ϊͬһ���ˡ���Ϊ��ͬԪ�ء�

		// Summary:
		// HashSet�������ݽṹ�ǹ�ϣ�����Դ洢Ԫ�ص�ʱ��
		// 1 ʹ�õ�Ԫ�ص�hashCode������ȷ��λ��.
		// 2 ���λ����ͬ����ͨ��Ԫ�ص�equals��ȷ���Ƿ���ͬ��
		hsPerson.add(new Person("lisi4", 24));
		hsPerson.add(new Person("lisi7", 27));
		hsPerson.add(new Person("lisi1", 21));
		hsPerson.add(new Person("lisi9", 29));
		hsPerson.add(new Person("lisi7", 27));
		hsPerson.add(new Person("lisi7", 27));
		hsPerson.add(new Person("lisi7", 27));
		hsPerson.add(new Person("lisi7", 27));

		Iterator<Person> itPersonIterator = hsPerson.iterator();

		while (itPersonIterator.hasNext())
		{
			System.out.println(itPersonIterator.next());
		}
	}
}
