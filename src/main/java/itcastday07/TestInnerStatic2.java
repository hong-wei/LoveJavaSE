package itcastday07;
//http://liqita.iteye.com/blog/1216082 ���Լ�������������Ȩ�޵Ŀ��ƣ���д�Ĳ��࣬������⣬Ŀǰ��

 class TestInnerStatic2 {

	protected  class InnerClass {

		public  void doSomething() {

			System.out.println("private Class doSomething");
		}

	}

	public static void main(String[] args) {

		new TestInnerStatic2().new InnerClass().doSomething();;

	}
}
 
 class Test2{
	 public static void main(String[] args) {
		 new TestInnerStatic2().new InnerClass().doSomething();
	}
 }