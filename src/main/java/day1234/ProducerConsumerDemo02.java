package day1234;

class Resource02
{
	private String name;
	private int count = 1;
	private boolean flag = false;

	public synchronized void make(String name)//
	{
		while (this.flag)
		{
			try
			{
				this.wait();// t0 t1
			}
			catch (InterruptedException e)
			{
			}
		}

		this.name = name + this.count;// ��Ѽ1 ��Ѽ2 ��Ѽ3
		this.count++;// 2 3 4
		System.out.println(Thread.currentThread().getName() + "...������..." + this.name);// ������Ѽ1 ������Ѽ2 ������Ѽ3
		this.flag = true;
		this.notify();
	}

	public synchronized void buy()// t3
	{
		while (!this.flag)
		{
			try
			{
				this.wait();
			}
			catch (InterruptedException e)
			{
			} // t2 t3
		}
		System.out.println(Thread.currentThread().getName() + "...������........" + this.name);// ���ѿ�Ѽ1
		this.flag = false;
		this.notify();
	}
}

class Producer02 implements Runnable
{
	private Resource02 r;

	Producer02(Resource02 r)
	{
		this.r = r;
	}

	@Override
	public void run()
	{
		while (true)
		{
			this.r.make("��Ѽ");
		}
	}
}

class Consumer02 implements Runnable
{
	private Resource02 r;

	Consumer02(Resource02 r)
	{
		this.r = r;
	}

	@Override
	public void run()
	{
		while (true)
		{
			this.r.buy();
		}
	}
}

/**
 * <pre>
 *
 * ���������ߣ����������ߣ�ͬһ����Ѽ���� Bug: while + this.notify();
 * �����������
 *
 * </pre>
 *
 * @author zhanghongwei
 *
 */
class ProducerConsumerDemo02
{
	public static void main(String[] args)
	{
		Resource02 r = new Resource02();

		Producer02 pro = new Producer02(r);
		Consumer02 con = new Consumer02(r);

		Thread t0 = new Thread(pro);
		Thread t1 = new Thread(pro);

		Thread t2 = new Thread(con);
		Thread t3 = new Thread(con);

		t0.start();
		t1.start();
		t2.start();
		t3.start();

	}
}
