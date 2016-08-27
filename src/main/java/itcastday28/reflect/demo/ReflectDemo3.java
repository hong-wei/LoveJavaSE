package itcastday28.reflect.demo;

import java.lang.reflect.Field;

import itcastday28.bean.Person;

public class ReflectDemo3
{
	/**
	 * ��ȡ�ֽ����ļ��е��ֶ�,same function as following:
	 *
	 * <pre>
	 * itcastday28.bean.Person p = new itcastday28.bean.Person();
	 * p.setAge(89);
	 * System.out.println(p.getAge());
	 * </pre>
	 */
	public static void main(String[] args) throws Exception
	{
		Class<?> personClass = Class.forName(Person.PERSON_PATH);

		// field = clazz.getField("age");// ֻ�ܻ�ȡ���еģ�
		Field personAgeField = personClass.getDeclaredField("age");// ֻ��ȡ���࣬������˽�С�

		// ��˽���ֶεķ���ȡ��Ȩ�޼�顣�������ʡ�
		personAgeField.setAccessible(true);

		// ��ȡperson
		Object personObject = personClass.newInstance();

		// ����set�����Ѷ����Ҫ�����ֵ������ϵ��
		personAgeField.set(personObject, 89);

		Object afterConstructPerson = personAgeField.get(personObject);

		System.out.println(afterConstructPerson);

	}

}
