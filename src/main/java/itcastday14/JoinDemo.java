package itcastday14;

class Demo implements Runnable
{
	@Override
	public void run()
	{
		for (int x = 0; x < 50; x++)
		{
			System.out.println(Thread.currentThread().toString() + "....." + x);
			Thread.yield(); // �ͷ�ִ��Ȩ������ִ���ʸ񣬲�����������̺߳��Լ�����compete
		}
	}
}

class JoinDemo
{
	public static void main(String[] args) throws Exception
	{
		Demo d = new Demo();

		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);

		t1.start();

		t2.start();
		// t2.setPriority(Thread.MAX_PRIORITY);

		// t1.join();// t1�߳�Ҫ���������������С���ʱ����һ���߳�����ʱ����ʹ��join������
		// Main�߳��Ѿ�����ִ��Ȩ���ڵ�t1ִ�У�t1ִ���꣬main�ſ�ʼִ�С�

		for (int x = 0; x < 50; x++)
		{
			// System.out.println(Thread.currentThread() + "....." + x);
		}
	}
}
