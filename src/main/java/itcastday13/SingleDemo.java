package itcastday13;

/*
���߳��µĵ���

*/

//����ʽ
class Single2 {
	private static final Single2 s = new Single2();

	private Single2() {
	}

	public static Single2 getInstance() {
		return s;
	}
}

// ����ʽ

// ����ͬ��Ϊ�˽�����̰߳�ȫ���⡣
//
// ����˫���ж���Ϊ�˽��Ч�����⡣

class Single1 {
	private static Single1 s = null;

	private Single1() {
	}

	public static Single1 getInstance() {
		if (s == null) // Ч������
		{
			synchronized (Single1.class) // ͬ����ȫ����
			{
				if (s == null)
					// -->0 -->1
					s = new Single1();
			}
		}
		return s;
	}
}

class SingleDemo {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}

// my heaven

class myFH {
	private myFH() {
	};

	private static myFH myFHInstance = new myFH();

	public static myFH getInstance() {
		return myFHInstance;
	}
}

class mySc {
	private mySc() {
	};

	private static mySc myInsatnce = null;

	public static mySc getInstance() {
		if (myInsatnce == null)// t1 t2
			myInsatnce = new mySc();

		return myInsatnce;
	}
}

class myThread1 implements Runnable {

	private Object lock = new Object();
	mySc instance = null;

	@Override
	public void run() {
		if (mySc.getInstance() != null)
			instance = mySc.getInstance();
		else {
			synchronized (lock) {
				instance = mySc.getInstance();
				System.out.println(instance);
			}
		}
	}

}

class myMain1 {
	public static void main(String[] args) {
		myThread1 myThread = new myThread1();
		Thread thread1 = new Thread(myThread);
		Thread thread2 = new Thread(myThread);
		thread1.start();
		thread2.start();
	}
}