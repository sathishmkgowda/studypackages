package awtpackage;

import java.awt.*;
import java.awt.event.*;


public class example1
{
public static void main(String[] args) 
{
	Frame f=new Frame("Ask sathish");   //creating object of frame and adding ask sathish is the title of the frame
	 Label l = new Label();             //cerating label ojects
	 l.setBounds(70,70,250,20);
	 
	Button b=new Button("click here");   //creating button
	b.setBounds(100, 100, 80, 30);
	
	
	f.addWindowListener(new WindowAdapter()                   //closing window
	{                  
		public void windowClosing(WindowEvent e) 
		{
			System.exit(0);
		}
	});
	
	
	b.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			l.setText("Rule the world");                 //label text
			
		}
	});
	
	
	f.add(b);                   //adding button to frame
	f.add(l);                   //adding label to frame
	f.setSize(800,800);         //set the frame size
	f.setLayout(null);         
	f.setVisible(true);
	
}
}
