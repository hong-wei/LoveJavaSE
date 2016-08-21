package itcastday03;

class SwitchDemo
{
	public static void main(String[] args)
	{

		/**
		 * <pre>
		 *  four types keywords
		switch(表达式)
		{
			case 取值1:
				执行语句；
				break；
			case 取值2:
				执行语句；
				break；
			…...
			default:
				执行语句；
				break；
		}
		 * </pre>
		 */
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
				System.out.println("无法运算,符号不支持");
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
