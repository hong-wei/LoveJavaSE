package day1234;

/*
�����̵߳ĵ�һ�ַ�ʽ:�̳�Thread�ࡣ

�����̵߳ĵڶ��ַ�ʽ��ʵ��Runnable�ӿڡ�

1,������ʵ��Runnable�ӿڡ�
2�����ǽӿ��е�run���������̵߳���������װ��run�����С�
3��ͨ��Thread�ഴ���̶߳��󣬲���Runnable�ӿڵ����������ΪThread��Ĺ��캯���Ĳ������д��ݡ�
	Ϊʲô����Ϊ�̵߳����񶼷�װ��Runnable�ӿ���������run�����С�
	����Ҫ���̶߳��󴴽�ʱ�ͱ�����ȷҪ���е�����

4�������̶߳����start���������̡߳�


ʵ��Runnable�ӿڵĺô���
1�����̵߳�������̵߳������з�������������˵����ķ�װ��
	������������˼�뽫����ķ�װ�ɶ���
2��������java���̳еľ����ԡ�

���ԣ������̵߳ĵڶ��ַ�ʽ��Ϊ���á�


*/
//BK --day13 M-Thread 04ʵ��Runnable�ӿ�
class Demo13 implements Runnable// extends Fu //׼����չDemo��Ĺ��ܣ������е����ݿ�����Ϊ�̵߳�����ִ�С�
// ͨ���ӿڵ���ʽ��ɡ�
{
	@Override
	public void run()
	{
		show();
	}

	public void show()
	{
		for (int x = 0; x < 20; x++)
		{
			System.out.println(Thread.currentThread().getName() + "....." + x);
		}
	}
}

class ThreadDemo13
{
	public static void main(String[] args)
	{
		Runnable d = new Demo13();
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);
		t1.start();
		t2.start();
	}
}
