package itcastday25.gui.p1.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseAndKeyDemo
{

	private Frame f;
	private TextField tf;
	private Button but;

	public MouseAndKeyDemo()
	{
		this.init();

	}

	private void init()
	{

		this.f = new Frame("��ʾ���ͼ��̼���");
		this.f.setBounds(400, 200, 500, 400);
		this.f.setLayout(new FlowLayout());

		this.tf = new TextField(35);
		this.but = new Button("һ����ť");

		this.f.add(this.tf);
		this.f.add(this.but);

		this.myEvent();

		this.f.setVisible(true);

	}

	private void myEvent()
	{

		// ���ı�����Ӽ��̼�����
		this.tf.addKeyListener(new KeyAdapter()
		{

			@Override
			public void keyPressed(KeyEvent e)
			{

				// System.out.println("key run..."+KeyEvent.getKeyText(e.getKeyCode())+"::::"+e.getKeyCode());
				// int code = e.getKeyCode();
				// if(!(code>=KeyEvent.VK_0 && code<=KeyEvent.VK_9)){
				// System.out.println("����������");
				// e.consume();
				// }

				if (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_ENTER)
				{
					System.out.println("enter run ...");
				}
			}

		});

		this.f.addWindowListener(new WindowAdapter()
		{

			@Override
			public void windowClosing(WindowEvent e)
			{

				System.exit(0);
			}

		});

		this.but.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				// System.out.println("action run.....");
			}
		});

		// �ڰ�ť�����һ��������.
		this.but.addMouseListener(new MouseAdapter()
		{

			private int count = 1;

			@Override
			public void mouseEntered(MouseEvent e)
			{

				// System.out.println("mouse enter..."+count++);

				// tf.setText("mouse enter..."+count++);

			}

			@Override
			public void mouseClicked(MouseEvent e)
			{

				if (e.getClickCount() == 2)
				{
					MouseAndKeyDemo.this.tf.setText("mouse double click..." + this.count++);
					// System.out.println("mouse click..."+count++);
					// System.out.println(e);
				}
			}

		});
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		new MouseAndKeyDemo();
	}

}
