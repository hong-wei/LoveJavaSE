package day28.reflect.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import day28.bean.Person;

public class ReflectDemo2
{

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, Exception
	{
		ReflectDemo2.createNewObject1();
		ReflectDemo2.createNewObject2();
	}

	/**
	 * ��ȡ�޲����Ĺ��캯��
	 *
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public static void createNewObject1() throws ClassNotFoundException, InstantiationException, IllegalAccessException
	{

		// ���ڣ�newʱ���ȸ��ݱ�new�����������Ѱ������ֽ����ļ��������ؽ��ڴ棬
		// ���������ֽ����ļ����󣬲����Ŵ������ֽ��ļ��Ķ�Ӧ��Person����.
		day28.bean.Person p = new day28.bean.Person();

		// ���ڣ�
		// ��Ѱ���������ļ��������ؽ��ڴ棬������Class����
		Class<?> clazz = Class.forName(Person.PERSON_PATH);
		// ��β�������Ķ����أ�
		Object obj = clazz.newInstance();

	}

	/**
	 * ��ȡ���ر�����Ĺ��캯���� clazz.getConstructor(String.class, int.class);
	 *
	 * <pre>
	 * Same function as :
	 * itcastday28.bean.Person p = new itcastday28.bean.Person("Сǿ", 39);
	 *
	 * ����ȡָ�����ƶ�Ӧ���е������ֵĶ���ʱ�����ö����ʼ����ʹ�ÿղ����������ô���أ�
	 * ��Ȼ��ͨ��ָ���Ĺ��캯�����ж���ĳ�ʼ��������Ӧ���Ȼ�ȡ���ù��캯���� ͨ���ֽ����ļ����󼴿���ɡ�
	 * �÷����ǣ�getConstructor(paramterTypes)��
	 * </pre>
	 *
	 * @throws ClassNotFoundException
	 * @throws SecurityException
	 * @throws NoSuchMethodException
	 * @throws InvocationTargetException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 */
	public static void createNewObject2() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{

		// ��Ѱ���������ļ��������ؽ��ڴ棬������Class����
		Class<?> clazz = Class.forName(Person.PERSON_PATH);

		// ��ȡ����ָ���Ĺ��캯������
		Constructor<?> constructor = clazz.getConstructor(String.class, int.class);

		// ͨ���ù����������newInstance�������ж���ĳ�ʼ����
		Object obj = constructor.newInstance("С��", 38);

	}
}
