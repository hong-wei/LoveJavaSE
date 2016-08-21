package itcastday13;

/*
�����������龰֮һ��ͬ����Ƕ�ס�

*/
class Ticket implements Runnable {
	private int num = 100;
	Object obj = new Object();
	boolean flag = true;

	public void run() {

		if (flag)
			while (true) {// ÿ�ζ���������
				synchronized (obj) { // ��obj����
					                 // ��this��
					show();// ������show()�ͷſ�this����
				}          // ������obj�ͷſ�obj����
			}
		else
			while (true)
				this.show();
	}
/*
 * t1 �ſ�this��
 * 	t2 �õ�this,�ȴ�obj
 *    t1 �ſ�obj
 *      t1 ��������obj���ȴ�this
 *        
 * 
 * */
	public synchronized void show() {// ����this��
		synchronized (obj) {         // ����obj��
			if (num > 0) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
				}

				System.out.println(Thread.currentThread().getName() + ".....sale...." + num--);
			}
		}
	}
}

class DeadLockDemo {
	public static void main(String[] args) {
		Ticket t = new Ticket();
		// System.out.println("t:"+t);

		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);

		t1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
		}
		t.flag = false;
		t2.start();
	}
}
