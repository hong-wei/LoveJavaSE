package day03;

class IfDemo2
{
	public static void main(String[] args)
	{
		/*
		 * if���ĵڶ��ָ�ʽ��
		 *
		 * if(�������ʽ) { ִ����䣻 } else//���� { ִ����䣻 }
		 *
		 */
		int a = 3, b;
		if (a > 1)
		{
			b = 100;
		}
		else
		{
			b = 200;
		}
		System.out.println(b);

		b = a > 1 ? 100 : 200;// ��Ԫ���������if else ����д��ʽ��

		// ��д��ʽʲôʱ���ã�
		// ��if else�������һ������Ľ��ʱ�����Լ�д����Ԫ�������
		System.out.println("b=" + b);
	}
}
