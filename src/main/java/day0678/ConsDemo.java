package day0678;

class Person2
{
	private String name = "007";
	private int age;

	// ����һ��Person��Ĺ��캯����
	Person2()// ���캯���������ǿղ����ġ�
	{
		Person2 a = new Person2();
		name = "baby";
		age = 1;
		System.out.println("person run " + name);
		return;
	}

	// ����еĺ���һ�����������֡�
	Person2(String n)
	{
		System.out.println("person run " + name);
		name = n;

	}

	Person2(String n, int a)
	{
		name = n;
		age = a;
		return;
	}

	public void setName(String n)
	{
		name = n;
	}

	public void speak()
	{
		System.out.println(name + ":" + age);
	}

}

class ConsDemo
{
	public static void main(String[] args)
	{
		// p.speak();
		Person2 p1 = new Person2("����");
		p1.setName("����");

		p1.speak();

		Person2 p2 = new Person2("Сǿ", 10);
		p2.speak();
	}
}
