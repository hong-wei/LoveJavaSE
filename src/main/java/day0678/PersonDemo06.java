package day0678;

/*
�ˣ�
	���ԣ�
		���䡣
	��Ϊ��
		˵����
//BK --day06 Class 4Encapsulation private
private:˽�У���һ��Ȩ�����η���ֻ�����γ�Ա����Ա�����ͳ�Ա������
		˽�е�����ֻ�ڱ�������Ч��

ע�⣺˽�н����Ƿ�װ��һ�����ֶ��ѡ�

*/
class Person3 // only public, abstract & final are permitted
{
	private/* ˽�� */int age;
	public /* ���� */int age1;

	public void setAge(int a)// setXxx getXxx
	{
		age = a;
	}

	public int getAge()
	{
		return age;
	}

	public void haha(int a)
	{
		if (a > 0 && a < 130)
		{
			age = a;
			speak();
		}
		else
		{
			System.out.println("���������");
		}
	}

	void speak()
	{
		System.out.println("age=" + age);
	}
}

class PersonDemo06
{

	public static void main(String[] args)
	{
		Person3 p = new Person3();
		p.age1 = -20;
		p.haha(-20);
		p.speak();
	}
}
