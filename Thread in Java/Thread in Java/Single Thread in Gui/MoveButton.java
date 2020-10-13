import java.lang.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class MoveButton extends JFrame implements Runnable
{
	JButton btn;
	JPanel panel;
	
	Random r;
	int x, y;
	
	public MoveButton()
	{
		super("Move Button GUI");
		
		r = new Random();
		x=0;
		y=0;
		this.setSize(800, 450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		btn = new JButton("Click Me");
		btn.setBounds(x,y,120,30);
		panel.add(btn);
		
		this.add(panel);
		
	}
	public void run()
	{
		int x, y;
		for(int i=0; i<20; i++)
		{
			try
			{
				System.out.println(i);
				x=r.nextInt(650);
				y=r.nextInt(350);
				btn.setBounds(x,y,120,30);
				Thread.sleep(1500);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
	public static void main(String args[])
	{
		MoveButton mb = new MoveButton();
		mb.setVisible(true);
		mb.run();
	}
}