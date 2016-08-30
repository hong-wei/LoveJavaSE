package itcastday20.p3.io.filereader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import commontools.MyTools;

/**
 * ���󣺶�ȡһ���ı��ļ�������ȡ�����ַ���ӡ������̨.
 *
 * @author zhanghongwei
 *
 */
public class FileReaderDemo
{
	/**
	 * EOF:end of file
	 *
	 */
	final static public int EOF = -1;

	public static void main(String[] args)
	{

		Reader fr = null;
		Reader fr1 = null;

		try
		{
			// 1,������ȡ�ַ����ݵ�������
			// �ڴ�����ȡ������ʱ������Ҫ��ȷ����ȡ���ļ�,һ��Ҫȷ�����ļ��Ǵ��ڵ�,��һ����ȡ������һ���Ѵ����ļ���
			fr = new FileReader(MyTools.PATH);

			// 2,��Reader�е�read������ȡ�ַ�,һ��һ��
			int ch0 = fr.read();
			System.out.println((char) ch0);
			int ch1 = fr.read();
			System.out.println(ch1);
			int ch2 = fr.read();
			int ch3 = fr.read();
			int ch4 = fr.read(); // ��һֱ����-1,�����׳��쳣
			int ch5 = fr.read();
			int ch6 = fr.read();
			int ch7 = fr.read();
			System.out.println(ch7);
			System.out.println("Loop read value--------");
			// 2 loop��ȡ,new�����¿���һ����Դ

			fr1 = new FileReader(MyTools.PATH);
			int ch = -1;
			while (FileReaderDemo.EOF != (ch = fr1.read()))
			{
				System.out.println((char) ch);
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if (null != fr)
			{
				try
				{
					fr.close();
					fr1.close();
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

	}
}
