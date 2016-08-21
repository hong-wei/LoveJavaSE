package itcastday10;

import itcastday11.MyException;

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

public class Laptop
{
	public void run() throws MyException
	{
		this.useUSB(new UPan());
		this.useUSB(new UsbMouse());// ������չ1
		this.useUSB(new UsbKeybord());// ������չ2
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

class UPan implements USB
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
