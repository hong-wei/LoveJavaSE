package itcastday11;

interface InterTest {
	void show();
}

class Outer {
	// ������� (�����������ڲ���)
	static InterTest method() {
		return new InterTest() {
			public void show() {
				System.out.println("InnerClass function !!!");
			}
		};
	}
}

/*
 * class haha implements InterTest { public void show(){} }
 */
class InnerClassTest {
	public static void main(String[] args) {
		Outer.method().show();
	}
}
