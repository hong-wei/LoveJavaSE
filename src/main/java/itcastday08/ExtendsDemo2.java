package itcastday08;

/*
���Ӹ����У���Ա���ص����֡�
	1����Ա������
	2����Ա������
	3�����캯����

this��super���÷������ơ�
	1 ������ĳ�Ա�;ֲ�����ͬ����this���֡�
	  ���Ӹ����еĳ�Ա����ͬ����super���ָ��ࡣ
	2 this:����һ�������������á�
	  super������һ������ռ䡣
*/
class Fu
{
	private int num = 4;

	public int getNum()
	{
		return num;
	}
}


class Zi extends Fu
{
	private int num = 5;

	void show()
	{
		System.out.println(this.num+"....."+super.getNum());
	}
}


class ExtendsDemo2 
{
	public static void main(String[] args) 
	{
		Zi z = new Zi();
		z.show();
	}
}