package itcastday21.p1.io.charstream.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextTest_2 {
	private static final String PATHREAD = "/Users/zhanghongwei/Documents/Dropbox/EclipseLife/LoveJavaSE/src/itcastday21/IO��_2.txt";
	private static final String PATHWRITE = "/Users/zhanghongwei/Documents/Dropbox/EclipseLife/LoveJavaSE/src/itcastday21/copytext_2.txt";

	private static final int BUFFER_SIZE = 1024;

	public static void main(String[] args) {

		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader(PATHREAD);
			fw = new FileWriter(PATHWRITE);
			
			//����һ����ʱ���������ڻ����ȡ�����ַ���
			char[] buf = new char[BUFFER_SIZE];//����ǻ������� 
			
			//����һ��������¼��ȡ�����ַ�����(��ʵ������������װ���ַ����� )
			int len = 0;
			while((len=fr.read(buf))!=-1){
				fw.write(buf, 0, len);
			}
			
		} catch (Exception e) {
//			System.out.println("��дʧ��");
			throw new RuntimeException("��дʧ��");
		}finally{
			if(fw!=null)
				try {
					fw.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			if(fr!=null)
				try {
					fr.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
		}
	}

}
