package itcastday28.reflect.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import itcastday28.bean.Person;

public class ReflectDemo4
{

	public static void main(String[] args) throws Exception
	{
		ReflectDemo4.getMethodDemo1();
		ReflectDemo4.getMethodDemo2();
		ReflectDemo4.getMethodDemo3();
	}

	/**
	 * ��ȡָ��Class�е����й��У�˽�з���
	 */
	public static void getMethodDemo1() throws Exception
	{

		Class<?> clazz = Class.forName(Person.PERSON_PATH);

		Method[] methods = clazz.getMethods();// ��ȡ�Ķ��ǹ��еķ�����
		methods = clazz.getDeclaredMethods();// ֻ��ȡ���������з���������˽�С�
		for (Method method : methods)
		{
			System.out.println(method);
		}

	}

	/**
	 * // ��ȡ�ղ���һ�㷽����
	 *
	 * @throws Exception
	 */
	public static void getMethodDemo2() throws Exception
	{

		Class<?> clazz = Class.forName(Person.PERSON_PATH);

		Method method = clazz.getMethod("show");// ��ȡ�ղ���һ�㷽����

		Constructor<?> constructor = clazz.getConstructor(String.class, int.class);
		Object obj = constructor.newInstance("С��", 37);

		method.invoke(obj);

	}

	/**
	 * ��ȡ�������ķ���
	 *
	 * @throws Exception
	 */
	public static void getMethodDemo3() throws Exception
	{

		Class<?> clazz = Class.forName(Person.PERSON_PATH);

		Method method = clazz.getMethod("paramMethod", String.class, int.class);

		Object obj = clazz.newInstance();

		method.invoke(obj, "Сǿ", 89);

	}

}
