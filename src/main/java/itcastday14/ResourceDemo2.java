package itcastday14;

/*
�ȴ�/���ѻ��ơ� 

�漰�ķ�����

1��wait(): ���̴߳��ڶ���״̬����wait���̻߳ᱻ�洢���̳߳��С�
2��notify():�����̳߳���һ���߳�(����).
3��notifyAll():�����̳߳��е������̡߳�

��Щ���������붨����ͬ���С�
��Ϊ��Щ���������ڲ����߳�״̬�ķ�����
����Ҫ��ȷ���ײ��������ĸ����ϵ��̡߳�


Ϊʲô�����̵߳ķ���wait notify notifyAll��������Object���У� 

��Ϊ��Щ�����Ǽ������ķ�������������ʵ��������
������������Ķ�������Ķ�����õķ�ʽһ��������Object���С�

*/
//��Դ
class Resource2 {
	String name;
	String sex;
	boolean flag = false;
}

// ����
class Input2 implements Runnable {
	Resource2 r;

	// Object obj = new Object();
	Input2(Resource2 r) {
		this.r = r;
	}

	public void run() {
		int x = 0;
		while (true) {
			synchronized (r) {
				if (r.flag)
					try {
						r.wait();
					} catch (InterruptedException e) {
					}
				if (x == 0) {
					r.name = "mike";
					r.sex = "nan";
				} else {
					r.name = "����";
					r.sex = "ŮŮŮŮŮŮ";
				}
				r.flag = true;
				r.notify();
			}
			x = (x + 1) % 2;

		}
	}
}

// ���
class Output2 implements Runnable {

	Resource2 r;

	// Object obj = new Object();
	Output2(Resource2 r) {
		this.r = r;
	}

	public void run() {
		while (true) {
			synchronized (r) {
				if (!r.flag)
					try {
						r.wait();
					} catch (InterruptedException e) {
					}
				System.out.println(r.name + "....." + r.sex);
				r.flag = false;
				r.notify();
			}
		}
	}
}

class ResourceDemo2 {
	public static void main(String[] args) {
		// ������Դ��
		Resource2 r = new Resource2();
		// ��������
		Input2 in = new Input2(r);
		Output2 out = new Output2(r);
		// �����̣߳�ִ��·����
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);
		// �����߳�
		t1.start();
		t2.start();
	}
}
