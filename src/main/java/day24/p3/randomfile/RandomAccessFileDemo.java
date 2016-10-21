package day24.p3.randomfile;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * <pre>
 * RandomAccessFile
 * һ����������֣����ᡣ����io��ϵ�е����ࡣ
 *
 * �ص㣺
 * 1���ö����ܶ�������д��
 * 2���ö����ڲ�ά����һ��byte���飬��ͨ��ָ����Բ��������е�Ԫ�أ�
 * 3������ͨ��getFilePointer������ȡָ���λ�ã���ͨ��seek��������ָ���λ�á�
 * 4����ʵ�ö�����ǽ��ֽ�������������������˷�װ��
 * 5���ö����Դ����Ŀ��ֻ�����ļ���ͨ�����캯���Ϳ��Կ�����
 * </pre>
 */
public class RandomAccessFileDemo
{

	public static void main(String[] args) throws IOException
	{
		writeFile();
		readFile();
		randomWrite();
	}

	public static void randomWrite() throws IOException
	{
		RandomAccessFile randomAccessFile = new RandomAccessFile("ranacc.txt", "rw");

		// ��ָ��λ��д�����ݡ�
		randomAccessFile.seek(3 * 8);// �����д��,ֻҪ�ƶ�λ�þ���

		randomAccessFile.write("����".getBytes());
		randomAccessFile.writeInt(108);

		randomAccessFile.close();
	}

	public static void readFile() throws IOException
	{

		RandomAccessFile raf = new RandomAccessFile("ranacc.txt", "r");

		// ͨ��seek����ָ���λ�á�
		raf.seek(1 * 8);// ����Ķ�ȡ:ֻҪָ��ָ���λ�ü��ɡ�

		byte[] buf = new byte[4];
		raf.read(buf);

		String name = new String(buf);

		int age = raf.readInt();

		System.out.println("name=" + name);
		System.out.println("age=" + age);

		System.out.println("pos:" + raf.getFilePointer());

		raf.close();

	}

	// ʹ��RandomAccessFile����д��һЩ��Ա��Ϣ���������������䡣
	public static void writeFile() throws IOException
	{
		/*
		 * ����ļ������ڣ��򴴽�������ļ����ڣ�������
		 */
		RandomAccessFile raf = new RandomAccessFile("ranacc.txt", "rw");

		raf.write("����".getBytes());
		raf.writeInt(97);
		raf.write("Сǿ".getBytes());
		raf.writeInt(99);
		//
		raf.close();
	}

}
