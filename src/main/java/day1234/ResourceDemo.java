package day1234;

/*
	�̼߳�ͨѶ������߳��ڴ���ͬһ��Դ����������ȴ��ͬ��
*/

//��Դ
class Resource1
{
	String name;
	String sex;
}

// ����
class Input implements Runnable
{
	Resource1 resource;

	Input(Resource1 r)
	{
		this.resource = r;
	}

	@Override
	public void run()
	{
		boolean writeDifferentValueFlag = true;
		while (true)
		{
			synchronized (this.resource)
			{
				if (writeDifferentValueFlag)
				{
					this.resource.name = "mike";
					this.resource.sex = "nan";
				}
				else
				{
					this.resource.name = "����";
					this.resource.sex = "ŮŮŮŮŮŮ";
				}
				writeDifferentValueFlag = !writeDifferentValueFlag;
			}
		}
	}
}

// ���
class Output implements Runnable
{

	Resource1 resource;

	Output(Resource1 r)
	{
		this.resource = r;
	}

	@Override
	public void run()
	{
		while (true)
		{
			synchronized (this.resource)
			{
				System.out.println(this.resource.name + "....." + this.resource.sex);
			}
		}
	}
}

/**
 * һ���߳�д��Դ����һ���̶߳���Դ��ͬ���������Ա�֤�������̲߳���ͬʱ����һ����Դ�����ǲ��ܱ�֤���ʵ�˳��Ҫд��ſ�ʼ����дһ����һ��������˳��Ҫͨ��wait �� notify����ʵ�֡�
 *
 * @author zhanghongwei
 *
 */
class ResourceDemo
{
	public static void main(String[] args)
	{
		// 1������Դ��
		Resource1 r = new Resource1();

		// 2��������
		Input in = new Input(r);
		Output out = new Output(r);

		// 3�����̣߳�ִ��·����
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);

		// 4�����߳�
		t1.start();
		t2.start();
	}
}
