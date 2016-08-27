package itcastday14;

class Resource01
{
	private String name;
	private int count = 1;
	private boolean flag = false;

	public synchronized void make(String name)//
	{
		if (this.flag)
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
		// notify();
	}

	public synchronized void buy()// t3
	{
		if (!this.flag)
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

class Producer01 implements Runnable
{
	private Resource01 r;

	Producer01(Resource01 r)
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

class Consumer01 implements Runnable
{
	private Resource01 r;

	Consumer01(Resource01 r)
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
 * Bug on �� if (this.flag)
 * ���������ߣ����������ߣ�ͬһ����Ѽ��:
 * ���ڽ���ʹ��if�жϣ���wait���߳����˾Ͳ����ж��ˣ����������ִ�У����»�ͬһ������һֱ����
 *  Thread-3...������........��Ѽ44300
	Thread-2...������........��Ѽ44300
	Thread-3...������........��Ѽ44300
 *
 * </pre>
 *
 * @author zhanghongwei
 *
 */
class ProducerConsumerDemo01
{
	public static void main(String[] args)
	{
		Resource01 r = new Resource01();

		Producer01 pro = new Producer01(r);
		Consumer01 con = new Consumer01(r);

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
