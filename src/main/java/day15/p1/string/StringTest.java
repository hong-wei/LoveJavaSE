package day15.p1.string;

/**
 * ��ȻString���࣬��������������ʱ�����ظı������ֵ��������Ϊimmutable value��һ����ֵ�Ͳ����ٸı��ˡ�
 *
 * @author zhanghongwei
 *
 */
public class StringTest
{
	public static void main(String[] args)
	{

		String s1 = "hello";
		String s2 = "java";

		StringTest.show(s1, s2);

		System.out.println(s1 + "...." + s2);// hello java

		// split will new a object
		String aString = "j";
		String aString1 = "j";
		String[] aa = { "j", "j" };
		String jjString = "jj";
		String[] split = jjString.split("");

		System.out.println(aString == aString1);// true
		System.out.println(aa[0] == aa[1]); // true
		System.out.println(split[0] == split[1]);// true // BK --day15 String 4Examples1

	}

	public static void show(String s1, String s2)
	{

		s2 = s2.replace('a', 'o');// jovo
		s1 = s2;
	}

}
