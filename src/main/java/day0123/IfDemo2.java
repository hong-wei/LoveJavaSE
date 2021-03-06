package day0123;

class IfDemo2
{
	public static void main(String[] args)
	{
		/*
		 * if语句的第二种格式：
		 *
		 * if(条件表达式) { 执行语句； } else//否则 { 执行语句； }
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

		b = a > 1 ? 100 : 200;// 三元运算符就是if else 语句简写格式。

		// 简写格式什么时候用？
		// 当if else运算后，有一个具体的结果时，可以简化写成三元运算符。
		System.out.println("b=" + b);
	}
}
