package itcastday14;

//��Դ
class Resource2
{
	String name;
	String sex;
	/**
	 * the state of resource, if there is data ,no need to write . If there is no data, can not be read .
	 */
	boolean resouceExsitingState = false;
}

// ����
class Input2 implements Runnable
{
	Resource2 resource2;

	Input2(Resource2 resource2)
	{
		this.resource2 = resource2;
	}

	@Override
	public void run()
	{
		boolean writeDifferentValueFlag = true;
		while (true)
		{
			synchronized (this.resource2)
			{
				// if there is existing data,wait for read
				if (this.resource2.resouceExsitingState)
				{
					try
					{
						this.resource2.wait();
					}
					catch (InterruptedException e)
					{
					}
				}
				else // if there is no data, write data directly
				{
					if (writeDifferentValueFlag)
					{
						this.resource2.name = "mike";
						this.resource2.sex = "nan";
					}
					else
					{
						this.resource2.name = "����";
						this.resource2.sex = "ŮŮŮŮŮŮ";
					}
					this.resource2.resouceExsitingState = true;
					this.resource2.notify();
					writeDifferentValueFlag = !writeDifferentValueFlag;
					try
					{
						this.resource2.wait();
					}
					catch (InterruptedException e)
					{
						e.printStackTrace();
					}
				}
			}

		}
	}
}

// ���
class Output2 implements Runnable
{

	Resource2 resource2;

	Output2(Resource2 resource2)
	{
		this.resource2 = resource2;
	}

	@Override
	public void run()
	{
		while (true)
		{
			synchronized (this.resource2)
			{
				// if there is resource ,so read .
				if (this.resource2.resouceExsitingState)
				{
					System.out.println(this.resource2.name + "....." + this.resource2.sex);
					this.resource2.resouceExsitingState = false;
					this.resource2.notify();
					try
					{
						this.resource2.wait();
					}
					catch (InterruptedException e)
					{
						e.printStackTrace();
					}
				}
				// if there is no resource ,so wait .
				else
				{
					try
					{
						this.resource2.wait();
					}
					catch (InterruptedException e)
					{
					}
				}

			}
		}
	}
}

/**
 *
 * �ڷ�����ʹ����wait ��notify ���ڶ���̼߳�ͨ�š� ����һ��д�꣬��һ���Ŷ����ݡ�
 * 
 * @author zhanghongwei
 *
 */
class ResourceDemo2
{
	public static void main(String[] args)
	{
		// ������Դ��
		Resource2 r = new Resource2();

		// ��������
		Input2 in = new Input2(r);
		Output2 out = new Output2(r);

		// �����̣߳�ִ��·����
		new Thread(in).start();
		new Thread(out).start();

	}
}
