package itcastday18.p4.generic.define.demo;

// ���÷���ʱ��������object���᲻��ȫ����������. ����ʱ��Ӱ�죬���ʱ��ͬ���ͣ�Ҫǿ��ת�����鷳��
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

/**
 * ��jdk1.5��ʹ�÷�������������Ҫ�����������������͡�
 *
 * �����ࡣʲôʱ���ã������еĲ����������������Ͳ�ȷ����ʱ�򣬾�ʹ�÷�������ʾ��
 *
 * @author zhanghongwei
 *
 * @param <QQ>
 */
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
	 */

	public <W> void show(W c)
	{
		System.out.println("show : " + c.toString());
	}

	public <W> void print(W str)
	{
		System.out.println("print : " + str);
	}

	public void printUseClassGenaric(QQ str)
	{
		System.out.println("print : " + str);
	}

	// BK --day18 Generic 2���� 1Static
	/**
	 * ��������̬ʱ�����ܷ������϶���ķ��͡������̬����ʹ�÷��ͣ�ֻ�ܽ����Ͷ����ڷ����ϡ�
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
