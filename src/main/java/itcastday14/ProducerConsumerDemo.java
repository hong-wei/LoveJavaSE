package itcastday14;

class Resource
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
		this.notifyAll();
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
		this.notifyAll();
	}
}

class Producer implements Runnable
{
	private Resource r;

	Producer(Resource r)
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

class Consumer implements Runnable
{
	private Resource r;

	Consumer(Resource r)
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
 * ���������ߣ����������ߣ�ͬһ����Ѽ����
 *
 * @author zhanghongwei
 *
 */
class ProducerConsumerDemo
{
	public static void main(String[] args)
	{
		Resource r = new Resource();

		Producer pro = new Producer(r);
		Consumer con = new Consumer(r);

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
