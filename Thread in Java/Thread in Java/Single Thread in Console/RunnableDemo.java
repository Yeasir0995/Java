import java.lang.*;

public class RunnableDemo implements Runnable
{
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("Thread: "+i);
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
	public static void main(String args[])
	{
		RunnableDemo rd = new RunnableDemo();
		rd.run();
	}
}