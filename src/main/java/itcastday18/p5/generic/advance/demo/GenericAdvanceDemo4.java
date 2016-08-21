package itcastday18.p5.generic.advance.demo;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

import itcastday18.p2.bean.Person;
import itcastday18.p2.bean.Student;
import itcastday18.p2.bean.Worker;

public class GenericAdvanceDemo4 {
	public static void main(String[] args) {

		TreeSet<Person> al1 = new TreeSet<Person>(new CompByName()); // person �м���ѧ�������ˣ���ô����
																	 // �����ø���ıȽ�����

		al1.add(new Person("abc4", 34));
		al1.add(new Person("abc1", 30));
		al1.add(new Person("abc2", 38));

		TreeSet<Student> al2  = new TreeSet<Student>(new CompByStuName());// ѧ�����Դ����Լ��ıȽ���
		TreeSet<Student> al22 = new TreeSet<Student>(new CompByName());   // ѧ�����Դ����Լ����ıȽ���
//		TreeSet<Student> al222 = new TreeSet<Student>(new CompByWorkerName());  // ѧ�������Դ����Լ����ӵıȽ���

		al2.add(new Student("stu1", 11));
		al2.add(new Student("stu7", 20));
		al2.add(new Student("stu2", 22));

		TreeSet<Worker> al3 = new TreeSet<Worker>(new CompByName());// ѧ�����Դ����Լ�үү�ıȽ���

		al3.add(new Worker("stu1", 11));
		al3.add(new Worker("stu2", 22));

		al1.addAll(al2);
		al1.addAll(al3);

		System.out.println(al1.size());

		Iterator<Student> it = al2.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("------------");
		Iterator<Person> it1 = al1.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}

	}
}

/*
 * class TreeSet<E> { 
 * 	TreeSet(Comparator<? super E> comparator) );
 *  TreeSet(Comparator<? extends E> comparator) ); 
 * }
 * 
 * ʲôʱ���������أ�ͨ���Լ����е�Ԫ�ؽ���ȡ������ʱ�������������ޡ�
 * 
 */

class CompByName implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {

		int temp = o1.getName().compareTo(o2.getName());

		return temp == 0 ? o1.getAge() - o2.getAge() : temp;
	}

}

class CompByStuName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		int temp = o1.getName().compareTo(o2.getName());

		return temp == 0 ? o1.getAge() - o2.getAge() : temp;
	}

}

class CompByWorkerName implements Comparator<Worker> {

	@Override
	public int compare(Worker o1, Worker o2) {

		int temp = o1.getName().compareTo(o2.getName());

		return temp == 0 ? o1.getAge() - o2.getAge() : temp;
	}

}
