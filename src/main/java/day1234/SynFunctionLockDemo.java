package day1234;

/*
	ͬ��������ʹ�õ�����this��

	ͬ��������ͬ������������ͬ�����������ǹ̶���this��

	ͬ����������������Ķ���

	����ʹ��ͬ������顣
*/
class Ticket2 implements Runnable
{
	private int num = 10;
	Object obj = new Object();
	boolean flag = true;

	@Override
	public void run()
	{
		// System.out.println("this:"+this);

		if (this.flag)
		{
			while (true)
			{
				synchronized (this) // this.obj
				{
					if (this.num > 0)
					{
						try
						{
							Thread.sleep(10);
						}
						catch (InterruptedException e)
						{
						}
						System.out.println(Thread.currentThread().getName() + ".....obj...." + this.num--);
					}
				}
			}
		}
		else
		{
			while (true)
			{
				this.show();
			}
		}
	}

	public synchronized void show()
	{
		if (this.num > 0)
		{
			try
			{
				Thread.sleep(10);
			}
			catch (InterruptedException e)
			{
			}

			System.out.println(Thread.currentThread().getName() + ".....function...." + this.num--);
		}
	}
}

/**
 * �߳�1��ͬ������� ���߳�2ͬ��������Ҫ����ͬһ��this���ͻ�����ظ��� ͨ������Object obj = new Object(); ����֤������ȷ��
 *
 * @author zhanghongwei
 *
 */
public class SynFunctionLockDemo
{
	public static void main(String[] args)
	{
		Ticket2 t = new Ticket2();

		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);

		t1.start();
		try
		{
			Thread.sleep(10);
		}
		catch (InterruptedException e)
		{
		}
		t.flag = false;
		t2.start();
	}
}
