package day24.p2.objectstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import day18.p2.bean.GrandFa;

public class ObjectStreamDemo
{

	/**
	 * @param args
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{

		// writeObj();
		readObj();
	}

	public static void readObj() throws IOException, ClassNotFoundException
	{

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.object"));
		// ����ķ����л���
		GrandFa p = (GrandFa) ois.readObject();

		System.out.println(p.getName() + ":" + p.getAge());

		ois.close();

	}

	public static void writeObj() throws IOException, IOException
	{

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj.object"));
		// �������л��� �����л��Ķ������ʵ��Serializable�ӿڡ�
		oos.writeObject(new GrandFa("Сǿ", 30));

		oos.close();

	}

}
