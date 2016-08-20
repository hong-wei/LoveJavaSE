package itcastday14;

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
class PeoCusMain2 {
	public static void main(String[] args) {
		Fish1 Fish1 = new Fish1();

		ProducerMy1 producer = new ProducerMy1(Fish1);
		ConsumerMy1 Consumer = new ConsumerMy1(Fish1);

		Thread t1 = new Thread(producer);
		Thread t2 = new Thread(Consumer);

		t1.start();
		t2.start();
	}
}

class Fish1 {
	int number = 0;
	boolean flag = false;

	// sychronised , make one and buy one
	synchronized void cookFish() throws InterruptedException {
		if (flag)
			this.wait();
		System.out.println("1");
		flag = true;
		this.notify();
	}

	synchronized void earFish() throws InterruptedException {
		if (!flag)
			this.wait();
		System.out.println("2");
		flag = false;
		this.notify();
	}
}

class ProducerMy1 implements Runnable {

	Fish1 Fish1 = null;

	ProducerMy1(Fish1 Fish1) {
		this.Fish1 = Fish1;
	}

	@Override
	public void run() {
		while (true)
			try {
				Fish1.cookFish();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}

}

class ConsumerMy1 implements Runnable {
	Fish1 Fish1 = null;

	ConsumerMy1(Fish1 Fish1) {
		this.Fish1 = Fish1;
	}

	@Override
	public void run() {
		while (true)
			try {
				Fish1.earFish();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}

}