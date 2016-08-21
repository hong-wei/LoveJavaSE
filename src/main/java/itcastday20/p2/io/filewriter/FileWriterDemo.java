package itcastday20.p2.io.filewriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

//���󣺽�һЩ���ִ洢��Ӳ��һ���ļ��С�
public class FileWriterDemo {

	private static final String LINE_SEPARATOR = System.getProperty("line.separator");
	private static final String LINE_TABLEKEY = "\t";
	private static final String PATH = "/Users/zhanghongwei/Documents/Dropbox/EclipseLife/LoveJavaSE"
			+ "/src/itcastday20/p2/io/filewriter/";
	private static final String LINE_SPACE = "   ";

	public static void main(String[] args) throws IOException {

		// ����һ���������ļ���д���ַ����ݵ��ַ����������
		/*
		 * ��Ȼ����һ���ļ���д���������ݣ���ô�ڴ�������ʱ���ͱ�����ȷ���ļ�(���ڴ洢���ݵ�Ŀ�ĵ�)��
		 * 
		 * ����ļ������ڣ�����Զ������� ����ļ����ڣ���ᱻ���ǡ�
		 * 
		 * ������캯���м���true������ʵ�ֶ��ļ�������д��
		 */
		FileWriter fw = new FileWriter(PATH+"/demo.txt", true);
		/*
		 * ����Writer�����е�write(string)������д�����ݡ�
		 * 
		 * ��ʵ����д�뵽��ʱ�洢�������С�
		 * 
		 */
		fw.write("abcde" + LINE_SEPARATOR + "hahaha");
		
		// fw.write("xixi");

		/*
		 * ����ˢ�£�������ֱ��д��Ŀ�ĵ��С�
		 */

		// fw.flush();

		/*
		 * �ر������ر���Դ���ڹر�ǰ���ȵ���flushˢ�»����е����ݵ�Ŀ�ĵء�
		 */
		fw.close();

		// fw.write("haha");// java.io.IOException: Stream closed
		
		//my place
		myPlace();

	}

	private static void myPlace() throws IOException {
		// write the following words to the file"demo"(PATH)
		String firstWords ="I love Java, I have feelings now  !!!";
		//1 get a file
		FileWriter myFile= new FileWriter(PATH+"/demoMy.txt");
		
		//2 call methods of myfiel
		myFile.write(firstWords+LINE_SEPARATOR);
		myFile.write("abcde" + LINE_TABLEKEY + "hahaha");
		myFile.write(LINE_SEPARATOR+"I got it !!!!"+LINE_SPACE+"hahah");
		//3 flush or closed
		myFile.flush();
		
	}
	

}
