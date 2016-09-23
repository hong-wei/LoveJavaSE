package day17.p2.linkedlist.test;

/**
 * ��ʹ��LinkedList��ģ��һ����ջ���߶������ݽṹ��
 *
 * ��ջ���Ƚ���� First In Last Out FILO
 *
 * ���У��Ƚ��ȳ� First In First Out FIFO
 *
 * ����Ӧ����������һ����������ʹ���ṩһ������������������ֽṹ�е�һ�֡�
 */

public class LinkedTest
{
	public static void main(String[] args)
	{
		DuiLie dl = new DuiLie();

		dl.myAdd("1");
		dl.myAdd("2");
		dl.myAdd("3");
		dl.myAdd("4");

		while (!dl.isNull())
		{
			System.out.println(dl.myGet());
		}
		System.out.println("----------------------");
		Stack s1 = new Stack();
		s1.add("1");
		s1.add("2");
		s1.add("3");
		s1.add("4");
		s1.add("5");
		// 1 2 3 4 5
		while (!s1.isNull())
		{
			System.out.println(s1.myGet());
		}
		// System.out.println(s1.getItem(1));
	}

}
