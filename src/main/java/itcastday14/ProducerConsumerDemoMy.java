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
class PeoCusMain {
	public static void main(String[] args) {
		Fish fish = new Fish();

		ProducerMy producer = new ProducerMy(fish);
		ConsumerMy Consumer = new ConsumerMy(fish);

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

class Fish {
	int number = 0;
	boolean flag = false;

	// sychronised , make one and buy one
	synchronized void cookFish() throws InterruptedException { // t0
		while (flag)
			this.wait(); // t1 
		System.out.println("1");
		flag = true;
		this.notifyAll();
	}

	synchronized void earFish() throws InterruptedException {//t3 t4
		while (!flag) //
			this.wait();
		System.out.println("2");
		flag = false;
		this.notifyAll();
	}
}

class ProducerMy implements Runnable {

	Fish fish = null;

	ProducerMy(Fish fish) {
		this.fish = fish;
	}

	@Override
	public void run() {
		while (true)
			try {
				fish.cookFish();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}

}

class ConsumerMy implements Runnable {
	Fish fish = null;

	ConsumerMy(Fish fish) {
		this.fish = fish;
	}

	@Override
	public void run() {
		while (true)
			try {
				fish.earFish();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}

}