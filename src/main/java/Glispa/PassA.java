package Glispa;

import java.util.Comparator;

public class PassA{
	public static void main(String[]strings){
		PassA passA =new PassA();
		passA.start();
		
	}
	void start() {
		long [] a1 = {3,4,5};
		long [] a2 = fix(a1); // a1[1] = 7 --> [3,7,5] 
		//TODOGlispa 1- 9:37:40 AM  a2 --a1// a2=[3,7,5]
		System.out.println(a1[0]+a1[1]+a1[2]+"");
		System.out.println(""+a1[0]+a1[1]+a1[2]);
		System.out.println(a2[0]+a2[1]+a2[2]);
	}
	long [] fix (long [] a3){
		a3[1]= 7;
		return a3; 
	}
}

class SC2 {
	public static void main(String[] args) {
		SC2 s = new SC2();
		s.start();
	}

	void start() {
		 int a= 3;
		 int b=4;
		 System.out.println(" "+7+2+" "); // 72 --> string first
		 System.out.println(a+b); //7 Addition
		 System.out.println(" "+a+b+" "); // 34 String
		 System.out.println(" "+7+2+" "); // 72
		 System.out.println(foo()+a+b+" "); //foo34
		 System.out.println(a+b+foo());// 7foo
	}

	String  foo() {
		return "foo";
	}
}

////TODOGlispa 2  - 9:45:16 AM 
/*
 * order is it right ??
 * implements Comparator< String> 
 * 1 /LoveJavaSE/src/itcastday19/p1/map/test/CompByLetter.java
 * 2 
 * TreeSetDemo.java
		1 �ж�Ԫ��Ψһ�Եķ�ʽ�����Ǹ��ݱȽϷ����ķ��ؽ���Ƿ���0����0��������ͬԪ�أ����档 
		2 TreeSet��Ԫ�ؽ�������ķ�ʽһ��
			��Ԫ������߱��ȽϹ��ܣ�Ԫ����Ҫʵ��Comparable�ӿ�,����compareTo������
ComparatorByLength.java
ComparatorByName.java
		3 TreeSet���ϵڶ�������ʽ����(�����Ҫ���ն����о߱�����Ȼ˳�����������������в��߱���Ȼ˳����ô�죿)
			�ü�������߱��ȽϹ��ܣ�����һ����ʵ��Comparator�ӿڣ�����compare������
			�����������Ϊ�������ݸ�TreeSet���ϵĹ��캯����
	
	--day18 ���ϼ��� 1
 * */

//TODOGlispa 3 - 9:51:32 AM 
///LoveJavaSE/src/Glispa/QQ20160108-0.gif

//TODOGlispa 4 - 9:55:52 AM  but I can go to details
///LoveJavaSE/src/itcastday09/�����ʵ��������ͼ��.bmp

//b:/LoveJavaSE/src/itcastday07/ConsDemo.java

//TODOGlispa 5 - 9:59:32 AM 
class T5{
	public static void main(String[] args) {
		int x =20;
		String sup =(x<15)?"small":(x<22)?"tiny":"huge";
		System.out.println(sup);
//TODOGlispa 6 - 10:04:39 AM 		
		System.out.println(16>>2);
		System.out.println(16>>>2);// no sign right shift
		System.out.println((16/2)^2); //^ mean xor --> "1000"xor"10",same 0.no 1
		System.out.println((2)^2);
	}
}

//TODOGlispa 7 - 10:07:34 AM 
// set the java path in eclipse .I used before 
// 1 cope all the files
// 2 links the file

//TODOGlispa 8 - 10:08:30 AM 
// 1 JUnit , sometimes
// 2 see the result directly

//TODOGlispa 9 - 10:09:45 AM 
// 1 �汾�����һ���ֿ⣬��Ѷ����Ž�ȥ(ͨ�������д�ĳ������)��Ȼ��������Ҫ��ʱ���ó�����
//	 ͨ�����ֲֿⶼ��һ��������ĵط����㲻���ܿ�����Ž�ȥ�Ķ������ڵ����ӣ����ܿ�������ǰ�����ӣ�
//	 ����ǰ汾�ˣ�ͬһ������ÿ�ηŽ�ȥʱ�����Ӷ��ᱻ�������������������׷������������κ�ʱ�ڵ����ӡ�
	// 1 each change has record 
	// 2 go back any history time you prefer
	// 3 git can divide another distribution and mergy later
// 2

//TODOGlispa 10 - 11:42:37 AM
//QQ20160108-1.gif

//TODOGlispa 13 - 10:39:37 AM  
//a.1 /(\w{4})(\d+)x(\d+)/
//b.1 /(\d{4})(\d{4})(\d{4})/ 
//c.1 /(\d+)(\w+)(\d+),/ Ӧ���Ǵ�� 
//d.1 /*(\w{2})-.+/i --/��i��ʲô��
//d.2 /.*(\d{2}).*/i


//TODOGlispa 8.1 - 11:25:37 AM 
//index1.html
//glispa.css