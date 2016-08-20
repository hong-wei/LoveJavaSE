package itcastday14;

/*
	�̼߳�ͨѶ������߳��ڴ���ͬһ��Դ����������ȴ��ͬ��
*/

//��Դ
class Resource1 {
	String name;
	String sex;
}

// ����
class Input implements Runnable {
	Resource1 r;

	// Object obj = new Object();
	Input(Resource1 r) {
		this.r = r;
	}

	public void run() {
		int x = 0;
		while (true) {
			synchronized (r) {
				if (x == 0) {
					r.name = "mike";
					r.sex = "nan";
				} else {
					r.name = "����";
					r.sex = "ŮŮŮŮŮŮ";
				}
			}
			x = (x + 1) % 2;
		}
	}
}

// ���
class Output implements Runnable {

	Resource1 r;

	// Object obj = new Object();
	Output(Resource1 r) {
		this.r = r;
	}

	public void run() {
		while (true) {
			synchronized (r) {
				System.out.println(r.name + "....." + r.sex);
			}
		}
	}
}

class ResourceDemo {
	public static void main(String[] args) {
		// ������Դ��
		Resource1 r = new Resource1();
		// ��������
		Input in = new Input(r);
		Output out = new Output(r);
		// �����̣߳�ִ��·����
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);
		// �����߳�
		t1.start();
		t2.start();
	}
}

// My Heaven
class MyTestResource {
	public static void main(String[] args) {
		// 1 creat the recource
		RecourceMy myResource = new RecourceMy();

		// 2 discribute the resource
		WriteJob writeJob = new WriteJob(myResource);
		ReadJob readJob = new ReadJob(myResource);

		Thread t1 = new Thread(writeJob);
		Thread t2 = new Thread(readJob);

		// 3 start job
		t1.start();
		t2.start();
	}
}

class RecourceMy {
	private String name;
	private String sex;
	private boolean writeReadFlag = false;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	synchronized void set() {
		if (writeReadFlag)
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		name = "A";
		sex = "A";
		writeReadFlag = true;
		System.out.println(this.name + "....." + this.sex);
		this.notify();
	}

	synchronized void get() {
		if (!writeReadFlag)
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		name = "B";
		sex = "B";
		writeReadFlag = false;
		System.out.println(this.name + "....." + this.sex);
		this.notify();
	}

}

class WriteJob implements Runnable {
	RecourceMy my;

	public WriteJob(RecourceMy myResource) {
		this.my = myResource;
	}

	@Override
	public void run() {
		while (true) {
			my.set();
		}
	}

}

class ReadJob implements Runnable {
	RecourceMy my;

	public ReadJob(RecourceMy myResource) {
		this.my = myResource;
	}

	@Override
	public void run() {
		while (true) {
			my.get();
		}
	}
}
