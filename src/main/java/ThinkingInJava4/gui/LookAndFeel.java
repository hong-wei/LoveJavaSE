package ThinkingInJava4.gui;

import static ThinkingInJava4.net.mindview.util.SwingConsole.run;

import java.awt.Component;
import java.awt.FlowLayout;

//: gui/LookAndFeel.java
// Selecting different looks & feels.
// {Args: motif}
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class LookAndFeel extends JFrame
{
	private String[] choices = "Eeny Meeny Minnie Mickey Moe Larry Curly".split(" ");
	private Component[] samples = { new JButton("JButton"), new JTextField("JTextField"),
			new JLabel("JLabel"), new JCheckBox("JCheckBox"), new JRadioButton("Radio"),
			new JComboBox(choices), new JList(choices), };

	public LookAndFeel()
	{
		super("Look And Feel");
		setLayout(new FlowLayout());
		for (Component component : samples)
		{
			add(component);
		}
	}

	private static void usageError()
	{
		System.out.println("Usage:LookAndFeel [cross|system|motif]");
		System.exit(1);
	}

	public static void main(String[] args)
	{
		if (args.length == 0)
		{
			usageError();
		}
		if (args[0].equals("cross"))
		{
			try
			{
				UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		else if (args[0].equals("system"))
		{
			try
			{
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		else if (args[0].equals("motif"))
		{
			try
			{
				UIManager.setLookAndFeel("com.sun.java." + "swing.plaf.motif.MotifLookAndFeel");
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			usageError();
		}
		// Note the look & feel must be set before
		// any components are created.
		run(new LookAndFeel(), 300, 300);
	}
} /// :~