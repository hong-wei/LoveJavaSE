package itcastday10;
/*
1 definition  ����Ķ�̬��:����������ָ�����������
	class ����{}
	class è extends ����{}
	class �� extends ���� {}
	è x = new è();
	���� x = new è();//һ������������̬��

	è�������Ｔ�߱���è����̬���־߱��Ŷ������̬��
	����Ƕ���Ķ�̬�ԡ� 
	��˵������һ�������Ӧ�Ų�ͬ����. 

	��̬�ڴ����е����֣�
		������߽ӿڵ�����ָ��������Ķ���

2 ��̬�ĺô���
	����˴������չ�ԣ�ǰ�ڶ���Ĵ������ʹ�ú��ڵ����ݡ�
	eg:void method(Animal a)//Animal a = new Dog();  only design a method.

3 ��̬�ı׶ˣ�
	ǰ�ڶ�������ݲ���ʹ��(����)����������������ݡ�
	eg:a.catchMouse(); // a is animal ,but catMouse is belong to cat. it can not use there.

4 ��̬��ǰ�᣺
	1�������й�ϵ���̳У�ʵ�֡�
	2��Ҫ�и��ǡ� 

5 ת��
	1 ����ת��
		Animal a = new Cat(); 
		//�Զ�����������è���������˶������͡��������й����޷�s���ʡ�
		//���þ������ƶ����й��ܵķ��ʡ�
		//רҵ��������ת�͡������������ء��Ͳ���ʹ����������з�����
	2 ����ת�� 
		//��������þ��嶯��è�����й���,����Խ��ö����������ת�͡�
		Cat c = (Cat)a;//����ת�͵�Ŀ����Ϊ��ʹ�������е����з�����
		c.eat();
		c.catchMouse();
	3 ע�⣺����ת�ͣ���ʼ���ն�������������������͵ı仯��
		Animal a1 = new Dog();
		Cat c1 = (Cat)a1;//ClassCastException
	4 eg:DuoTaiDemo2.java -- ����ʦ�ͱ���ү�Ĺ��¡�
		����ү x= ����ʦ();  dress up as father.No his own functions.
		
		����ʦ y= (����ʦ)x;  turn into himself, has many own features.
		
6 if(a instanceof Cat)
		instanceof�������ж϶���ľ�������,ֻ�������������������ж�
		ͨ��������ת��ǰ���ڽ�׳�Ե��жϡ�

7 ��Ա���ص㣺 eg:DuoTaiDemo3.java
	1����Ա������
		����ʱ���ο������ͱ������������е��Ƿ��е��õĳ�Ա�������У�����ͨ����û�У�����ʧ�ܡ�
		����ʱ���ο������ͱ������������е��Ƿ��е��õĳ�Ա�����������и��������еĳ�Ա������
		��˵����������ж��ο��Ⱥŵ���ߡ�Ŷ�ˡ�
		eg: only care about in the Fu class
			Fu f = new Zi();
			f.show();
			
	2����Ա����(�Ǿ�̬)��
		����ʱ���ο������ͱ������������е��Ƿ��е��õĺ������У�����ͨ����û�У�����ʧ�ܡ�
		����ʱ���ο����Ƕ��������������Ƿ��е��õĺ�����
		��˵�����뿴��ߣ����п��ұߡ�
	
		tips: why is it different from variables? 
			  ��Ϊ��Ա�������ڸ������ԡ�
		eg  : Fu f = new Zi();
			f.show();
			
	3����̬������
		����ʱ���ο������ͱ������������е��Ƿ��е��õľ�̬������
		����ʱ���ο������ͱ������������е��Ƿ��е��õľ�̬������
		��˵����������ж�����ߡ�

		tips: ��ʵ���ھ�̬�������ǲ���Ҫ����ġ�ֱ�����������ü��ɡ�
		eg :f.staticMethod();
*/

abstract class Animal {
	abstract void eat();
}

class Dog extends Animal {
	void eat() {
		System.out.println("�й�ͷ");
	}

	void lookHome() {
		System.out.println("����");
	}
}

class Cat extends Animal {
	void eat() {
		System.out.println("����");
	}

	void catchMouse() {
		System.out.println("ץ����");
	}
}

class Pig extends Animal {
	void eat() {
		System.out.println("����");
	}

	void gongDi() {
		System.out.println("����");
	}
}

class DuoTaiDemo {
	public static void main(String[] args) {
		
		// Cat c = new Cat();
		// c.eat();
		// c.catchMouse();

		Animal a = new Cat(); // �Զ�����������è���������˶������͡��������й����޷�s���ʡ�
								// ���þ������ƶ����й��ܵķ��ʡ�
								// רҵ��������ת�͡������������ء��Ͳ���ʹ����������з�����
		// a.eat();

		// ��������þ��嶯��è�����й��ܡ�
		// ����Խ��ö����������ת�͡�
		// Cat c = (Cat)a;//����ת�͵�Ŀ����Ϊ��ʹ�������е����з�����
		// c.eat();
		// c.catchMouse();

		// ע�⣺����ת�ͣ���ʼ���ն�������������������͵ı仯��
		// Animal a1 = new Dog();
		// Cat c1 = (Cat)a1;//ClassCastException

		/*
		 * Cat c = new Cat();
		 * 
		 * // Dog d = new Dog();
		 * 
		 * // c.eat(); method(c); // method(d); // method(new Pig());
		 */

		method(new Dog());
	}

	public static void method(Animal a)// Animal a = new Dog();
	{
		a.eat();

		// a.catchMouse();
		if (a instanceof Cat) // instanceof�������ж϶���ľ������͡�ֻ�������������������ж�
		// //ͨ��������ת��ǰ���ڽ�׳�Ե��жϡ�

		{
			Cat c = (Cat) a;
			c.catchMouse();
		} else if (a instanceof Dog) {
			Dog d = (Dog) a;
			d.lookHome();
		} else {

		}

	}
	/*
	 * public static void method(Cat c) { c.eat(); } public static void
	 * method(Dog d) {
	 * 
	 * }
	 */
}
