package day19.p4.news.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo
{

	public static void main(String[] args)
	{

		// 1 Array
		int[] arr = { 3, 1, 5, 7, 4 };
		for (int i : arr)
		{

		}
		for (int i : arr)
		{
			System.out.println(i);
		}

		// 2 Collections
		List<String> list = new ArrayList<String>();

		list.add("abc1");
		list.add("abc2");
		list.add("abc3");

		for (String s : list)
		{ // ����д��
			System.out.println(s);
		}

		// 3 Map
		// ����ʹ�ø߼�for����map�����𣿲���ֱ���ã����ǿ��Խ�mapת�ɵ��е�set���Ϳ������ˡ�
		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(3, "zhagsan");
		map.put(1, "wangyi");
		map.put(7, "wagnwu");
		map.put(4, "zhagsansan");

		for (Integer key : map.keySet())
		{
			String value = map.get(key);
			System.out.println(key + "::" + value);
		}

		for (Map.Entry<Integer, String> me : map.entrySet())
		{
			Integer key = me.getKey();
			String value = me.getValue();

			System.out.println(key + ":" + value);
		}
	}

}
