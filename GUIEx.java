import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class GUIEx
{
	static JFrame f;
	static JPanel p;
	static JPanel p1;
	static JPanel p2;
	static JPanel p3;
	static JPanel p4;

	
	static JCheckBox ch;
	static JCheckBox ch1;
	static JCheckBox ch2;
	static JCheckBox ch3;
	static JCheckBox ch4;
	
	public GUIEx()
	{
			gui();
	}
	public void gui()
	{
		f=new JFrame("frame");
		f.setVisible(true);
		f.setSize(800,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p=new JPanel(new GridBagLayout());
		p1=new JPanel();
		
		
		
		p2=new JPanel();
		p3=new JPanel();
		p4=new JPanel();
		ch=new JCheckBox();
		ch1=new JCheckBox();
		ch2=new JCheckBox();
		ch3=new JCheckBox();
		ch4=new JCheckBox();
		//p.setBackground(Color.GREEN);
		p.setBorder(BorderFactory.createLineBorder(Color.black));
		//p1.setBackground(Color.RED);
		p.add(ch);
		p1.setBorder(BorderFactory.createLineBorder(Color.black));
		//p2.setBackground(Color.BLUE);
		p1.add(ch1);
		p2.setBorder(BorderFactory.createLineBorder(Color.black));
		//p3.setBackground(Color.BLACK);
		p2.add(ch2);
		p3.setBorder(BorderFactory.createLineBorder(Color.black));
		//p4.setBackground(Color.PINK);
		p3.add(ch3);
		p4.setBorder(BorderFactory.createLineBorder(Color.black));
		p4.add(ch4);
		
		JButton b=new JButton("red");
		b.setBounds(10,20,50,30);
		b.setName("red");
		b.addActionListener(new Action());
		
		
		
		JButton b1=new JButton("green");
		b1.setBounds(10,20,50,30);
		b1.setName("green");
		b1.addActionListener(new Action());
		
		
		JButton b2=new JButton("blue");
		b2.setBounds(10,20,50,30);
		b2.setName("blue");
		b2.addActionListener(new Action());
		
		
		JButton b3=new JButton("yellow");
		b3.setBounds(10,20,50,30);
		b3.setName("yellow");
		b3.addActionListener(new Action());
		
		
		JButton b4=new JButton("orange");
		b4.setBounds(10,20,50,30);
		b4.setName("orange");
		b4.addActionListener(new Action());
		
		GridBagConstraints c=new GridBagConstraints();
		c.insets=new Insets(10,10,10,10);
		c.gridx=0;
		c.gridy=2;
		p.add(b,c);
		
		c.gridx=0;
		c.gridy=3;
		p.add(b1,c);
		
		c.gridx=0;
		c.gridy=4;
		p.add(b2,c);
		
		c.gridx=0;
		c.gridy=5;
		p.add(b3,c);
		
		c.gridx=0;
		c.gridy=6;
		p.add(b4,c);
		
		
		
		
		f.add(p,BorderLayout.WEST);
		f.add(p1,BorderLayout.SOUTH);
		f.add(p2,BorderLayout.CENTER);
		f.add(p3,BorderLayout.NORTH);
		f.add(p4,BorderLayout.EAST);
		
		
	}
	public static void main(String args[])
	{
		GUIEx t=new GUIEx();
	}
	
	static class Action implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			JButton c = (JButton)e.getSource();
			Color selectedColor = Color.WHITE;
		
			if(c.getText().equals("green"))
				p.setBackground(Color.GREEN);
			else if(c.getText().equals("orange"))
				p1.setBackground(Color.ORANGE);
			else if(c.getText().equals("red"))
				p2.setBackground(Color.RED);
			else if(c.getText().equals("blue"))
				p3.setBackground(Color.BLUE);
			else if(c.getText().equals("yellow"))
				p4.setBackground(Color.YELLOW);
				
		}
	}
}