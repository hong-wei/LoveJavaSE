package itcastday14;

//1 ������� ����������һ�У������ڵ�һ�У�Ӧ�ñ�abstract����

/*class Test implements Runnable
{
	public void run(Thread t)
	{}
}*/

class ThreadTest
{
	public static void main(String[] args)
	{
		// 2 �����Ǹ�run��
		new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				System.out.println("runnable run");
			}
		})
		{
			@Override
			public void run()
			{
				System.out.println("subThread run");
			}
		}.start();

		new Thread()
		{
			@Override
			public void run()
			{
				for (int x = 0; x < 50; x++)
				{
					System.out.println(Thread.currentThread().getName() + "....x=" + x);
				}

			}
		}.start();

		for (int x = 0; x < 50; x++)
		{
			System.out.println(Thread.currentThread().getName() + "....y=" + x);
		}

		Runnable r = new Runnable()
		{
			@Override
			public void run()
			{
				for (int x = 0; x < 50; x++)
				{
					System.out.println(Thread.currentThread().getName() + "....z=" + x);
				}
			}
		};
		new Thread(r).start();

	}
}
