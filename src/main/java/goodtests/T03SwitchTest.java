package goodtests;

public class T03SwitchTest 
{
	public static void main(String[] args) 
	{

		
		/*
		�û���������ݶ�Ӧ�ĳ����ڡ�
		*/
		int week = -1;
		
		switch(week){
		case 1:
			System.out.println(week +" is Monday");
			break;
		case 2:
			System.out.println(week +" is Tuesday");
			break;
		case 3:
			System.out.println(week +" is Wednesday");
			break;
		case 4:
			System.out.println(week +" is Thursday");
			break;
		case 5:
			System.out.println(week +" is Friday");
			break;
		case 6:
			System.out.println(week +" is Saturday");
			break;
		case 7:
			System.out.println(week +" is Sunday");
			break;
		default:
			System.out.println(week + " is not week");
			break;
		}
		
		
		//Lecture
		switch(week)
		{
			default:
				break;
			case 1:
				System.out.println(week+"��Ӧ��������һ");
				break;
			case 2:
				System.out.println(week+"��Ӧ�������ڶ�");
				//break;
				//...�Դ����ơ� 
		}
		/*
		���ڵ�ʾ���� 
		������3 4 5
		�ļ���6 7 8
		�＾��9 10 11
		������12 1 2 
		*/

		int month = 13;
		//mine
		switch (month) {
			case 3:
			case 4:
			case 5:
				System.out.println("it is Spring");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("it is Summer");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("it is Autumn");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("it is Winter");
				break;
			default:
				System.out.println("it is Wrong number!!");
				break;
		}
		
		//lecture
		switch(month)
		{
			case 3:
			case 4:
			case 5:
				System.out.println(month+"�¶�Ӧ���Ǵ���");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println(month+"�¶�Ӧ�����ļ�");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(month+"�¶�Ӧ�����＾");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println(month+"�¶�Ӧ���Ƕ���");
				break;
			default:
				System.out.println(month+"��û�ж�Ӧ�ļ���");
				//break;
		}

//		System.out.println("Hello World!");
	}
}
