package itcastday03;

class IfTest2 
{
	public static void main(String[] args) 
	{

		/*
		һ�����ļ���
		������3 4 5
		�ļ���6 7 8
		�＾��9 10 11
		������12 1 2 
		�����û�������·ݣ�������Ӧ�ļ��ڡ�
		*/
		
		//t1
		int inputData = 3;
		if(inputData==12||(inputData>=1&inputData<=2))
			System.out.println("month "+inputData + " is Winter");
		else if(inputData>=3 & inputData<=5)
			System.out.println("month "+inputData + " is Spring");
		else if(inputData>=6 & inputData<=8)
			System.out.println("month "+inputData + " is Summer");
		else if(inputData>=9 & inputData<=11)		
			System.out.println("month "+inputData + " is Autumn");
		else {
			System.out.println("There is no "+inputData+" month");
		}
		
		//t2
		if(inputData ==12||inputData ==1||inputData ==2)
			System.out.println("month "+inputData + " is Winter");
		else if(inputData ==3||inputData ==4||inputData ==5)
			System.out.println("month "+inputData + " is Spring");
		else if(inputData ==6||inputData ==7||inputData ==8)
			System.out.println("month "+inputData + " is Summer");
		else if(inputData ==9||inputData ==10||inputData ==11)
			System.out.println("month "+inputData + " is Autumn");
		else {
			System.out.println("There is no "+inputData+" month");
		}
	}
}
