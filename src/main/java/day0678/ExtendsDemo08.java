package day0678;

/*
 ��ȡ����������
class Demo
{
	void show1(){}
}


class DemoA extends Demo
{
//	void show1(){}
	void show2(){}
}
class DemoB extends Demo
{
//	void show1(){}
	void show3(){}
}
s
 ��̳г��ֵĲ�ȷ���ԣ�
class A
{
	void show()
	{
		System.out.println("a");
	}
}
class B
{
	void show()
	{
		System.out.println("b");
	}
}
class C extends A,B
{
}
new C().show();
*/
class Person4
{
	// ��ȡ���Ե�����
	String name;
	int age;
}

class Student extends/* �̳� */ Person4
{
	// String name;
	// int age;
	void study()
	{
		System.out.println(name + "...student study.." + age);
	}
}

class Worker extends Person4
{
	// String name;
	// int age;
	void work()
	{
		System.out.println("worker work");
	}
}

public class ExtendsDemo08
{
	public static void main(String[] args)
	{
		Student student = new Student();
		student.name = "zhangsan";
		student.age = 22;
		student.study();
	}
}
