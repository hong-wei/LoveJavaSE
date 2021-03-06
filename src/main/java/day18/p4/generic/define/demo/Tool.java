package day18.p4.generic.define.demo;

// 不用泛型时，仅仅用object，会不安全，带来隐患. 输入时不影响，输出时不同类型，要强制转换很麻烦。
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
 * 在jdk1.5后，使用泛型来接收类中要操作的引用数据类型。
 *
 * 泛型类。什么时候用？当类中的操作的引用数据类型不确定的时候，就使用泛型来表示。
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
	 * 将泛型定义在方法上。
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

	// BK --day18 Generic 2方法 1Static
	/**
	 * 当方法静态时，不能访问类上定义的泛型。如果静态方法使用泛型，只能将泛型定义在方法上。
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
