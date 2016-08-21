package itcastday11;

/*
Object:������ĸ��ࡣ
	Object�ǲ��ϳ�ȡ�������߱������ж��󶼾߱��Ĺ������ݡ�
*/
class Person {
	private int age;

	Person(int age) {
		this.age = age;
	}

	// һ�㶼�Ḳ�Ǵ˷��������ݶ�����������ݣ������ж϶����Ƿ���ͬ�����ݡ�
	@Override
	public boolean equals(Object obj) { 
		
        if(!(obj instanceof Person))// ��׳���ж�
        	throw new ClassCastException("Wrong data type!!!");
        
		Person p = (Person)obj;  // ����ת��
		return (this.age == p.age);
    }

	public int hashCode() {
		return age;
	}

	public String toString() {
		return "Person :" + age;
	}
}

class ObjectDemo {
	public static void main(String[] args) {
		//1 equals can accept different kinds of objects
		Person p1 = new Person(20);
		Person p2 = new Person(20);
		Person p3 = p1;
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));  
		
		//2 equals can accept different kinds of objects
		String a = "a";
		class Demo {
		}
		Demo d = new Demo();
		System.out.println(a.equals(d));
		//3 equals :test the keyword: instanceof
		System.out.println("Hello" instanceof String);
		System.out.println(d instanceof Demo);

		//4 hasCode 
		System.out.println(p1);
		System.out.println(p1.hashCode());
		
		//5getClass()
		 Class clazz1 = p1.getClass();
		 Class clazz2 = p2.getClass();
		 System.out.println(clazz1==clazz2);
		 System.out.println(clazz1.getName());
		 
		 //6toString()
		 System.out.println(p1.toString());//Person@61de33
		 System.out.println(p1.getClass().getName()+"$"+p1.hashCode());//Person@61de33

	}
}
