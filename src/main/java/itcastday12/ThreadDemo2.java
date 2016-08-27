package itcastday12;

/*

5: Multithreading 1 -- 05-���߳�(���̴߳����ķ�ʽһ-�̳�Thread��).avi (25:27)
		1 Thread Concept
			�����̵߳�Ŀ����Ϊ�˿���һ��ִ��·����ȥ����ָ���Ĵ������������ʵ��ͬʱ���С�
			�����е�ָ������������ִ��·��������
			JVM���������̵߳����񶼶��������������С�
			���Զ�����߳������������Ķ��أ�
			Thread�����������̣߳��߳�����Ҫ����ġ�����Thread��Ҳ�������������
			��������ͨ��Thread���е�run���������֡�Ҳ����˵��run�������Ƿ�װ�Զ����߳���������ĺ�����
			run�����ж�������߳�Ҫ���е�������롣
			�����߳���Ϊ������ָ�����룬����ֻ�м̳�Thread�࣬����дrun������
			�����еĴ��붨����run�����м��ɡ�
		2 �����̷߳�ʽһ���̳�Thread�ࡣ
			���裺
			1������һ����̳�Thread�ࡣ
			2������Thread���е�run������
			3��ֱ�Ӵ���Thread��������󴴽��̡߳�

*/
class Demo2 extends Thread // BK --day12 Multithreading 02�̳�Thread��
{

	Demo2(String name)
	{
		super(name);// set the name for thread object
	}

	public Demo2(ThreadGroup threadGroup, String name)
	{
		super(threadGroup, name);
	}

	@Override
	public void run()
	{
		for (int x = 0; x < 10; x++)
		{
			System.out.println("Thread name=" + Thread.currentThread().getName() + ", thread id =" + x);
		}
	}
}

class ThreadDemo2
{

	public static void main(String[] args)
	{
		Demo2 d1 = new Demo2(new ThreadGroup("hongwei"), "����");
		Demo2 d2 = new Demo2(new ThreadGroup("hongwei"), "Сǿ");
		// d1.run();// �����̣߳�����run������
		// d2.run();

		d1.start();// �����̣߳�����run������
		d2.start();
		d1.run();

		System.out.println("over...." + Thread.currentThread().getName());
	}
}
