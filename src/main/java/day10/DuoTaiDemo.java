package day10;

interface a
{

}

abstract class Animal implements a
{
	String name = "Yanlu";

	abstract void eat();
}

class Dog extends Animal
{
	@Override
	void eat()
	{
		System.out.println("�й�ͷ");
	}

	void lookHome()
	{
		System.out.println("����");
	}
}

class Cat extends Animal
{
	String carName = "Diandian";

	@Override
	void eat()
	{
		System.out.println("����");
	}

	void catchMouse()
	{
		System.out.println("ץ����");
	}
}

class Pig extends Animal
{
	@Override
	void eat()
	{
		System.out.println("����");
	}

	void gongDi()
	{
		System.out.println("����");
	}
}

class DuoTaiDemo
{
	Cat c212 = new Cat();
	Dog c222 = new Dog();

	public static void main(String[] args)
	{

		Cat c = new Cat();
		System.out.println(c.carName);
		c.eat();
		c.catchMouse();

		Animal a = new Cat(); // �Զ�����������è���������˶������͡��������й����޷�����-catchMouse��
		a.eat(); // ���þ������ƶ����й��ܵķ��ʡ�
					// רҵ��������ת�͡������������ء��Ͳ���ʹ����������з�����
		System.out.println(a.name);

		// ��������þ��嶯��è�����й��ܡ�
		// ����Խ��ö����������ת�͡�
		if (a instanceof Cat)
		{
			Cat c1 = (Cat) a;// ����ת�͵�Ŀ����Ϊ��ʹ�������е����з�����
			c1.eat();
			c1.catchMouse();
		}

		// ע�⣺����ת�ͣ���ʼ���ն�������������������͵ı仯��
		Animal a1 = new Dog();
		// ! Cat c1 = (Cat) a1; ClassCastException

		method(new Dog());
	}

	public static void method(Animal a)// Animal a = new Dog();
	{

		// BK --day10 Class 8Polymorphism 3instanceof
		// instanceof�������ж϶���ľ������͡�ֻ�������������������ж�
		// ͨ��������ת��ǰ���ڽ�׳�Ե��жϡ�
		if (a instanceof Cat)
		{
			Cat c = (Cat) a;
			c.catchMouse();
		}
		else if (a instanceof Dog)
		{
			Dog d = (Dog) a;
			d.lookHome();
		}
		else
		{
			a.eat();
		}

	}
}
