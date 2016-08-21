package itcastday08;

//����ʽ
class Single// ��һ���أ�������Ѿ������ˡ�
{
	private static Single s = new Single();

	private Single()
	{
	}

	public static Single getInstance()
	{
		return Single.s;
	}
}

// ����ʽ
class Single2 // ����ؽ�����û�ж���ֻ�е�����getInstance����ʱ���Żᴴ������
				// �ӳټ�����ʽ��
{
	private static Single2 s = null;

	private Single2()
	{
	}

	public static Single2 getInstance()
	{
		if (Single2.s == null)
		{
			Single2.s = new Single2();
		}
		return Single2.s;
	}
}

public class SingleDemo08
{
	public static void main(String[] args)
	{
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();

		System.out.println(s1 == s2);

		Test t1 = Test.getInstance();
		Test t2 = Test.getInstance();
		t1.setNum(10);
		t2.setNum(20);
		System.out.println(t1.getNum());
		System.out.println(t2.getNum());
	}
}

class Test
{
	private int num;

	private static Test t = new Test();

	private Test()
	{
	}

	public static Test getInstance()
	{
		return Test.t;
	}

	public void setNum(int num)
	{
		this.num = num;
	}

	public int getNum()
	{
		return this.num;
	}

}
