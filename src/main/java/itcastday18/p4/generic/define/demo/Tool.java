package itcastday18.p4.generic.define.demo;

// ���÷���ʱ��������object���᲻��ȫ����������
class Tool1
{

	private Object object;

	public Object getObject()
	{
		return this.object;
	}

	public void setObject(Object object)
	{
		this.object = object;
	}

}

// ��jdk1.5��ʹ�÷�������������Ҫ�����������������͡�
// �����ࡣʲôʱ���ã������еĲ����������������Ͳ�ȷ����ʱ�򣬾�ʹ�÷�������ʾ��
public class Tool<QQ> extends Object implements Comparable<QQ>
{
	private QQ q;

	public QQ getObject()
	{
		return this.q;
	}

	public void setObject(QQ object)
	{
		this.q = object;
	}

	/**
	 * �����Ͷ����ڷ����ϡ�
	 *
	 * @param str
	 */
	public <W> void show(W str)
	{
		System.out.println("show : " + str.toString());
	}

	public <W> void print(W str)
	{
		System.out.println("print : " + str);
	}

	// public void print(QQ str)
	// {
	// System.out.println("print : " + str);
	// }

	/**
	 * ��������̬ʱ�����ܷ������϶���ķ��͡������̬����ʹ�÷��ͣ� ֻ�ܽ����Ͷ����ڷ����ϡ�
	 *
	 * @param obj
	 */
	public static <Y> void method(Y obj)
	{
		System.out.println("method:" + obj);
	}

	@Override
	public int compareTo(QQ o)
	{
		return 0;
	}
}
