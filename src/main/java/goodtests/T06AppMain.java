package goodtests;
//http://lz12366.iteye.com/blog/639873

// know more about the memory : stack ,heap, data ...

public class T06AppMain {
	public static void main(String[] args) // main ����������뷽������
	{
		Sample test1 = new Sample(" ����1 "); // test1�����ã����Էŵ�ջ���
											 // Sample���Զ������Ӧ�÷ŵ�������
		Sample test2 = new Sample(" ����2 ");

		test1.printName();
		test2.printName();
		
		Sample s2= new Sample("aa");
		final Sample s1=s2; //TODO 2 final �������final ������
		// http://renchx.com/jmm-final/
		// http://wenjiesu.iteye.com/blog/799332
		// http://www.weixueyuan.net/view/6103.html
		s2=new Sample("bb");
		System.out.println(s1);
		System.out.println(s2);
		s1.printName();
		s2.printName();
		
	}
}

class Sample // ����ʱ, jvm ��appmain����Ϣ�����뷽���� {
{
	/** �������� */
	private String name; // new Sampleʵ���� name ���÷���ջ��� name ����������

	/** ���췽�� */
	public Sample(String name) {
		this.name = name;
	}

	/** ��� */
	public void printName() // print����������� �������
	{
		System.out.println(name);
	}

}