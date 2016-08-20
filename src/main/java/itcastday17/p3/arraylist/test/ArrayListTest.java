/**
 * �붨��ArryaList���ϣ����洢Person������new Person("lisi",20);
	��ȡ�����������������ӡ������
	@author zhanghongwei
 * */
package itcastday17.p3.arraylist.test;

import java.util.ArrayList;
import java.util.Iterator;

import itcastday17.p.bean.PersionMy;
import itcastday17.p.bean.Person;

public class ArrayListTest {
	public static void main(String[] args) {
		
		Person p1 = new Person("lisi1",21);
		
		ArrayList <Person> al = new ArrayList<Person> ();
		al.add(p1);
		al.add(new Person("lisi2",22));
		al.add(new Person("lisi3",23));
		al.add(new Person("lisi4",24));
		
		Iterator<Person> it = al.iterator();
		while(it.hasNext()){
			Person p =  it.next();
			System.out.println(p.getName()+"--"+p.getAge());
		}
		//myPlace
		myPlace();
	}

	private static void myPlace() {
		System.out.println("----myPlace---");
		ArrayList arrayList = new ArrayList();
		arrayList.add(new PersionMy("Hongwei", 28));
		arrayList.add(new PersionMy("Yanlu", 25));
		arrayList.add(new PersionMy("Laoguan", 33));
		arrayList.add(new PersionMy("Defu", 32));
		
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
			PersionMy p  = (PersionMy) iterator.next();
			System.out.println(p.getName()+"--"+p.getAge());
		}
		
	}
	

}
