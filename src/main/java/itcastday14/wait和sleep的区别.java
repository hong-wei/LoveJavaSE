package itcastday14;


/*
wait �� sleep ����

1��wait����ָ��ʱ��Ҳ���Բ�ָ����
   sleep����ָ��ʱ�䡣

2����ͬ����ʱ����cpu��ִ��Ȩ�����Ĵ���ͬ��
	wait���ͷ�ִ��Ȩ���ͷ�����
	sleep:�ͷ�ִ��Ȩ�����ͷ�����

*/

class DemoDifference {

	void show() {
		synchronized (this)//
		{

//			wait();// t0 t1 t2

		}
	}

	void method() {
		synchronized (this)// t4
		{

			// wait();

			notifyAll();

		} // t4
	}
}


