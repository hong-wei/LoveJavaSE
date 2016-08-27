package itcastday14;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Resource5
{
	private String name;
	private int count = 1;
	private boolean flag = false;

	// ����һ��������
	Lock lock = new ReentrantLock();

	// ͨ�����е�����ȡ�����ϵļ���������
	// Condition con = lock.newCondition();

	// ͨ�����е�����ȡ�����������һ����������ߣ�һ����������ߡ�
	Condition producer_con = this.lock.newCondition();
	Condition consumer_con = this.lock.newCondition();

	public void make(String name)// t0 t1
	{
		this.lock.lock();
		try
		{
			while (this.flag)
			{
				// try{lock.wait();}catch(InterruptedException e){}// t1 t0
				try
				{
					this.producer_con.await();
				}
				catch (InterruptedException e)
				{
				} // t1 t0
			}

			this.name = name + this.count;// ��Ѽ1 ��Ѽ2 ��Ѽ3
			this.count++;// 2 3 4
			System.out.println(Thread.currentThread().getName() + "...������5.0..." + this.name);// ������Ѽ1 ������Ѽ2 ������Ѽ3
			this.flag = true;
			// notifyAll();
			// con.signalAll();
			this.consumer_con.signal();
		}
		finally
		{
			this.lock.unlock();
		}

	}

	public void buy()// t2 t3
	{
		this.lock.lock();
		try
		{
			while (!this.flag)
			{
				// try{this.wait();}catch(InterruptedException e){} //t2 t3
				try
				{
					this.consumer_con.await();
				}
				catch (InterruptedException e)
				{
				} // t2 t3
			}
			System.out.println(Thread.currentThread().getName() + "...������.5.0......." + this.name);// ���ѿ�Ѽ1
			this.flag = false;
			// notifyAll();
			// con.signalAll();
			this.producer_con.signal();
		}
		finally
		{
			this.lock.unlock();
		}

	}
}

class Producer5 implements Runnable
{
	private Resource5 r;

	Producer5(Resource5 r)
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

class Consumer5 implements Runnable
{
	private Resource5 r;

	Consumer5(Resource5 r)
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
	jdk1.5�Ժ�ͬ��������װ���˶���
	��������������ʽ��ʽ���嵽�˸ö����У�
	����ʽ�����������ʾ������

	Lock�ӿڣ� ���������ͬ����������ͬ����������ͬ������ʽ�����������ʵ��������
	ͬʱ��Ϊ������һ�����ϼ��϶����������
	lock():��ȡ����
	unlock():�ͷ�����ͨ����Ҫ����finally������С�


	Condition�ӿڣ����������Object�е�wait notify notifyAll������
				����Щ�������������������˷�װ�����Condition����������
				����������������ϡ�
	await();
	signal();
	signalAll();
 *
 *
 * </pre>
 *
 * @author zhanghongwei
 *
 */
public class ProducerConsumerDemo2
{
	public static void main(String[] args)
	{
		Resource5 r = new Resource5();
		Producer5 pro = new Producer5(r);
		Consumer5 con = new Consumer5(r);

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