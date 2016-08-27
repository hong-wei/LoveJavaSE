package itcastday14;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Duck
{

}

public class BoundedBuffer
{
	final int length = 100;// The length is limited to 100
	// new lock object
	final Lock lock = new ReentrantLock();
	// two different conditions: put and take
	final Condition notFull = this.lock.newCondition();
	final Condition notEmpty = this.lock.newCondition();

	final Duck[] items = new Duck[this.length];// ����100ֻѼ��
	int putptr, takeptr, count; // ��¼Ѽ����Ϣ��������ȡ��������

	public void put(Duck newDuck) throws InterruptedException
	{
		this.lock.lock();
		try
		{
			while (this.count == this.items.length)
			{
				this.notFull.await();
			}
			this.items[this.putptr] = newDuck;
			if (++this.putptr == this.items.length)
			{
				this.putptr = 0;
			}
			++this.count;
			this.notEmpty.signal();
		}
		finally
		{
			this.lock.unlock();
		}
	}

	public Duck take() throws InterruptedException
	{
		this.lock.lock();
		try
		{
			while (this.count == 0)
			{
				this.notEmpty.await();
			}
			Duck oneDuck = this.items[this.takeptr];
			if (++this.takeptr == this.items.length)
			{
				this.takeptr = 0;
			}
			--this.count;
			this.notFull.signal();
			return oneDuck;
		}
		finally
		{
			this.lock.unlock();
		}
	}
}
