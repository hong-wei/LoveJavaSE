package day28.reflect.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * �������У�ÿ�������Ӳ�������޸Ĵ��룬����ֱ�Ӱ��ո�ʽ�޸�pci.properties�Ϳ����ˡ� Դ����������ö��ˡ�
 */
public class RunComputer // BK --day10 Class 7Interface 4PC-USB-Reflection

{
	public static void main(String[] args) throws Exception
	{
		Mainboard mb = new Mainboard();
		mb.run();
		// ÿ�����һ���豸����Ҫ�޸Ĵ��봫��һ���´����Ķ���
		// mb.usePCI(new SoundCard());
		// �ܲ��ܲ��޸Ĵ���Ϳ���������������
		// ����new����ɣ�����ֻ��ȡ��class�ļ������ڲ�ʵ�ִ�������Ķ�����

		File configFile = new File("src/main/java/itcastday28/pci.properties");

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(configFile);

		prop.load(fis);

		for (int x = 0; x < prop.size(); x++)
		{
			String pciName = prop.getProperty("pci" + (x + 1));
			Class<?> clazz = Class.forName(pciName); // ��Classȥ�������pci���ࡣ
			PciInterface p = (PciInterface) clazz.newInstance();
			mb.usePCI(p);
		}

		fis.close();

	}

}
