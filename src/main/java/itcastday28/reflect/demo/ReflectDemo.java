package itcastday28.reflect.demo;

import javax.swing.JButton;

import itcastday17.p.bean.PersionMy;
import itcastday28.bean.Person;

/*
 * JAVA���������������״̬�У���������һ���� (class�ļ�)�����ܹ�֪���������������Ժͷ�����
 * ��������һ�����󣬶��ܹ�������������һ�����������ԣ�
 * ���ֶ�̬��ȡ����Ϣ�Լ���̬���ö���ķ����Ĺ��ܳ�Ϊjava���Եķ�����ơ� 
 * 
 * 
 * ��̬��ȡ������Ϣ������java���� ��
 * �������Ϊ����Ľ��ʡ�
 * 
 * 
 * Ҫ��Ҫ���ֽ����ļ����н��ʣ�����Ҫ���ֽ����ļ�����.
 * ��λ�ȡ�ֽ����ļ������أ�
 * 
 */

public class ReflectDemo {

	/**
	 * @param args
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws ClassNotFoundException {

		// getClassObject_3();
		getClassObject_1();

	}
	/*
	 * ��ʽ���� ֻҪͨ����������� �ַ������ƾͿ��Ի�ȡ���࣬��Ϊ��չ�� ������Class���еķ�����ɡ� �÷�������forName.
	 * ���ַ�ʽֻҪ�����Ƽ��ɣ���Ϊ���㣬��չ�Ը�ǿ��
	 */

	public static void getClassObject_3() throws ClassNotFoundException {

		String className = "itcastday28.bean.Person";

		Class clazz = Class.forName(className);

		System.out.println(clazz);
	}

	/*
	 * ��ʽ���� 2���κ��������Ͷ��߱�һ����̬������.class����ȡ���Ӧ��Class���� ��Լ򵥣����ǻ���Ҫ��ȷ�õ����еľ�̬��Ա��
	 * ���ǲ�����չ��
	 * 
	 */
	public static void getClassObject_2() {

		Class clazz = Person.class;
		Class clazz1 = Person.class;
		System.out.println(clazz == clazz1);
	}

	/*
	 * ��ȡ�ֽ������ķ�ʽ�� 1��Object���е�getClass()�����ġ� ��Ҫ�����ַ�ʽ������Ҫ��ȷ������࣬���������� �鷳 .
	 * 
	 */
	public static void getClassObject_1() {

		Person p = new Person();
		Class clazz = p.getClass();

		Person p1 = new Person();
		Class clazz1 = p1.getClass();

		itcastday28.bean.Person person = new itcastday28.bean.Person();
		System.out.println(person.getClass().getName());

		System.out.println(clazz == clazz1);

		JButton b1 = new JButton("button1");

		System.out.println(b1.getClass());
		System.out.println(b1.getClass().getName());
		System.out.println(JButton.class);
		int a = 5;
		System.out.println(JButton.class);
		System.out.println(String.class);
		System.out.println(int.class);
		System.out.println(AAA.class);
		Class<?> clazz2 = boolean.class;
		clazz2.getName();
	}
}

interface AAA{
	
}
