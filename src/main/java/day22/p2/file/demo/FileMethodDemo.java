package day22.p2.file.demo;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.text.DateFormat;
import java.util.Date;

public class FileMethodDemo {
	public static void main(String[] args) throws IOException {

		/*
		 * File����ĳ���������
		 * 
		 * 1����ȡ�� 1.1 ��ȡ�ļ����ơ� 1.2 ��ȡ�ļ�·���� 1.3 ��ȡ�ļ���С�� 1.4 ��ȡ�ļ��޸�ʱ�䡣
		 * 
		 * 2��������ɾ����
		 * 
		 * 3���жϡ�
		 * 
		 * 4��������
		 * 
		 */
//		getDemo();
//		createAndDeleteDemo();
//		isDemo();
//		renameToDemo();
		listRootsDemo();
	}

	public static void listRootsDemo() {

		File file = new File("src");

		System.out.println("getFreeSpace:" + file.getFreeSpace());
		System.out.println("getTotalSpace:" + file.getTotalSpace());
		System.out.println("getUsableSpace:" + file.getUsableSpace());

		File[] files = File.listRoots();
		for (File file1 : files) {
			System.out.println(file1);
		}
	}

	public static void renameToDemo() {

		// �Ǽ��и��ƵĹ���s
		File f2 = new File("aa.mp3");

		File f1 = new File("src/bb");

		boolean b = f1.renameTo(f2);

		System.out.println("b=" + b);
	}

	public static void isDemo() throws IOException {
		File f = new File("aaa");

		// f.mkdir();
		f.createNewFile();

		// boolean b = f.exists();
		// System.out.println("b="+b);
		// ������ж��Ƿ���ڡ�
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());

	}

	public static void createAndDeleteDemo() throws IOException {

		// 1 �ļ��Ĵ�����ɾ����
		File file = new File("file.txt");

		/*���������һ��������ļ������ڣ��򴴽�������ļ����ڣ��򲻴�����*/
		boolean b = file.createNewFile();
		System.out.println("b=" + b);
//		b = file.delete();
		file.delete();
		System.out.println("b="+b);

		// 2 �ļ�mĿ¼�Ĵ�����ɾ����
		// 2.1 signal direction
		File dir2 = new File("hong");
		b = dir2.mkdir();// make directory
		System.out.println("b="+b);
		System.out.println(dir2.delete());
		
		// 2.2many directions
		File dir = new File("abc/q/e/c/z/r/w/y/f/e/g/s");
		System.out.println(dir.mkdirs());// �����༶Ŀ¼
		System.out.println(dir.delete());
		// System.out.println(dir.delete());

	}

	public static void getDemo() {
		// File file = new File("/Users/zhanghongwei/Documents/Dropbox/"
		// + "EclipseLife/LoveJavaSE/src/itcastday22/a.txt");
		File file = new File("src/itcastday22/a.txt");// xiangdui path

		String name = file.getName();

		String absPath = file.getAbsolutePath();// ����·����

		String path = file.getPath();

		long len = file.length();

		long time = file.lastModified();

		Date date = new Date(time);

		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);

		String str_time = dateFormat.format(date);

		System.out.println("parent:" + file.getParent());

		System.out.println("name:" + name);
		System.out.println("absPath:" + absPath);
		System.out.println("path:" + path);
		System.out.println("len:" + len);
		System.out.println("time:" + time);
		System.out.println("str_time:" + str_time);
	}
}
