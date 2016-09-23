package day0910;

import day11.MyException;

/*
	�ʼǱ�����ʹ�á�
	Ϊ����չ�ʼǱ��Ĺ��ܣ����պ����ʲô�����豸��֪����

	����һ������ֻҪ�պ���ֵ��豸�������������Ϳ����ˡ�
	������Java�о��ǽӿڡ�

*/
interface USB // ��¶�Ĺ���
{
	public void insert();

	public void eject();
}

class UPan implements USB// һ��ǰ
{
	@Override
	public void insert()
	{
		System.out.println("upan open");
	}

	@Override
	public void eject()
	{
		System.out.println("upan close");
	}

}

public class Laptop
{
	public void run() throws MyException
	{
		useUSB(new UPan());
		useUSB(new UsbMouse());// ������չ1
		useUSB(new UsbKeybord());// ������չ2
	}

	// ʹ�ù���
	private void useUSB(USB u) throws MyException// �ӿ����͵����ã����ڽ���(ָ��)�ӿڵ��������//USB u= new UPan();
	{
		if (u == null)
		{
			throw new MyException("USB Equipment is not working");
		}
		else
		{
			u.insert();
			u.eject();
		}
	}
}

// һ���------------------------------
// ʵ�ֹ���

// ��Щ�豸�͵��Ե�����Խ����ˡ�
class UsbKeybord implements USB // һ���,ʵ�ֽӿ�
{

	@Override
	public void insert()
	{
		System.out.println("USB Keyboard is inserting !");
	}

	@Override
	public void eject()
	{
		System.out.println("USB Keyboard is ejecting !");
	}

}

class UsbMouse implements USB
{
	@Override
	public void insert()
	{
		System.out.println("UsbMouse open");
	}

	@Override
	public void eject()
	{
		System.out.println("UsbMouse close");
	}

}
