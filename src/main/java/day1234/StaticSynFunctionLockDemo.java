package day1234;

/*
��̬��ͬ������ʹ�õ�����  �ú��������ֽ����ļ�����
������ getClass������ȡ��Ҳ�����õ�ǰ  ����.class ��ʾ��

*/

class Ticket3 implements Runnable
{
	private static int num = 100;
	// Object obj = new Object();
	boolean flag = true;

	@Override
	public void run()
	{
		// System.out.println("this:"+this.getClass());

		if (this.flag)
		{
			while (true)
			{
				synchronized (Ticket3.class)// (this.getClass())
				{
					if (Ticket3.num > 0)
					{
						try
						{
							Thread.sleep(10);
						}
						catch (InterruptedException e)
						{
						}
						System.out.println(Thread.currentThread().getName() + ".....obj...." + Ticket3.num--);
					}
				}
			}
		}
		else
		{
			while (true)
			{
				Ticket3.show();
			}
		}
	}

	public static synchronized void show()
	{
		if (Ticket3.num > 0)
		{
			try
			{
				Thread.sleep(10);
			}
			catch (InterruptedException e)
			{
			}

			System.out.println(Thread.currentThread().getName() + ".....function...." + Ticket3.num--);
		}
	}
}

public class StaticSynFunctionLockDemo
{
	public static void main(String[] args)
	{
		Ticket3 t = new Ticket3();

		// Class clazz = t.getClass();
		//
		// Class clazz = Ticket3.class;
		// System.out.println("t:"+t.getClass());

		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);

		// t1.start();
		// try{Thread.sleep(10);}catch(InterruptedException e){}
		// t.flag = false;
		// t2.start();
		System.out.println(Object.class);
	}
}
