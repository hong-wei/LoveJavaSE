package itcastday08;


//��Ա������
/*
���Ӹ����г��ֳ�Ա����һģһ�������������������ĺ����� �������󣬳�Ϊ���ǲ�������ʱ�������Ӹ����е����ԡ�
�����������ԣ�
	1�����ء�ͬһ�����С�overload
	2�����ǡ������С�����Ҳ��Ϊ��д����д��override
	
����ע�����
	1�����෽�����Ǹ��෽��ʱ������Ȩ�ޱ���Ҫ���ڵ��ڸ����Ȩ�ޡ� 
	2����ֻ̬�ܸ��Ǿ�̬���򱻾�̬���ǡ�
	3�����뱣֤�Ӹ�һģһ������������ֵ��
*/
/*
ʲôʱ��ʹ�ø��ǲ���?  Phone class for this meaning
	����һ��������������չʱ��������Ҫ��������Ĺ���������
	����Ҫ���������иù��ܵ���������ʱ����ʹ�ø��ǲ������.

*/
class Fu1
{
	public static  void show()
	{
		System.out.println("fu show run");
	}
}

class  Zi1 extends Fu1
{
	public static void show()
	{
		System.out.println("Zi1 show run");
	}
}

class ExtendsDemo3 
{
	public static void main(String[] args) 
	{
//		Zi1 z = new Zi1();
//		z.show();
		NewPhone p = new NewPhone();
		p.show();
		p.call();
	}
}


class Phone
{
	void call()
	{}
	void show()
	{		
		System.out.println("number");
	}
}

class NewPhone extends Phone
{
	void show()
	{
		System.out.println("name");
		System.out.println("pic");
		super.show();
	}
}











