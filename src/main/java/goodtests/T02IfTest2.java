package goodtests;

public class T02IfTest2 
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
		int inputData = 100;
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
		
		
		int month = 8;
		
		if(month<1 || month>12)
			System.out.println(month+"��û�ж�Ӧ�ļ���");
		else if(month>=3 && month<=5)
			System.out.println(month+"���Ǵ���");
		else if(month>=6 && month<=8)
			System.out.println(month+"�����ļ�");
		else if(month>=9 && month<=11)
			System.out.println(month+"�����＾");
		else 
			System.out.println(month+"���Ƕ���");



		/*
		if(month==3 || month==4 || month==5)
			System.out.println(month+"���Ǵ���");
		else if(month==6 || month==7 || month==8)
			System.out.println(month+"�����ļ�");
		else if(month==9 || month==10 || month==11)
			System.out.println(month+"�����＾");
		else if(month==12 || month==1 || month==2)
			System.out.println(month+"���Ƕ���");
		else
			System.out.println(month+"��û�ж�Ӧ�ļ���");
			*/
			
	}
}
