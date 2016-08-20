package itcastday12;

/*
��δ���һ���߳��أ�
	�����̷߳�ʽһ���̳�Thread�ࡣ

���裺
1������һ����̳�Thread�ࡣ
2������Thread���е�run������
3��ֱ�Ӵ���Thread��������󴴽��̡߳�
4������start���������̲߳������̵߳�����run����ִ�С�

����ͨ��Thread��getName��ȡ�̵߳����� Thread-���(��0��ʼ)

���̵߳����־���main��
*/

/*
class Demo2 {
	private String name;

	Demo2(String name) {
		this.name = name;
	}

	public void run() {
		for (int x = 0; x < 10; x++) {
			System.out.println(name + "....x=" + x);
		}
	}
}

class ThreadDemo2 {
	public static void main(String[] args) {
		Demo2 d1 = new Demo2("����");
		Demo2 d2 = new Demo2("xiaoqiang");
		d1.run();
		d2.run();
	}
}
*/

/*
class Demo2 extends Thread {
	private String name;

	Demo2(String name) {
		this.name = name;
	}

	public void run() {
		for (int x = 0; x < 10; x++) {
			for (int y = -9999999; y < 999999999; y++) {
			}
			System.out.println(name + "....x=" + x);
		}
	}
}

class ThreadDemo2 {
	public static void main(String[] args) {
		Demo2 d1 = new Demo2("����");
		Demo2 d2 = new Demo2("xiaoqiang");
		d1.start();// �����̣߳�����run������
		d2.start();
		System.out.println("over....");
	}
}
*/

class Demo2 extends Thread {
	private String name;

	Demo2(String name) {
		super(name);// set the name for thread object
		this.name =name;
	}

	public void run() {
		for (int x = 0; x < 10; x++) {
			System.out.println(name + "....x=" + x + ".....Thread name=" + Thread.currentThread().getName());
		}
	}
}

class ThreadDemo2 {
	public static void main(String[] args) {
		Demo2 d1 = new Demo2("����");
		Demo2 d2 = new Demo2("xiaoqiang");
//		d1.run();// �����̣߳�����run������
//		d2.run();
		
		d1.start();// �����̣߳�����run������
		d2.start();
		
		System.out.println("over...." + Thread.currentThread().getName());
	}
}
// ����run�͵���start��ʲô����
