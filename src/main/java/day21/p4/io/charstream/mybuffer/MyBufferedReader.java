package day21.p4.io.charstream.mybuffer;

import java.io.IOException;
import java.io.Reader;

/**
 * �Զ���Ķ�ȡ����������ʵ����ģ��һ��BufferedReader.
 *
 * ������ ���������޷Ǿ��Ƿ�װ��һ�����飬 �������ṩ�˸���ķ�����������з��ʡ� ��ʵ��Щ�������ղ����Ķ�������ĽǱꡣ
 *
 * �����ԭ�� ��ʵ���Ǵ�Դ�л�ȡһ������װ���������С� �ڴӻ������в��ϵ�ȡ��һ��һ�����ݡ�
 *
 * �ڴ˴�ȡ����ڴ�Դ�м���ȡһ�����ݽ��������� ��Դ�е�����ȡ��ʱ����-1��Ϊ������ǡ�
 *
 *
 * @author Administrator
 *
 */
public class MyBufferedReader extends Reader
{

	private Reader r;

	// ����һ��������Ϊ��������
	private char[] buf = new char[1024];

	// ����һ��ָ�����ڲ�����������е�Ԫ�ء������������һ��Ԫ�غ�ָ��Ӧ�ù��㡣
	private int pos = 0;

	// ����һ�����������ڼ�¼�������е����ݸ����� �������ݼ���0���ʹ�Դ�м�����ȡ���ݵ��������С�
	private int count = 0;

	MyBufferedReader(Reader r)
	{
		this.r = r;
	}

	/**
	 * �÷����ӻ�������һ��ȡһ���ַ���
	 * 
	 * @return
	 * @throws IOException
	 */
	public int myRead() throws IOException
	{

		if (this.count == 0)
		{
			this.count = this.r.read(this.buf);
			this.pos = 0;
		}
		if (this.count < 0)
		{
			return -1;
		}

		char ch = this.buf[this.pos++];

		this.count--;

		return ch;

		/*
		 * //1,��Դ�л�ȡһ�����ݵ��������С���Ҫ�����жϣ�ֻ�м�����Ϊ0ʱ������Ҫ��Դ�л�ȡ���ݡ� if(count==0){ count = r.read(buf);
		 * 
		 * if(count<0) return -1;
		 * 
		 * //ÿ�λ�ȡ���ݵ��������󣬽Ǳ����. pos = 0; char ch = buf[pos];
		 * 
		 * pos++; count--;
		 * 
		 * return ch;
		 * 
		 * }else if(count>0){
		 * 
		 * char ch = buf[pos];
		 * 
		 * pos++; count--;
		 * 
		 * return ch;
		 * 
		 * }
		 */

	}

	public String myReadLine() throws IOException
	{

		StringBuilder sb = new StringBuilder();

		int ch = 0;
		while ((ch = this.myRead()) != -1)
		{

			if (ch == '\r')
			{
				continue;
			}
			if (ch == '\n')
			{
				return sb.toString();
			}
			// ���ӻ������ж������ַ����洢�����������ݵĻ������С�
			sb.append((char) ch);

		}

		if (sb.length() != 0)
		{
			return sb.toString();
		}
		return null;
	}

	public void myClose() throws IOException
	{

		this.r.close();
	}

	@Override
	public int read(char[] cbuf, int off, int len) throws IOException
	{

		return 0;
	}

	@Override
	public void close() throws IOException
	{
	}
}
