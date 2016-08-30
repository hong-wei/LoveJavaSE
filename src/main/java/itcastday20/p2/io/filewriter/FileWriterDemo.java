package itcastday20.p2.io.filewriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * ���󣺽�һЩ���ִ洢��Ӳ��һ���ļ��С�
 *
 * @author zhanghongwei
 *
 */
public class FileWriterDemo
{

	public static final String LINE_SEPARATOR = System.getProperty("line.separator");
	public static final String LINE_TABLEKEY = "\t";
	public static final String PATH = "src/main/java/itcastday20/p2/io/filewriter";
	public static final String LINE_SPACE = "   ";

	public static void main(String[] args) throws IOException
	{

		/*
		 * ��Ȼ����һ���ļ���д���������ݣ���ô�ڴ�������ʱ���ͱ�����ȷ���ļ�(���ڴ洢���ݵ�Ŀ�ĵ�)��
		 *
		 * ����ļ������ڣ�����Զ������� ����ļ����ڣ���ᱻ���ǡ�
		 *
		 * ������캯���м���true������ʵ�ֶ��ļ�������д��
		 */
		Writer fw = new FileWriter(FileWriterDemo.PATH + "/demo.txt", true);
		/*
		 * ����Writer�����е�write(string)������д�����ݡ�
		 *
		 * ��ʵ����д�뵽��ʱ�洢�������С�
		 *
		 */
		fw.write("0" + FileWriterDemo.LINE_SEPARATOR + "1");
		fw.write(FileWriterDemo.LINE_TABLEKEY + "2");
		fw.write(FileWriterDemo.LINE_SPACE + "3");

		/*
		 * ����ˢ�£�������ֱ��д��Ŀ�ĵ��С�
		 */

		fw.flush();

		/*
		 * �ر������ر���Դ���ڹر�ǰ���ȵ���flushˢ�»����е����ݵ�Ŀ�ĵء�
		 */
		fw.close();
		fw.close();
		// �ر���,�ٵ��û��׳��쳣! java.io.IOException: Stream closed
		// fw.write("haha");

	}

}
