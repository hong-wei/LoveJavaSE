package itcastday10;

class Outer6
{
	void method()
	{
		new Object() {
			public void show() {
				System.out.println("show run");
			}
		}.show();
//		Object obj = new Object()
//		{
//			public void show()
//			{
//				System.out.println("show run");
//			}
//
//		};
//		obj.show();//��Ϊ�����ڲ�����������������ת��Ϊ��Object���͡�
//					//�����Ͳ�����ʹ���������еķ����ˡ�
	}
}

class InnerClassDemo6 
{
	public static void main(String[] args) 
	{
		new Outer6().method();
	}
}
