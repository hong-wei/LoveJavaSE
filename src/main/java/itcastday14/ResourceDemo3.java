package itcastday14;

class Resource3
{
	private String name;
	private String sex;
	private boolean flag = false;

	public synchronized void set(String name, String sex)
	{
		if (this.flag)
		{
			try
			{
				this.wait();
			}
			catch (InterruptedException e)
			{
			}
		}
		this.name = name;
		this.sex = sex;
		this.flag = true;
		this.notify();
	}

	public synchronized void out()
	{
		if (!this.flag)
		{
			try
			{
				this.wait();
			}
			catch (InterruptedException e)
			{
			}
		}
		System.out.println(this.name + "...+...." + this.sex);
		this.flag = false;
		this.notify();
	}
}

// ����
class Input3 implements Runnable
{
	Resource3 r;

	Input3(Resource3 r)
	{
		this.r = r;
	}

	@Override
	public void run()
	{
		int x = 0;
		while (true)
		{
			if (x == 0)
			{
				this.r.set("mike", "nan");
			}
			else
			{
				this.r.set("����", "ŮŮŮŮŮŮ");
			}
			x = (x + 1) % 2;
		}
	}
}

// ���
class Output3 implements Runnable
{

	Resource3 r;

	Output3(Resource3 r)
	{
		this.r = r;
	}

	@Override
	public void run()
	{
		while (true)
		{
			this.r.out();
		}
	}
}

/**
 *
 * �����ˣ�����ṹ���Ѵ��������ȷ�������档
 *
 * @author zhanghongwei
 *
 */

class ResourceDemo3
{
	public static void main(String[] args)
	{
		// ������Դ��
		Resource3 r = new Resource3();
		// ��������
		Input3 in = new Input3(r);
		Output3 out = new Output3(r);
		// �����̣߳�ִ��·����
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);
		// �����߳�
		t1.start();
		t2.start();
	}
}
