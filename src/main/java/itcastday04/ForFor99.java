package itcastday04;

class ForFor99 
{
	public static void main(String[] args) 
	{

		/*
		�žų˷���
		1*1=1
		1*2=2 2*2=4
		1*3=3 2*3=6  3*3=9
		1*4=4 2*4=8	 3*4=12	4*4=16
		1*5=5 2*5=10 3*5=15	4*5=20	5*5=25
		*/

		System.out.println("my picture 1 : ---------start:");
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
		
		/*
		\n:�س���
		\t:�Ʊ����
		\b:�˸�
		\r:���»س�����
		\\:��� "\" 

		windowsϵͳ�лس�����ʵ��������������ɵ� \r\n.
		linux�лس����� \n.
			
		System.out.println("\\hello world\\");
		*/
	
	}
}
