package day0123;

/**
 * <pre>
 *  four types keywords
switch(���ʽ)
{
	case ȡֵ1:
		ִ����䣻
		break��
	case ȡֵ2:
		ִ����䣻
		break��
	��...
	default:
		ִ����䣻
		break��
}
 * </pre>
 */

enum WeekDays
{
	Monday, Tunesday
}

class SwitchDemo
{
	static WeekDays weekDays;

	public static void main(String[] args)
	{
		weekDays = WeekDays.Monday;
		switch (weekDays)
		{
			case Monday:
				System.out.println("Monday");
				break;
			case Tunesday:
				break;
			default:
				break;
		}

		int x = 2;
		switch (x)
		{// byte,short,int,char.
			default:
				System.out.println("d");
				// break
			case 4:
				System.out.println("a");
				// break;
			case 1:
				System.out.println("b");
				// break;
			case 3:
				System.out.println("c");
				// break;
		}

		int a = 4, b = 2;
		char opr = '+';
		// lecture
		switch (opr)
		{
			case '+':
				System.out.println(a + b);
				break;
			case '-':
				System.out.println(a - b);
				break;
			case '*':
				System.out.println(a * b);
				break;
			case '/':
				System.out.println(a / b);
				break;
			default:
				System.out.println("�޷�����,���Ų�֧��");
				break;
		}

		String aString = "a";
		switch (aString)
		{
			case "a":
				break;
			case "b":
				break;
			default:
				break;
		}
	}
}
