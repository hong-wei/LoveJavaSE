package itcastday18.p7.hashmap.demo;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import itcastday18.p2.bean.Student;

/**
 * ��ѧ�������ѧ���Ĺ�����ͨ������ֵ�洢��map�����С�
 *
 * @author zhanghongwei
 *
 */
public class HashMapDemo
{
	public static void main(String[] args)
	{
		/*
		 * ��ѧ�������ѧ���Ĺ�����ͨ������ֵ�洢��map�����С�
		 *
		 */

		HashMap<Student, String> hm = new HashMap<Student, String>();

		hm.put(new Student("lisi", 38), "����");
		hm.put(new Student("zhaoliu", 24), "�Ϻ�");
		hm.put(new Student("xiaoqiang", 31), "����");
		hm.put(new Student("wangcai", 28), "����");
		hm.put(new Student("zhaoliu", 24), "����");

		// 1 ���Դ����Ψһ��
		// �ȱȽ�Hashcode���ٱȽ�equals,ȥ�޸�Sudent�ķ���

		// 2 ����ȡ���ķ���
		Set<Entry<Student, String>> entrySet = hm.entrySet();
		for (Entry<Student, String> entry : entrySet)
		{

			System.out.println(entry.getValue() + ":" + entry.getKey());
		}
	}

}
