package itcastday15.p1.string.demo;

import itcastday15.p1.string.test.StringTest_2;
import itcastday15.p2.stringbuffer.demo.StringBufferDemo;

public class StringConstructorDemo {

	public static void main(String[] args) {
		//1 �ղ���
		String s = new String();//��Ч��String s = "";  ����ЧString s = null;
		String s1 = "";
		String s2 = null;
		//2���ֽ�����ת���ַ�������ͨ��String��Ĺ��캯����ɡ�
		stringConstructorDemo();
		//3�ַ�����ת���ַ�������ͨ��String��Ĺ��캯����ɡ�
		stringConstructorDemo2();
		
	}

	public static void stringConstructorDemo2() {
		char[] arr = {'w','a','p','q','x'};
		String s = new String(arr);
		String s1 = new String(arr,1,3);
		System.out.println("s="+s);
		System.out.println("s1="+s1);
		String s2= new String();
		String s3= new String("asdf");
		String s4= new String(arr);
		
	}

	public static void stringConstructorDemo() {
		byte[] c ={97,98,99,65,(byte) 1111};
		String s= new String(c);
		String s1= new String(c,1,3);
		System.out.println(s);
		System.out.println(s1);
		String s2 = new String(c);
		int [] intS={1,2,3,4};
		String s3= new String(intS,1,3);
		System.out.println("-----s3: "+s3);
		StringBuffer s4= new StringBuffer(233);
		System.out.println(s4);
		String s5= new String(s4);
	}



}
