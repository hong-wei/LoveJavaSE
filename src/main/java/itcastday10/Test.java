package itcastday10;

class FuT{
	FuT() {
		show();
	}

	void show() {
		System.out.println("hehe");
	}
}

class ZiT extends FuT{
	int num = 9;
	ZiT(){
		super();
		// ���������ʼ�����������ʾ��ʼ����Ա����
		System.out.println("Zi constructor..."+num);
	}
	void show(){
		System.out.println("show ... "+num);
	}
}
public class Test {
	public static void main(String[] args) {
		new ZiT();
	}

}
