package itcastday20.p3.io.filereader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

//���󣺶�ȡһ���ı��ļ�������ȡ�����ַ���ӡ������̨.

public class FileReaderDemo {
	private static final String PATH = "/Users/zhanghongwei/Documents/Dropbox/EclipseLife"
			+ "/LoveJavaSE/src/itcastday20/p3/io/filereader/demo.txt";

	public static void main(String[] args) throws IOException {

		// 1,������ȡ�ַ����ݵ�������
		/*
		 * �ڴ�����ȡ������ʱ������Ҫ��ȷ����ȡ���ļ���һ��Ҫȷ�����ļ��Ǵ��ڵġ�
		 * 
		 * ��һ����ȡ������һ���Ѵ����ļ���
		 */
		FileReader fr = new FileReader(PATH);

		// int ch = 0;
		//
		// while((ch=fr.read())!=-1){
		// System.out.println((char)ch);
		// }

		// ��Reader�е�read������ȡ�ַ���
		int ch0 = fr.read();
		System.out.println((char) ch0);
		int ch1 = fr.read();
		System.out.println(ch1);
		int ch2 = fr.read();

		fr.close();
		// my heaven
		myHeaven();
	}

	private static void myHeaven() {
		System.out.println("-----my heaven------");
		// requirements:I need read data from a file in the PATH
		// 1 get a in stream
		Reader reader = null;
		try {
			reader = new FileReader(PATH);
			int read = reader.read();
			while (read!=-1) {
				System.out.println((char)read);
				read = reader.read();
			}
		} catch (Exception e) {

		} finally {
			if (reader!=null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
	}

}
