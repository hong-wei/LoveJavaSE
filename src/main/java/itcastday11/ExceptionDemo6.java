package itcastday11;

interface Interface
{
	void function();
}

class D implements Interface
{
	@Override
	public void function() // throws Exception
	{
	}
}

class A extends Exception
{
}

class B extends A
{
}

class C extends Exception
{
}

// Exception
// |--A
// A--|--B
// |--C

class Fu
{
	void show() throws A
	{
	}
}

class Zi extends Fu
{
	@Override
	void show() throws B // only can thrwo A,B, can't C.
	{

	}
}

class Test
{
	void method(Fu f)// Fu f = new Zi();
	{
		try
		{
			f.show();

		}
		catch (A a) // BK --day11 Exception �������쳣����ԭ��
		// Ҫ��֤��̬����ȷ������ĸ��ֻ࣬�ܴ�������쳣��Ҫ�Ƕ��������쳣�����뽫��Ķ���
		{
		}
	}

	public void show(Zi zi)
	{
	}
}

public class ExceptionDemo6
{
	public static void main(String[] args)
	{
		Test t = new Test();
		t.show(new Zi());
		t.method(new Zi());
	}
}
