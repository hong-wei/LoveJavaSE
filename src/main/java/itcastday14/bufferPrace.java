package itcastday14;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
�����ߣ������ߡ�

�������ߣ��������ߵ����⡣
if�жϱ�ǣ�ֻ��һ�Σ��ᵼ�²������е��߳������ˡ����������ݴ���������
while�жϱ�ǣ�������̻߳�ȡִ��Ȩ���Ƿ�Ҫ���У�

notify:ֻ�ܻ���һ���̣߳�������������˱�����û�����塣����while�жϱ��+notify�ᵼ��������
notifyAll����˱����߳�һ���ỽ�ѶԷ��̵߳����⡣

*/
/*
 * 
 * 1 many producers and many consumers 
 * 	1 single pro single cons
 * 	2 many 
 * 
 * 
 * */
class PeoCusMain3 {
	public static void main(String[] args) {
		Fish3 Fish3 = new Fish3();

		ProducerMy3 producer = new ProducerMy3(Fish3);
		ConsumerMy3 Consumer = new ConsumerMy3(Fish3);

		Thread t1 = new Thread(producer);
		Thread t2 = new Thread(producer);
		Thread t3 = new Thread(producer);
		Thread t4 = new Thread(Consumer);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}

class Fish3 {
	int number = 0;
	boolean flag = false;
	// access the resource protected by this lock
	Lock l = new ReentrantLock();
	
	// tow monitores
	Condition cookCondition = l.newCondition();
	Condition eatCondition  = l.newCondition();
	
	// sychronised , make one and buy one
	void cookFish() throws InterruptedException { // t0
		l.lock();
		try {
			while (flag)
				cookCondition.wait(); // t1
			System.out.println("1");
			flag = true;
			eatCondition.signal();
		} finally {
			l.unlock();
		}
	}

	void earFish() throws InterruptedException {//t3 t4
		l.lock();
		try {
			while (!flag) //
				eatCondition.wait();
			System.out.println("2");
			flag = false;
			cookCondition.notify();
		} finally {
			l.unlock();
		}
	}
}

class ProducerMy3 implements Runnable {

	Fish3 Fish3 = null;

	ProducerMy3(Fish3 Fish3) {
		this.Fish3 = Fish3;
	}

	@Override
	public void run() {
		while (true)
			try {
				Fish3.cookFish();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}

}

class ConsumerMy3 implements Runnable {
	Fish3 Fish3 = null;

	ConsumerMy3(Fish3 Fish3) {
		this.Fish3 = Fish3;
	}

	@Override
	public void run() {
		while (true)
			try {
				Fish3.earFish();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}

}