package itcastday09;

abstract class Ȯ
{
	abstract void ���();
}

interface ��ä
{
	abstract void ��äing();
}

interface �ѱ�
{
	abstract void �ѱ�ing();
}

class ��äȮ extends Ȯ implements ��ä
{
	@Override
	public void ���()
	{
	}

	@Override
	public void ��äing()
	{
	}
}

class �ѱ�Ȯ extends Ȯ implements �ѱ�
{
	@Override
	public void ���()
	{
	}

	@Override
	public void �ѱ�ing()
	{
	}
}

class InterfaceDemo2
{
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
	}
}
