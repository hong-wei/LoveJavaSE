package itcastday13;

/*
����:������������ÿ���������д�Ǯÿ�δ�100�����������Ρ�
*/

class Bank
{
	private int sum;

	// private Object obj = new Object();
	public synchronized void add(int num)// ͬ������
	{
		// synchronized(obj)
		// {
		this.sum = this.sum + num;
		// -->
		try
		{
			Thread.sleep(10);
		}
		catch (InterruptedException e)
		{
		}
		System.out.println("sum=" + this.sum);
	}
}

class Custermer implements Runnable
{
	private Bank b = new Bank();

	@Override
	public void run()
	{
		for (int x = 0; x < 3; x++)
		{
			this.b.add(100);
		}
	}
}

class BankDemo
{
	public static void main(String[] args)
	{
		Custermer c = new Custermer();
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();
	}
}
