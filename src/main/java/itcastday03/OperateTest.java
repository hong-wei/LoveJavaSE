package itcastday03;

class OperateTest
{
	public static void main(String[] args)
	{
		// ����Ч�ʵķ�ʽ���2����8���ڼ���
		System.out.println(2 << 3);
		// BK --day03 1��� ������λ��������
		// ����������������ֵ���л��� (����Ҫ����������)
		int a = 3, b = 5;

		System.out.println("Origial : a=" + a + ",b=" + b);
		// Third variable
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		System.out.println("First way : a=" + a + ",b=" + b);
		// Sum method --if exceed the integer range ,it will be wrong.
		a = 3;
		b = 5;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Second way: a=" + a + ",b=" + b);
		// or else (^) way
		a = 3;
		b = 5;
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("Third way : a=" + a + ",b=" + b);

		/**
		 * <pre>
		����ʱ��ʹ�õ�������������ʽ����Ϊ�Ķ���ǿ��
		int c ;
		c = a;
		a = b;
		b = c;
		
		
		//���ַ�ʽ��Ҫ�ã����������������ֵ���󣬻ᳬ��int��Χ����ǿ��ת�������ݻ�仯��
		a = a + b; //a = 3 + 5;a = 8;
		b = a - b; //3+5-5 = 3;b = 3;
		a = a - b; //3+5-3 = 5;a = 5;
		
		���Ե�ʱ���á�
		a = a ^ b; //a = 3 ^ 5;
		b = a ^ b; //b = (3^5)^5; b = 3;
		a = a ^ b; //a = (3^5)^3; a = 5;
		 * </pre>
		 */
		System.out.println("a=" + a + ",b=" + b);
	}
}
