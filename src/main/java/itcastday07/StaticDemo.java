package itcastday07;

class PersionStatic
{
	String name; // ��Ա����==ʵ������
	static String country = "CN";// ��̬����==�����

	public void show()
	{
		System.out.println(PersionStatic.country + ":" + this.name);
	}
}

class StaticDemo
{
	static int num = 4;

	public static void main(String[] args)
	{
		PersionStatic p = new PersionStatic();
		p.name = "Сǿ";
		p.show();
		System.out.println(PersionStatic.country);
		System.out.println(PersionStatic.country);
		// PersionStatic.show();

		StaticDemo.show();
	}

	public static void show()
	{
		System.out.println(StaticDemo.num);
	}
}
