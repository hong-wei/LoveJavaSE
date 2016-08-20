package itcastday19.p2.toolclass.collections.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;

import itcastday19.p2.comparator.ComparatorByLength;

public class CollectionsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		/*
		 * Collections���Ǽ��Ͽ�ܵĹ����ࡣ
		 * ����ķ������Ǿ�̬�ġ�
		 * 
		 * 
		 */
		
		demo_4();
	}
	
	
	public static void demo_4() { //shuffle
		List<String> list = new ArrayList<String>();
		
		list.add("abcde");
		list.add("cba");
		list.add("zhangsan");
		list.add("zhaoliu");
		list.add("xiaoqiang");
		
		System.out.println(list);
//		Collections.replaceAll(list, "cba", "nba"); // set(indexOf("cba"),"nba");
		Collections.shuffle(list);
//		Collections.fill(list, "cc");
		System.out.println(list);
	}

	public static void demo_3() { //reverseOrder
		/*
		TreeSet<String> ts = new TreeSet<String>(new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				
				int temp = o2.compareTo(o1);
				return temp;
			}
			
		});
		*/
		TreeSet<String> ts = new TreeSet<String>(Collections.reverseOrder(new ComparatorByLength()));	
		
		ts.add("abc");
		ts.add("hahaha");
		ts.add("zzz");
		ts.add("aa");
		ts.add("cba");
		
		System.out.println(ts);
		
	}

	public static void demo_2(){//��ȡ���ֵ��
		List<String> list = new ArrayList<String>();
		
		list.add("abcde");
		list.add("cba");
		list.add("aa");
		list.add("zzz");
		list.add("cba");
		list.add("nbaa");
//		Collections.sort(list);
		System.out.println(list);
		
//		int index = Collections.binarySearch(list, "cba");		
//		System.out.println("index="+index);
		
		//��ȡ���ֵ��
		String max = Collections.max(list,new ComparatorByLength());
		System.out.println("max="+max);
	}
	
	
	
	public static void demo_1(){//��list���Ͻ���ָ��˳�������
		
		List<String> list = new ArrayList<String>();
		
		list.add("abcde");
		list.add("cba");
		list.add("aa");
		list.add("zzz");
		list.add("cba");
		list.add("nbaa");
		System.out.println(list);
		
		
		//��list���Ͻ���ָ��˳�������
//		Collections.sort(list);
//		mySort(list);
//		mySort(list,new ComparatorByLength());
		Collections.sort(list,new ComparatorByLength());
		System.out.println(list);
	}
	public static <T> void mySort(List<T> list,Comparator<? super T> comp){
		
		for (int i = 0; i < list.size()-1; i++) {
			
			for (int j = i+1; j < list.size(); j++) {
				
				if(comp.compare(list.get(i), list.get(j))>0){
					
//					T temp = list.get(i);
//					list.set(i, list.get(j));
//					list.set(j, temp);
					Collections.swap(list, i, j);
					
				}
			}
		}
	}
	
	
	public static <T extends Comparable<? super T>> void mySort(List<T> list){
		
		for (int i = 0; i < list.size()-1; i++) {
			
			for (int j = i+1; j < list.size(); j++) {
				
				if(list.get(i).compareTo(list.get(j))>0){
					
//					T temp = list.get(i);
//					list.set(i, list.get(j));
//					list.set(j, temp);
					Collections.swap(list, i, j);
					
				}
			}
		}
	}

	void demo_5() { // ������ͬ����
		/*
		class MyCollections {

			public static void main(String[] args) {
				List list = new ArrayList();// ��ͬ���ġ�
				list = MyCollections.synList(list);// ����һ��ͬ����list.
			}

			public static List synList(List list) {

				return new MyList(list);
			}

			private class MyList implements List {
				private List list;

				private static final Object lock = new Object();

				MyList(List list) {
					this.list = list;
				}

				public boolean add(Object obj) {
					synchronized (lock) {
						return list.add(obj);
					}
				}

				public boolean remove(Object obj) {
					synchronized (lock) {
						return list.remove(obj);
					}
				}

			}
		}*/
	}




}

















