package itcastday10;

/*
�ڲ�����Դ���ھֲ�λ���ϡ�
	�ڲ����ھֲ�λ����ֻ�ܷ��ʾֲ��б�final���εľֲ�������
*/

class Outer3
{
	int num = 3;

	public Object method()
	{

		final int x = 9; // BK --day10 Class 9Inner class 2���ھֲ������
		// BK --day10 Class 9Inner class 4ע������ 1Final -JDK1.8 ֧��

		class Inner
		{
			@Override
			public String toString()
			{
				return "show ..." + x;
			}
		}

		Object in = new Inner();
		return in;// 0x0045
		// in.show();
	}

}

public class InnerClassDemo3
{
	public static void main(String[] args)
	{
		Outer3 out = new Outer3();
		Object obj = out.method();
		System.out.println(obj);

	}
}