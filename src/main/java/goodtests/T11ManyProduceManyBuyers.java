package goodtests;

/**
 * <pre>
 * ���������ߣ����������ߣ�ͬһ����Ѽ����
 *
 * 1 ������ֻ���������100ֻ������һ���������棬���������߿���һ��������
 * 2 ֻҪ��duck�������߾Ϳ��������������߿���һֱ��0��
 * 3 ���໥Ӱ�졣
 *
 * </pre>
 *
 * @author zhanghongwei
 *
 */
public class T11ManyProduceManyBuyers
{
	public static void main(String[] args)
	{
		Ducks r = new Ducks();

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

/**
 * Ducks ��ʾ����ducks�������ߣ������߹���һ��duck�ࡣ
 *
 * @author zhanghongwei
 *
 */
class Ducks
{
	/**
	 * The max number of ducks will be created ,now is 100
	 */
	final int TOTAL_LIMITED_NUMBER = 3;
	/**
	 * ����duck �����������߻��ۼӣ������߻����
	 */
	int duckNumber = 0;

	/**
	 * ����������duck��ÿ������һ����
	 *
	 * @throws InterruptedException
	 */
	public synchronized void makeDuck()
	{
		if (this.duckNumber < this.TOTAL_LIMITED_NUMBER)
		{
			this.duckNumber++;
			// �߳�n make the i ducks.
			System.out.println(Thread.currentThread().getName() + "make the " + this.duckNumber + "ducks");
			// ÿ�������ͻ��ѱ���߳�
			this.notify();
			// Ȼ���Լ�release ����Ȩ
			try
			{
				this.wait();
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			this.notify();
			try
			{
				this.wait();
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}

		}
	}

	/**
	 * ��������duck��ÿ����һ����
	 */
	public synchronized void sellDuck()
	{
		if (this.duckNumber > 0)
		{
			// �߳�n buy the i ducks.
			System.out.println(Thread.currentThread().getName() + "sell the " + this.duckNumber + "ducks");
			this.duckNumber--;
			// ÿ�����Ѿͻ��ѱ���߳�
			this.notify();
			// Ȼ���Լ�release ����Ȩ
			try
			{
				this.wait();
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			this.notify();
			try
			{
				this.wait();
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}

		}

	}
}

class Producer implements Runnable
{

	Ducks ducks;

	public Producer(Ducks r)
	{
		this.ducks = r;
	}

	@Override
	public void run()
	{
		while (true)
		{
			this.ducks.makeDuck();
		}
	}

}

class Consumer implements Runnable
{
	Ducks ducks;

	public Consumer(Ducks r)
	{
		this.ducks = r;
	}

	@Override
	public void run()
	{
		while (true)
		{
			this.ducks.sellDuck();
		}
	}

}