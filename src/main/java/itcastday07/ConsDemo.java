package itcastday07;

class Person
{
	private String name = "007";
	private int age;

	// ����һ��Person��Ĺ��캯����
	Person()// ���캯���������ǿղ����ġ�
	{
		Person a = new Person();
		name = "baby";
		age = 1;
		System.out.println("person run " + name);
	}

	// ����еĺ���һ�����������֡�
	Person(String n)
	{
		System.out.println("person run " + name);
		name = n;

	}

	Person(String n, int a)
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
		Person p1 = new Person("����");
		p1.setName("����");

		p1.speak();

		Person p2 = new Person("Сǿ", 10);
		p2.speak();
	}
}
