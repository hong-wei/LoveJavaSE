package day18.p7.hashmap.demo;

import java.util.HashMap;
import java.util.Map.Entry;

import day18.p2.bean.Father;

import java.util.Set;

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

		HashMap<Father, String> hm = new HashMap<Father, String>();

		hm.put(new Father("lisi", 38), "����");
		hm.put(new Father("zhaoliu", 24), "�Ϻ�");
		hm.put(new Father("xiaoqiang", 31), "����");
		hm.put(new Father("wangcai", 28), "����");
		hm.put(new Father("zhaoliu", 24), "����");

		// 1 ���Դ����Ψһ��
		// �ȱȽ�Hashcode���ٱȽ�equals,ȥ�޸�Sudent�ķ���

		// 2 ����ȡ���ķ���
		Set<Entry<Father, String>> entrySet = hm.entrySet();
		for (Entry<Father, String> entry : entrySet)
		{

			System.out.println(entry.getValue() + ":" + entry.getKey());
		}
	}

}
