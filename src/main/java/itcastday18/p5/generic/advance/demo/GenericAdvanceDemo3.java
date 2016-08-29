package itcastday18.p5.generic.advance.demo;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

import itcastday18.p2.bean.Father;
import itcastday18.p2.bean.GrandFa;
import itcastday18.p2.bean.Son;

public class GenericAdvanceDemo3
{
	public static void main(String[] args)
	{

		TreeSet<GrandFa> al1 = new TreeSet<GrandFa>(new CompByPersonName()); // person �м���ѧ�������ˣ���ô����
																				// �����ø���ıȽ�����
		al1.add(new GrandFa("abc4", 34));
		al1.add(new GrandFa("abc1", 30));
		al1.add(new GrandFa("abc2", 38));

		TreeSet<Father> al2 = new TreeSet<Father>(new CompByStuName());// ѧ�����Դ����Լ��ıȽ���
		// TreeSet<Student> al222 = new TreeSet<Student>(new CompByWorkerName()); // ѧ�������Դ����Լ����ӵıȽ���

		al2.add(new Father("stu1", 11));
		al2.add(new Father("stu7", 20));
		al2.add(new Father("stu2", 22));
		al2.add(new Son("stu2", 22));

		TreeSet<Son> al3 = new TreeSet<Son>(new CompByPersonName());// ѧ�����Դ����Լ�үү�ıȽ���

		al3.add(new Son("Worker1", 11));
		al3.add(new Son("Worker2", 22));

		al1.addAll(al2);
		al1.addAll(al3);

		System.out.println("Person------------");
		Iterator<GrandFa> it1 = al1.iterator();
		while (it1.hasNext())
		{
			System.out.println(it1.next());
		}
		System.out.println("Student------------");
		Iterator<Father> it = al2.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}

		System.out.println("Worker------------");
		Iterator<Son> itWorker = al3.iterator();
		while (itWorker.hasNext())
		{
			System.out.println(itWorker.next());
		}

	}
}

/*
 * class TreeSet<E> { TreeSet(Comparator<? super E> comparator) ); TreeSet(Comparator<? extends E> comparator) ); }
 *
 * ʲôʱ���������أ�ͨ���Լ����е�Ԫ�ؽ���ȡ������ʱ�������������ޡ�
 *
 */

class CompByPersonName implements Comparator<GrandFa>
{

	@Override
	public int compare(GrandFa o1, GrandFa o2)
	{

		int temp = o1.getName().compareTo(o2.getName());

		return temp == 0 ? o1.getAge() - o2.getAge() : temp;
	}

}

class CompByStuName implements Comparator<Father>
{

	@Override
	public int compare(Father o1, Father o2)
	{

		int temp = o1.getName().compareTo(o2.getName());

		return temp == 0 ? o1.getAge() - o2.getAge() : temp;
	}

}

class CompByWorkerName implements Comparator<Son>
{

	@Override
	public int compare(Son o1, Son o2)
	{

		int temp = o1.getName().compareTo(o2.getName());

		return temp == 0 ? o1.getAge() - o2.getAge() : temp;
	}

}
