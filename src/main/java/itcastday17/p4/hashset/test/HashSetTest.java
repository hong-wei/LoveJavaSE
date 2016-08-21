package itcastday17.p4.hashset.test;

import java.util.HashSet;
import java.util.Iterator;

import itcastday17.p.bean.PersionMy;
import itcastday17.p.bean.Person;


/*
 * ��hashSet�����д洢Person�������������������ͬ����Ϊͬһ���ˡ���Ϊ��ͬԪ�ء�
 */
public class HashSetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HashSet hs = new HashSet();
		/*
		 * HashSet�������ݽṹ�ǹ�ϣ�����Դ洢Ԫ�ص�ʱ��
		 * ʹ�õ�Ԫ�ص�hashCode������ȷ��λ�ã����λ����ͬ����ͨ��Ԫ�ص�equals��ȷ���Ƿ���ͬ��
		 * 
		 */
		
		hs.add(new Person("lisi4",24));
		hs.add(new Person("lisi7",27));
		hs.add(new Person("lisi1",21));
		hs.add(new Person("lisi9",29));
		hs.add(new Person("lisi7",27));
		
		
		Iterator it = hs.iterator();
		
		while(it.hasNext()){
			Person p = (Person)it.next();
			System.out.println(p);
//			System.out.println(p.getName()+"...."+p.getAge());
		}
		//My place
		myPlace();
		
	}

	private static void myPlace() {
		System.out.println("----myPlace------");
		HashSet personLish = new HashSet();
		personLish.add(new PersionMy("Hongwei", 28));
		personLish.add(new PersionMy("Yanlu", 25));
		personLish.add(new PersionMy("Laoguan", 33));
		personLish.add(new PersionMy("Defu", 32));
		personLish.add(new PersionMy("Defu", 32));
		personLish.add(new PersionMy("Defu", 32));
		personLish.add(new PersionMy("Defu", 34));
		personLish.add(new PersionMy("Def", 32));
		
		for (Iterator iterator = personLish.iterator(); iterator.hasNext();) {
			PersionMy object = (PersionMy) iterator.next();
			System.out.println(object.getName()+object.getAge());
		}
		
	}

}
