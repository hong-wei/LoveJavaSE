package day28.reflect.demo;

import javax.swing.JButton;

import day28.bean.Person;

public class ReflectDemo
{

	/**
	 * enum all can be reflected
	 *
	 * @author zhanghongwei
	 *
	 */
	enum TestEnum
	{
		A, B, C
	}

	/**
	 * interface
	 *
	 * @author zhanghongwei
	 *
	 */
	interface Interface
	{

	}

	public static void main(String[] args) throws ClassNotFoundException
	{

		ReflectDemo.getClassObject();

		// BK --day28 Reflection 1Get Class
		ReflectDemo.getClassObject_1();
		ReflectDemo.getClassObject_2();
		ReflectDemo.getClassObject_3();

	}

	/**
	 * Basic concepts on Class
	 */
	public static void getClassObject()
	{
		Person p = new Person();
		Class<? extends Person> clazz = p.getClass();

		Person p1 = new Person();
		Class<? extends Person> clazz1 = p1.getClass();

		day28.bean.Person person = new day28.bean.Person();
		System.out.println(person.getClass().getName());

		System.out.println(clazz == clazz1);
	}

	/**
	 * ��ʽһ��Object���е�getClass()�����ġ� ��Ҫ�����ַ�ʽ������Ҫ��ȷ��������Ҵ�������
	 *
	 */
	public static void getClassObject_1()
	{

		Person p = new Person();
		Class<? extends Person> clazz = p.getClass();

		Person p1 = new Person();
		Class<? extends Person> clazz1 = p1.getClass();

		day28.bean.Person person = new day28.bean.Person();
		System.out.println(person.getClass().getName());

		System.out.println(clazz == clazz1);

	}

	/**
	 * ��ʽ�����κ��������Ͷ��߱�һ����̬������.class����ȡ���Ӧ��Class���� ��Լ򵥣����ǻ���Ҫ��ȷ�õ����еľ�̬��Ա�� ���ǲ�����չ��
	 *
	 */
	public static void getClassObject_2()
	{
		// 1 ԭʼ��
		System.out.println(byte.class);
		System.out.println(short.class);
		System.out.println(int.class);
		System.out.println(long.class);
		System.out.println(double.class);
		System.out.println(float.class);

		System.out.println(char.class);

		System.out.println(boolean.class);
		System.out.println(void.class);

		// 2�࣬�ӿڣ�����
		System.out.println(String.class);
		System.out.println(int[].class);
		System.out.println(Person[].class);
		System.out.println(Integer.class);
		System.out.println(JButton.class);
		System.out.println(TestEnum.class);
		System.out.println(Interface.class);
		// 3 �Ƚϵ�ַ
		Class<?> clazz2 = boolean.class;
		clazz2.getName();
		Class<Person> clazz = Person.class;
		Class<Person> clazz1 = Person.class;
		System.out.println(clazz == clazz1);
	}

	/**
	 * ��ʽ���� ֻҪͨ������������ַ������ƾͿ��Ի�ȡ���࣬��Ϊ��չ�� ������Class���еķ�����ɡ� �÷�������forName. ���ַ�ʽֻҪ�����Ƽ��ɣ���Ϊ���㣬��չ�Ը�ǿ��
	 *
	 */
	public static void getClassObject_3() throws ClassNotFoundException
	{

		// ����һ����

		Class<?> clazz = Class.forName(Person.PERSON_PATH);
		System.out.println(clazz);

		// ����һ������
		String className = "[I";
		clazz = Class.forName(className);
		System.out.println(clazz);
	}
}
