package day0910;

abstract class Ȯ��
{
	static String name;

	Ȯ��()
	{
		Ȯ��.name = "Hongwei";
	}

	abstract void ���();

	static void ���1()
	{
		System.out.println("wuwu " + Ȯ��.name);
	}
}

class �� extends Ȯ��
{

	@Override
	void ���()
	{
		System.out.println("���� " + Ȯ��.name);
	}
}

class �� extends Ȯ��
{
	@Override
	void ���()
	{
		System.out.println("�� " + Ȯ��.name);
	}
}

public class AbstractDemo
{
	public static void main(String[] args)
	{
		�� �� = new ��();
		��.���();
		Ȯ��.���1();
		System.out.println(Ȯ��.name);
	}

}
