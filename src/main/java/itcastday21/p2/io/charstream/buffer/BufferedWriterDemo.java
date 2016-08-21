package itcastday21.p2.io.charstream.buffer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	private static final String LINE_SEPARATOR = System.getProperty("line.separator");
	private static final String PATH = "/Users/zhanghongwei/Documents/Dropbox/EclipseLife/LoveJavaSE/src/itcastday21/buf.txt";

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter(PATH);

		// Ϊ�����д���Ч�ʡ�ʹ�����ַ����Ļ�������
		// ������һ���ַ�д�����Ļ��������󣬲���ָ��Ҫ������������������
		BufferedWriter bufw = new BufferedWriter(fw);

		// ʹ�û�������д�뷽����������д�뵽�������С�
		// bufw.write("abcdefq"+LINE_SEPARATOR+"hahahha");
		// bufw.write("xixiixii");
		// bufw.newLine();
		// bufw.write("heheheheh");

		for (int x = 1; x <= 4; x++) {
			bufw.write("abcdef" + x);
			bufw.newLine();
			bufw.flush();
		}

		// ʹ�û�������ˢ�·���������ˢĿ�ĵ��С�
		// bufw.flush();

		// �رջ���������ʵ�رյľ��Ǳ������������
		bufw.close();

		// fw.write("hehe");

		// fw.close();

		// my Heaven
//		myHeaven();
	}

	/**
	 * Write the String "love you" to the file ,using the bufferWriter Stri
	 */
	private static void myHeaven() throws IOException {
		String myWords = "love you, I am working for you ";

		FileWriter fileWriter = new FileWriter(PATH);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		for (int i = 0; i < 4; i++) {
			bufferedWriter.write(myWords);
			bufferedWriter.newLine();
			bufferedWriter.flush();
		}

		bufferedWriter.close();
	}

}
