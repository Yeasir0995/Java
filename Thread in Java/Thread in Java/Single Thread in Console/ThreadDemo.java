import java.lang.*;

public class ThreadDemo extends Thread
{
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("Thread: "+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
	public static void main(String args[])
	{
		ThreadDemo td = new ThreadDemo();
		td.run();
	}
}