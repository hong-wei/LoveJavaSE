package day10;

/*
����ʦ�ͱ���ү�Ĺ��¡�
*/

class ����ү
{
	protected void ����()
	{
		System.out.println("����");
	}

	protected void ����()
	{
		System.out.println("����");
	}
}

final class ����ʦ extends ����ү
{
	@Override
	protected void ����()
	{
		System.out.println("Java");
	}

	protected void ����Ӱ()
	{
		System.out.println("����Ӱ");
	}
}

public class DuoTaiDemo2
{
	DuoTaiDemo2()
	{
	}

	public static void main(String[] args)
	{
		����ʦ x = new ����ʦ();
		x.����();
		x.����Ӱ();

		����ү x1 = new ����ʦ();
		x1.����();
		x1.����();

		����ʦ y = (����ʦ) x1;// ClassCastException
		y.����Ӱ();

	}
}
