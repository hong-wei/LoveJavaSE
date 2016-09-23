package day25.gui.p1.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo
{
	public static void main(String[] args)
	{
		Frame frame = new Frame("my frame");
		// f.setSize(500, 400);
		// f.setLocation(400, 200);
		frame.setBounds(400, 200, 500, 400);
		frame.setLayout(new FlowLayout());// ������ʽ����

		Button aButton = new Button("һ����ť");
		frame.add(aButton);// ����ť��ӵ������С�

		// �ڴ����ϼ���һ��������
		frame.addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				// System.out.println("closing......." + e);
				System.exit(0);
			}

		});

		// �ڰ�ť�ϼ���һ��������
		aButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("button run .....");
				// System.exit(0);
			}
		});

		frame.setVisible(true);
		System.out.println("over");
	}

}
