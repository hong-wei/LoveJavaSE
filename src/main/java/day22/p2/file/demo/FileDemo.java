package day22.p2.file.demo;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
//		constructorDemo();
		//myheaven();
		myHeaven();
	}

	private static void myHeaven() {
		//four fields: for different systems.
		System.out.println(File.pathSeparator);//different path-separator 
		System.out.println(File.pathSeparatorChar);//different path-separator 
		System.out.println(File.separator);    // name-separator 
		System.out.println(File.separatorChar);    // name-separator 
		
		//4 constructions
		File f0 = new File("asdf");
		File f1 = new File("aa", "bb");
		File f2 = new File(f0,"asdf");
		File f3 = new File("URL");
	}

	public static void constructorDemo() {
		// ���Խ�һ���Ѵ��ڵģ����߲����ڵ��ļ�����Ŀ¼��װ��file����
		File f1 = new File("c:\\a.txt");

		File f2 = new File("c:\\", "a.txt");

		File f = new File("c:\\");

		File f3 = new File(f, "a.txt");

		// static String separator ��ϵͳ�йص�Ĭ�����Ʒָ�����Ϊ�˷��㣬������ʾΪһ���ַ�����
		File f4 = new File("c:" + File.separator + "abc" + File.separator + "a.txt");
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);

	}

}
