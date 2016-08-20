package itcastday18.p4.generic.define.demo;

// ���÷���ʱ��������object���᲻��ȫ����������
class Tool1 {

	private Object object;

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
	
}

//��jdk1.5��ʹ�÷�������������Ҫ�����������������͡�
//�����ࡣʲôʱ���ã������еĲ����������������Ͳ�ȷ����ʱ�򣬾�ʹ�÷�������ʾ�� 
public class Tool<QQ>{
	private QQ q;

	public QQ getObject() {
		return q;
	}

	public void setObject(QQ object) {
		this.q = object;
	}
	
	
	/**
	 * �����Ͷ����ڷ����ϡ�
	 * @param str
	 */
	public <W> void show(W str){
		System.out.println("show : "+str.toString());
	}
	public void print(QQ str){
		System.out.println("print : "+str);
	}
	
	/**
	 * ��������̬ʱ�����ܷ������϶���ķ��͡������̬����ʹ�÷��ͣ�
	 * ֻ�ܽ����Ͷ����ڷ����ϡ� 
	 * @param obj
	 */
	public static <Y> void method(Y obj){
		System.out.println("method:"+obj);
	}
}