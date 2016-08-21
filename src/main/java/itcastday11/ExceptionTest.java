package itcastday11;

import java.io.PrintStream;

/*
����ʦ�õ����ϿΡ�
	�漰��������
		����ʦ�����ԡ�
	�������е��쳣��
		���������������ð������
*/

class LanPingException extends Exception
{
	LanPingException(String msg)
	{
		super(msg);
	}
}

class MaoYanException extends Exception
{
	MaoYanException(String msg)
	{
		super(msg);
	}
}

class NoPlanException extends Exception
{
	NoPlanException(String msg)
	{
		super(msg);
	}

	public NoPlanException(String string, MaoYanException e)
	{
	}
}

class Computer
{
	private int state = 2;

	public void run() throws LanPingException, MaoYanException
	{
		if (this.state == 1)
		{
			throw new LanPingException("��������������");
		}
		if (this.state == 2)
		{
			throw new MaoYanException("����ð��������");
		}

		System.out.println("��������");
	}

	public void reset()
	{
		this.state = 0;
		System.out.println("��������");
	}
}

class Teacher
{
	private String name;
	private Computer comp;

	Teacher(String name)
	{
		this.name = name;
		this.comp = new Computer();
	}

	public void prelect() throws NoPlanException
	{
		try
		{
			this.comp.run();
			System.out.println(this.name + "����");

		}
		catch (LanPingException e)
		{
			System.out.println(e.toString());
			this.comp.reset();
			this.prelect();
		}
		catch (MaoYanException e)
		{
			System.out.println(e.toString());
			this.test();
			// ���ԶԵ��Խ���ά�ޡ�
			// throw e;
			throw new NoPlanException("��ʱ�����޷���ɣ�ԭ��" + e.getMessage(), e);
		}

	}

	public void test()
	{
		System.out.println("�����ϰ");
	}
}

class ExceptionTest
{
	public static void main(String[] args)
	{
		Teacher t = new Teacher("����ʦ");
		try
		{
			t.prelect();

		}
		catch (NoPlanException e)
		{
			System.out.println(e.toString() + "......");
			System.out.println("����");
			e.printStackTrace();
			PrintStream s = null;
			e.printStackTrace(s);
			System.out.println(s);

		}
	}
}

/*
 *
 * class NoAddException extends Exception {}
 *
 * void addData(Data d)throws NoAddException {
 *
 * �������ݿ� try { ������ݡ������쳣 SQLException(); } catch(SQLException e) { //������롣
 *
 * throw new NoAddException(); } fianlly { �ر����ݿ⡣ } }
 *
 *
 */