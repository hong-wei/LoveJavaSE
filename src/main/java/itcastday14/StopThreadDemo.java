package itcastday14;

/**
 * <pre>
	ֹͣ�̣߳�
		1��stop������
		2��run����������

	��ô�����̵߳����������?
	�����ж�����ѭ���ṹ��ֻҪ����סѭ���Ϳ��Խ�������

	����ѭ��ͨ�����ö���������ɡ�

	��������̴߳����˶���״̬���޷���ȡ��ǡ���ν����أ�

	����ʹ��interrupt()�������̴߳Ӷ���״̬ǿ�ƻָ�������״̬���������߳̾߱�cpu��ִ���ʸ�

	��ʱǿ�ƶ����ᷢ����InterruptedException���ǵ�Ҫ����
 * </pre>
 *
 *
 * @author zhanghongwei
 *
 */
class StopThreadDemo
{
	public static void main(String[] args)
	{
		StopThread st = new StopThread();

		Thread t1 = new Thread(st);
		Thread t2 = new Thread(st);

		t1.start();

		// t2.setDaemon(true);
		t2.start();

		int num = 1;
		while (true)
		{
			++num;
			if (num == 50)
			{
				// st.setFlag();
				t1.interrupt();
				t2.interrupt();
//				st.setFlag();
				break;
			}
			System.out.println("main...." + num);
		}

		System.out.println("over");
	}
}

class StopThread implements Runnable
{
	private boolean flag = true;

	@Override
	public synchronized void run()
	{
		while (this.flag)
		{
			try
			{
				this.wait();// t0 t1
			}
			catch (InterruptedException e)
			{
				System.out.println(Thread.currentThread().getName() + "....." + e);
				this.flag = false;
			}

			System.out.println(Thread.currentThread().getName() + "......++++");
		}
	}

	public void setFlag()
	{
		this.flag = false;
	}
}
