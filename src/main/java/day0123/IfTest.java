package day0123;

import java.io.IOException;

/**
 * <pre>
���󣺸����û�ָ���ľ������ݣ��жϸ����ݶ�Ӧ�����ڡ�
1-����һMonday

˼·��
�û������޷���ȡ������ֻ�Ǿ������ݵ�һ�ֻ�ȡ�ֶζ��ѡ�
������Ҫ���Ĺ��ܽ����Ƕ��û�ָ�������ݽ��ж�Ӧ���ڵĴ�ӡ���ѡ�

���Ծ�������ݲ�ȷ������ɿ���ʹ�ñ�������ʾ��

����ֻ�Ա������в������ɡ����ڱ�����ֵ���������û�������

��Ϊ���ݵĲ�ȷ���ԣ�����Ҫ�����ݽ����жϡ�
ʹ��if��䡣
 * </pre>
 */
class IfTest
{
	public static void main(String[] args) throws IOException
	{

		int inputData = 1;
		if (inputData == 1)
		{
			System.out.println(inputData + " Monday");
		}
		else if (inputData == 2)
		{
			System.out.println(inputData + " Tunesday");
		}
		else if (inputData == 3)
		{
			System.out.println(inputData + " Wednesday");
		}
		else if (inputData == 4)
		{
			System.out.println(inputData + " Thursday");
		}
		else if (inputData == 5)
		{
			System.out.println(inputData + " Friday");
		}
		else if (inputData == 6)
		{
			System.out.println(inputData + " Saturday");
		}
		else if (inputData == 7)
		{
			System.out.println(inputData + " Sunday");
		}
		else
		{
			System.out.println(inputData + " No specific data");
		}
	}
}
