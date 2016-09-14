package itcastday20.p3.io.filereader;

import java.io.FileReader;
import java.io.IOException;

import algorithms.MyTools;

/**
 * ���󣺶�ȡһ���ı��ļ�������ȡ�����ַ���ӡ������̨.
 *
 * @author zhanghongwei
 *
 */
public class FileReaderDemo2
{

	public static void main(String[] args) throws IOException
	{

		FileReader fr = new FileReader(MyTools.PATH);
		/*
		 * ʹ��read(char[])��ȡ�ı��ļ����ݡ�
		 *
		 * �ȴ����ַ����顣 //
		 */
		char[] buf = new char[1024];

		int len = 0;
		int i = 0;
		while ((len = fr.read(buf)) != -1)
		{
			System.out.print(new String(buf, 0, len));
			i++;
		}

		System.out.println(i);
		int num = fr.read(buf);// ����ȡ�����ַ��洢�������С�
		System.out.print(num + ":" + new String(buf, 0, num));
		int num1 = fr.read(buf);// ����ȡ�����ַ��洢�������С�
		System.out.println();
		System.out.print(num1 + num + ":" + new String(buf, 0, num1));
		int num2 = fr.read(buf);// ����ȡ�����ַ��洢�������С�
		System.out.println();
		System.out.print(num2 + num + num1 + ":" + new String(buf));

		fr.close();
	}
}
