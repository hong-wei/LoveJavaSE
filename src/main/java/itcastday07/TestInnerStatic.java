package itcastday07;
//http://liqita.iteye.com/blog/1216082 ���Լ�������������Ȩ�޵Ŀ��ƣ���д�Ĳ��࣬������⣬Ŀǰ��

import itcastday07.TestInnerStatic.InnerClass;

class TestInnerStatic {
	public static class InnerClass {
		public static void doSomething() {
			System.out.println("private Class doSomething");
		}
	}

	public static void main(String[] args) {
		InnerClass.doSomething();
	}
}

class Test {
	public static void main(String[] args) {
		InnerClass.doSomething();
	}
}