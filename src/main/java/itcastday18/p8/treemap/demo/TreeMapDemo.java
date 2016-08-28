package itcastday18.p8.treemap.demo;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import itcastday18.p2.bean.Student;

/**
 * ���ֱȽ������ж�Ψһ�Խ����ͱȽ����йأ���hashCode��equals�޹�
 *
 * @author zhanghongwei
 *
 */
public class TreeMapDemo
{

	public static void main(String[] args)
	{
		// ����Tree���뵽�Ƚ����� 1 �̳бȽ��� 2 ����һ���Ƚ�����Ϊ���캯��
		TreeMap<Student, String> treeMap = new TreeMap<Student, String>();
		// TreeMap<Student, String> treeMap = new TreeMap<Student, String>(new ComparatorByName());

		treeMap.put(new Student("lisi", 38), "����");
		treeMap.put(new Student("zhaoliu", 24), "�Ϻ�");
		treeMap.put(new Student("zhaoliu1", 24), "�Ϻ�");
		treeMap.put(new Student("zhaoliu2", 24), "�Ϻ�");
		treeMap.put(new Student("zhaoliu3", 24), "�Ϻ�");
		treeMap.put(new Student("viaoqiang", 31), "����");
		treeMap.put(new Student("aangcai", 28), "����");
		treeMap.put(new Student("zhaoliu", 24), "����");

		Iterator<Map.Entry<Student, String>> it = treeMap.entrySet().iterator();

		while (it.hasNext())
		{
			Map.Entry<Student, String> me = it.next();
			Student key = me.getKey();
			String value = me.getValue();

			System.out.println(key.getName() + ":" + key.getAge() + "---" + value);
		}

	}

}
