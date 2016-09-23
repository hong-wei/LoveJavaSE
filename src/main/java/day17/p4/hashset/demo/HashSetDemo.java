package day17.p4.hashset.demo;

import java.util.HashSet;
import java.util.Iterator;

import day17.p.bean.Person;

/**
 * <pre>
 * ��hashSet�����д洢Person����:���������������ͬ����Ϊͬһ���ˡ���Ϊ��ͬԪ�ء�
 *
 * Summary: HashSet�������ݽṹ�ǹ�ϣ�����Դ洢Ԫ�ص�ʱ��
 *
 * 1 ʹ�õ�Ԫ�ص�hashCode������ȷ��λ��.
 *
 * 2 ���λ����ͬ����ͨ��Ԫ�ص�equals��ȷ���Ƿ���ͬ��
 *
 * </pre>
 *
 * @author zhanghongwei
 *
 */
public class HashSetDemo
{
	public static void main(String[] args)
	{
		// 1 Store String
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

		// 2 Store Classes
		HashSet<Person<Object>> hsPerson = new HashSet<Person<Object>>();

		// ��hashSet�����д洢Person����:���������������ͬ����Ϊͬһ���ˡ���Ϊ��ͬԪ�ء�

		// Summary:
		// HashSet�������ݽṹ�ǹ�ϣ�����Դ洢Ԫ�ص�ʱ��
		// 1 ʹ�õ�Ԫ�ص�hashCode������ȷ��λ��.
		// 2 ���λ����ͬ����ͨ��Ԫ�ص�equals��ȷ���Ƿ���ͬ��
		hsPerson.add(new Person<Object>("lisi4", 24));
		hsPerson.add(new Person<Object>("lisi7", 27));
		hsPerson.add(new Person<Object>("lisi1", 21));
		hsPerson.add(new Person<Object>("lisi9", 29));
		hsPerson.add(new Person<Object>("lisi7", 27));
		hsPerson.add(new Person<Object>("lisi7", 27));
		hsPerson.add(new Person<Object>("lisi7", 27));
		hsPerson.add(new Person<Object>("lisi7", 27));

		for (Person<Object> person : hsPerson)
		{
			System.out.println(person);
		}

	}
}
