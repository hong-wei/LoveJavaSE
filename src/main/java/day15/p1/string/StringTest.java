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
	}

	public static void show(String s1, String s2)
	{

		s2 = s2.replace('a', 'o');// jovo
		s1 = s2;
	}

}
