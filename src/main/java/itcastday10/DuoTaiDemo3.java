package itcastday10;

/*
��̬ʱ��
��Ա���ص㣺
1����Ա������
	����ʱ���ο������ͱ������������е��Ƿ��е��õĳ�Ա�������У�����ͨ����û�У�����ʧ�ܡ�
	����ʱ���ο������ͱ������������е��Ƿ��е��õĳ�Ա�����������и��������еĳ�Ա������
	��˵����������ж��ο��Ⱥŵ���ߡ�
	��Ϊ�˽⡣



2����Ա����(�Ǿ�̬)��
	����ʱ���ο������ͱ������������е��Ƿ��е��õĺ������У�����ͨ����û�У�����ʧ�ܡ�
	����ʱ���ο����Ƕ��������������Ƿ��е��õĺ�����
	��˵�����뿴��ߣ����п��ұߡ�

	��Ϊ��Ա�������ڸ������ԡ�


3����̬������
		����ʱ���ο������ͱ������������е��Ƿ��е��õľ�̬������
		����ʱ���ο������ͱ������������е��Ƿ��е��õľ�̬������
		��˵����������ж�����ߡ�

		��ʵ���ھ�̬�������ǲ���Ҫ����ġ�ֱ�����������ü��ɡ�


		

*/

class Fu {
	int num = 3;
	void show() {
		System.out.println("fu show "+num);
	}

	static void staticMethod() {
		System.out.println("fu static method");
	}
}

class Zi extends Fu {
	int num = 4;
	void show() {
		System.out.println("zi show "+num);
	}

	static void staticMethod() {
		System.out.println("zi static method");
	}
}

class DuoTaiDemo3 {
	public static void main(String[] args) {
//		Fu.staticMethod();
//		Zi.staticMethod();
		Fu f = new Zi();
		f.staticMethod();
//		f.show();
//		System.out.println(f.num);
	}
}
