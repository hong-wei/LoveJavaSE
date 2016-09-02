package itcastday22.p1.transstream.demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class TransStreamDemo3
{

	public static void main(String[] args) throws IOException
	{
		// TransStreamDemo3.eg1_copyTextFile();
		// TransStreamDemo3.eg2_keybordToFile();
		// TransStreamDemo3.eg3_FileToConsole();
		// TransStreamDemo3.eg4_KeybordToConsole();
		TransStreamDemo3.eg5_EncodeTofile();
		// TransStreamDemo3.readText_2();
	}

	/**
	 * <pre>
	============================================================

	5����һ�������ַ������ݰ���ָ���ı����д�뵽һ���ı��ļ���.

	1��Ŀ�ġ�OutputStream��Writer
	2���Ǵ��ı���Writer��
	3���豸��Ӳ��File
	FileWriter fw = new FileWriter("a.txt");
	fw.write("���");

	ע�⣺��Ȼ�������Ѿ���ȷ��ָ�������Ķ�����
	�ǾͲ�����ʹ��FileWriter����ΪFileWriter�ڲ���ʹ��Ĭ�ϵı������
	ֻ��ʹ���丸�ࡣOutputStreamWriter.
	OutputStreamWriter����һ���ֽ���������󣬼�Ȼ�ǲ����ļ�����ô�ö���Ӧ����FileOutputStream

	OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("a.txt"),charsetName);

	��Ҫ��Ч��
	BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("a.txt"),charsetName));
	 * </pre>
	 *
	 * @throws IOException
	 */
	private static void eg5_EncodeTofile() throws IOException
	{
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("gbk_3.txt"), "GBK");
	 FileWriter fw = new FileWriter("gbk_1.txt");

		/*
		 * ���������Ĺ����ǵ�ͬ�ġ� FileWriter����ʵ����ת����ָ���˱���Ĭ���������֡��������ת������������󣬿��Է�������ı��ļ���
		 *
		 * ��˵�������ļ����ֽ���+����Ĭ�ϵı���� ���ǰ���Ĭ������������ļ��ı���ࡣ
		 *
		 * ��������ı��ļ���Ҫ��ȷ����ı��롣FileWriter�Ͳ����ˡ�������ת������
		 *
		 */

		osw.write("���");

		osw.close();
	}

	/**
	 * <pre>
	 *����4����ȡ����¼�����ݣ���ʾ�ڿ���̨�ϡ�
	1,��ȷԴ��Ŀ�ġ�
		Դ��InputStream Reader
		Ŀ�ģ�OutputStream  Writer
	2���Ƿ��Ǵ��ı��أ�
		�ǣ�
		Դ��Reader
		Ŀ�ģ�Writer
	3����ȷ�豸��
		Դ��
			���̣�System.in
		Ŀ�ģ�
			����̨��System.out

		InputStream in = System.in;
		OutputStream out = System.out;

	4����ȷ���⹦�ܣ�
		��Ҫת������Ϊ�����ֽ��������ǲ�����ȴ���ı����ݡ�
		����ʹ���ַ�������������Ϊ��ݡ�
		InputStreamReader isr = new InputStreamReader(System.in);
		OutputStreamWriter osw = new OutputStreamWriter(System.out);

		Ϊ�˽����Ч��
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));
	 * </pre>
	 *
	 * @throws IOException
	 *
	 */
	private static void eg4_KeybordToConsole() throws IOException
	{
		BufferedInputStream bufferedInputStream = new BufferedInputStream(System.in);
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(System.out);
		StringBuilder stringBuilder = new StringBuilder();
		while (true)
		{
			// 1 �Ȱ�һ����������������һ���Ӵ�
			int read = -1;
			while ((read = bufferedInputStream.read()) != '\n')
			{
				stringBuilder.append((char) read);
			}

			// 2 �ж�ֵ
			if ("over".equalsIgnoreCase(stringBuilder.toString()))
			{
				break;
			}

			// 3���
			bufferedOutputStream.write(stringBuilder.toString().toUpperCase().getBytes());
			bufferedOutputStream.write(System.getProperty("line.separator").getBytes());
			bufferedOutputStream.flush();
			stringBuilder.setLength(0);
		}
	}

	/**
	 * <pre>
	 **����3����һ���ı��ļ�������ʾ�ڿ���̨�ϡ�
	1,��ȷԴ��Ŀ�ġ�
		Դ��InputStream Reader
		Ŀ�ģ�OutputStream  Writer
	2���Ƿ��Ǵ��ı��أ�
		�ǣ�
		Դ��Reader
		Ŀ�ģ�Writer
	3����ȷ�����豸
		Դ��
			Ӳ�̣�File
		Ŀ�ģ�
			����̨��System.out
	
		FileReader fr = new FileReader("a.txt");
		OutputStream out = System.out;//PrintStream
	4����Ҫ���⹦����
		��Ҫ��ת����
		FileReader fr= new FileReader("a.txt");
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		��Ҫ����Ч��
		BufferedReader bufr = new BufferedReader(new FileReader("a.txt"));
		BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));
	 *
	 * </pre>
	 *
	 * @throws IOException
	 */
	private static void eg3_FileToConsole() throws IOException
	{// ��һ���ı��ļ�������ʾ�ڿ���̨�ϡ��ı����ֽ�,����̨Ҳ���ֽ�

		PrintStream out = System.out;
		try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("src/main/java/itcastday22/eg3_FileToConsole.txt"));)
		{

			int read = -1;
			while ((read = bufferedInputStream.read()) != -1)
			{
				out.write(read);
				out.flush();
			}

		}
	}

	/**
	 * <pre>
	 * ����2����ȡ����¼����Ϣ����д�뵽һ���ļ��С�
	
	1,��ȷԴ��Ŀ�ġ�
		Դ��InputStream Reader
		Ŀ�ģ�OutputStream  Writer
	2���Ƿ��Ǵ��ı��أ�
		�ǣ�
		Դ��Reader
		Ŀ�ģ�Writer
	3����ȷ�豸
		Դ��
			���̡�System.in
		Ŀ�ģ�
			Ӳ�̡�File
	
		InputStream in = System.in;
		FileWriter fw = new FileWriter("b.txt");
		������������ɣ������鷳������ȡ���ֽ�����ת���ַ����������ַ���������
	4����Ҫ���⹦����
		��Ҫ��ת����	���ֽ���ת���ַ�������Ϊ��ȷ��Դ��Reader�����������ı���������ݡ�
			����Ҫ�����е��ֽ���ת���ַ�����ʹ���ֽ�-->�ַ� ��InputStreamReader
		InputStreamReader isr = new InputStreamReader(System.in);
		FileWriter fw = new FileWriter("b.txt");
	
		����Ҫ������
		��Ҫ�����Ч��
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufw = new BufferedWriter(new FileWriter("b.txt"));
	 * </pre>
	 *
	 * @throws IOException
	 */
	private static void eg2_keybordToFile() throws IOException
	{
		// ���̵��ļ�: �ַ����ַ���
		try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/java/itcastday22/eg2_keybordToFile.txt")))
		{
			String readLine = null;
			while ((readLine = bufferedReader.readLine()) != null)
			{
				bufferedWriter.write(readLine);
				bufferedWriter.newLine();
				bufferedWriter.flush();
				if ("over".equalsIgnoreCase(readLine))
				{
					break;
				}
			}
		}
	}

	/**
	 * <pre>
	 * ����1������һ���ı��ļ���
	1,��ȷԴ��Ŀ�ġ�
		Դ��InputStream Reader
		Ŀ�ģ�OutputStream  Writer
	2,�Ƿ��Ǵ��ı���
		�ǣ�
		Դ��Reader
		Ŀ�ģ�Writer

	3,��ȷ�����豸��
		Դ��
			Ӳ�̣�File
		Ŀ�ģ�
			Ӳ�̣�File

		FileReader fr = new FileReader("a.txt");
		FileWriter fw = new FileWriter("b.txt");

	4,��Ҫ���⹦����
		��Ҫ����Ҫ��Ч��
		BufferedReader bufr = new BufferedReader(new FileReader("a.txt"));
		BufferedWriter bufw = new BufferedWriter(new FileWriter("b.txt"));
	 * </pre>
	 *
	 * @throws IOException
	 */
	private static void eg1_copyTextFile() throws IOException
	{
		// ���Ķ����ַ�,�������ַ���.������ʽ�����ֽ�����.
		try (BufferedReader bfBufferedReader = new BufferedReader(new FileReader("src/main/java/itcastday22/b.txt"));
				BufferedWriter bfBufferedWriter = new BufferedWriter(new FileWriter("src/main/java/itcastday22/b_copy.txt"));)
		{
			String readLine;
			while (null != (readLine = bfBufferedReader.readLine()))
			{
				bfBufferedWriter.write(readLine);
				bfBufferedWriter.newLine();
			}
		}
	}

}
