package itcastday20.p3.io.filereader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;

//���󣺶�ȡһ���ı��ļ�������ȡ�����ַ���ӡ������̨.

public class FileReaderDemo2 {

	
	private static final String PATH = "/Users/zhanghongwei/Documents/Dropbox/EclipseLife/LoveJavaSE/src/itcastday20/p3/io/filereader/demo.txt";

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader(PATH);

		/*
		 * ʹ��read(char[])��ȡ�ı��ļ����ݡ�
		 * 
		 * �ȴ����ַ����顣
		 */
		char[] buf = new char[1024];

		int len = 0;

		while ((len = fr.read(buf)) != -1) {
			System.out.println(new String(buf, 0, len));
		}

		/*
		 * int num = fr.read(buf);//����ȡ�����ַ��洢�������С�
		 * System.out.println(num+":"+new String(buf,0,num)); int num1 =
		 * fr.read(buf);//����ȡ�����ַ��洢�������С� System.out.println(num1+":"+new
		 * String(buf,0,num1)); int num2 = fr.read(buf);//����ȡ�����ַ��洢�������С�
		 * System.out.println(num2+":"+new String(buf));
		 */

		fr.close();
		
		//my Heaven
		myHeaven();
	}

	private static void myHeaven() {
		try {
			Reader reader = new FileReader(PATH);
			char[] cbuf = new char[3];
			int len=reader.read(cbuf,0,reader.read(cbuf));
			while (len!=-1) {
				System.out.println(cbuf);
				len=reader.read(cbuf);
			}
			reader.close();
		} catch (Exception e) {

		}
	}

}
