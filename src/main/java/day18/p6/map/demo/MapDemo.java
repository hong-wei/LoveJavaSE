package day18.p6.map.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import day18.p6.map.demo.MyMap.MyEntry;

public class MapDemo
{

	public static void main(String[] args)
	{
		Map<Integer, String> map = new HashMap<Integer, String>();
		// ���Ԫ�ء�
		System.out.println(map.put(8, "wangcai"));// null
		System.out.println(map.put(8, "xiaoqiang"));// wangcai ����ͬ����ֵ�Ḳ�ǡ�
		map.put(2, "zhangsan");
		map.put(7, "zhaoliu");

		// ɾ����
		System.out.println("remove:" + map.remove(2));

		// �жϡ�
		System.out.println("containskey:" + map.containsKey(7));

		// ��ȡ��
		System.out.println("get:" + map.get(6));

		// three ways to iterator the items
		MapDemo.threeIteratorMethods(map);
	}

	public static void threeIteratorMethods(Map<Integer, String> map)
	{
		// 1 values�õ�
		map.put(8, "zhaoliu");
		map.put(2, "zhaoliu");
		map.put(7, "xiaoqiang");
		map.put(6, "wangcai");
		map.put(null, "wangcai");
		map.put(null, "wangcai");

		Collection<String> values = map.values();
		for (String string : values)
		{
			System.out.println(string);
		}

		// 2ȡ��map�е�����Ԫ�ء�
		// ԭ��ͨ��keySet������ȡmap�����еļ����ڵ�Set���ϣ���ͨ��Set�ĵ�������ȡ��ÿһ������
		// �ڶ�ÿһ����ͨ��map���ϵ�get������ȡ���Ӧ��ֵ���ɡ�
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> it3 = keySet.iterator();

		while (it3.hasNext())
		{
			Integer key = it3.next();
			String value = map.get(key);
			System.out.println(key + ":" + value);

		}

		// 3 ͨ��Mapת��set�Ϳ��Ե����� �ҵ�����һ��������entrySet��
		// �÷���������ֵ��ӳ���ϵ��Ϊ����洢����Set�����У�
		// �����ӳ���ϵ�����;���Map.Entry����(���֤)

		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		Iterator<Map.Entry<Integer, String>> it = entrySet.iterator();
		while (it.hasNext())
		{
			Map.Entry<Integer, String> me = it.next();
			Integer key = me.getKey();
			String value = me.getValue();
			System.out.println(key + "::::" + value);

		}

		// 4����ڲ���
		// �Զ����ڲ���ķ�ʽ��
		Set<MyMap.MyEntry<Integer, String>> set = new HashSet<MyMap.MyEntry<Integer, String>>();

		for (MyEntry<Integer, String> myEntry : set)
		{
			System.out.println(myEntry);
		}

	}

}

interface MyMap // BK --day10 Class 9Inner class 5���� 1�ڲ��ӿ�
{
	public interface MyEntry<K, V> // MyEntry��������MyMap���������������ڲ��ࡣֻ���Ƚ�飬���н��֤��
	{
		void get();
	}
}

class MyDemo implements MyMap.MyEntry<Integer, String>
{

	@Override
	public void get()
	{
		System.out.println("hhh");
	}

	public static void main(String[] args)
	{
		new MyMap.MyEntry<Integer, String>()
		{
			@Override
			public void get()
			{
				System.out.println("hhh");
			}
		}.get();
	}
}
