package day18.p5.generic.advance.demo;

import java.util.ArrayList;
import java.util.Collection;

import day18.p2.bean.Father;
import day18.p2.bean.GrandFa;
import day18.p2.bean.Son;

public class GenericAdvanceDemo2
{
	public static void main(String[] args)
	{

		ArrayList<GrandFa> al = new ArrayList<GrandFa>();
		al.add(new GrandFa("GrandFa", 30));
		al.add(new GrandFa("GrandFa1", 34));

		ArrayList<Father> al2 = new ArrayList<Father>();
		al2.add(new Father("Father1", 11));
		al2.add(new Father("Father2", 22));

		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("String1");
		al3.add("String2");

		GenericAdvanceDemo2.printCollection(al);
		GenericAdvanceDemo2.printCollection(al2);

		// GenericAdvanceDemo2.printCollection(al3); // ����Ĳ���������
		// printCollection(Collection<? extends Person> al)

		ArrayList<GrandFa> al4 = new ArrayList<GrandFa>();
		al4.add(new Son("Son1", 11));
		al4.add(new Son("Son2", 22));
		GenericAdvanceDemo2.printCollectionSuper(al4); // ����Ĳ���������
		// printCollection(Collection<? super Student> al)

	}

	/**
	 * ��������ӡ������Ԫ�ء�
	 *
	 * ���Զ����ͽ����޶��� ? extends E:����E���ͻ���E�������Ͷ������ޣ�
	 *
	 * @param al
	 */
	public static void printCollection(Collection<? extends GrandFa> al)
	{
		for (GrandFa grandFa : al)
		{
			System.out.println(grandFa);
		}

	}

	/**
	 * ��������ӡ������Ԫ�ء�
	 *
	 * ? super E ������E���ͻ���E�ĸ����͡����ޣ�
	 *
	 * @param al
	 */
	public static void printCollectionSuper(Collection<? super Father> al)
	{
		for (Object object : al)
		{
			System.out.println(object);
		}
	}

}
