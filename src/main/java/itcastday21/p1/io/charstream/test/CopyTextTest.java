package itcastday21.p1.io.charstream.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ������ҵ����c�̵�һ���ı��ļ����Ƶ�d�̡�
 *
 * ˼·�� 1����Ҫ��ȡԴ�� 2����������Դ����д�뵽Ŀ�ĵء� 3����Ȼ�ǲ����ı����ݣ�ʹ���ַ�����
 *
 */

public class CopyTextTest
{
	public static final String PATHREAD = "src/main/java/itcastday21/IO��_2.txt";
	public static final String PATHWRITE = "src/main/java/itcastday21/copytext_1.txt";

	public static void main(String[] args) throws IOException
	{

		// 1,��ȡһ�����е��ı��ļ���ʹ���ַ���ȡ�����ļ��������
		FileReader fr = new FileReader(CopyTextTest.PATHREAD);
		// 2,����һ��Ŀ�ģ����ڴ洢�������ݡ�
		FileWriter fw = new FileWriter(CopyTextTest.PATHWRITE);
		// 3,Ƶ���Ķ�д������
		int ch = 0;
		while ((ch = fr.read()) != -1)
		{
			fw.write(ch);
		}
		// 4,�ر�����Դ��

		fw.close();
		fr.close();
	}

}
