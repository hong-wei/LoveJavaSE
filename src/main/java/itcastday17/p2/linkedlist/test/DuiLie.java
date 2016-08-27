package itcastday17.p2.linkedlist.test;

import java.util.LinkedList;

/**
 * ���У��Ƚ��ȳ� First In First Out FIFO
 * 
 * @author zhanghongwei
 *
 */
public class DuiLie
{
	private LinkedList link;

	public DuiLie()
	{
		this.link = new LinkedList();
	}

	/**
	 * ���е����Ԫ�صĹ��ܡ�
	 */
	public void myAdd(Object obj)
	{
		this.link.addLast(obj);
	}

	public Object myGet()
	{
		return this.link.removeFirst();
	}

	public boolean isNull()
	{
		return this.link.isEmpty();
	}
}
