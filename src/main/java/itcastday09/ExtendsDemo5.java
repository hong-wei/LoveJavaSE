package itcastday09;
/*
һ������ʵ�������̣�
Person p = new Person();
1��JVM���ȡָ����·���µ�Person.class�ļ��������ؽ��ڴ棬
	�����ȼ���Person�ĸ���(�����ֱ�ӵĸ���������).
2���ڶ��ڴ��еĿ��ٿռ䣬�����ַ��
3�����ڶ���ռ��У��Զ����е����Խ���Ĭ�ϳ�ʼ����
4�����ö�Ӧ�Ĺ��캯�����г�ʼ����
5���ڹ��캯���У���һ�л��ȵ����ø����й��캯�����г�ʼ����
6�������ʼ����Ϻ��ڶ���������Խ�����ʾ��ʼ����
7���ڽ������๹�캯�����ض���ʼ����
8����ʼ����Ϻ󣬽���ֵַ��ֵ�����ñ���.

*/




class Fu5
{
	int num = 8;
	Fu5()
	{
		super();
		show();
		return;
	}

	void show()
	{
		System.out.println("fu show"+num);
	}
}
class Zi5 extends Fu5
{
	int num = 8;
	Zi5()
	{
		super();
		//-->ͨ��super��ʼ����������ʱ������ĳ�Ա������δ��ʾ��ʼ������super()�����ʼ����Ϻ�
		//�Ž�������ĳ�Ա������ʾ��ʼ����

		System.out.println("zi cons run...."+num);
		return;
	}
	void show()
	{
		System.out.println("zi show..."+num);
	}
}
class ExtendsDemo5 
{
	public static void main(String[] args) 
	{
		Zi5 z = new Zi5();
		z.show();
	}
	
}



