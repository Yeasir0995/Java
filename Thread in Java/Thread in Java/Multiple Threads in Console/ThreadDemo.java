import java.lang.*;

public class ThreadDemo extends Thread
{
	String name;
	int sleepTime;
	
	public ThreadDemo(String name, int sleepTime)
	{
		this.name = name;
		this.sleepTime = sleepTime;
		this.start();
	}
	
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("I am "+this.name+" : "+i);
			try
			{
				Thread.sleep(sleepTime);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
	public static void main(String args[])
	{
		ThreadDemo td1 = new ThreadDemo("Thread 1", 1000);
		ThreadDemo td2 = new ThreadDemo("Thread 2", 1000);
							//You may change the int value from the parameter and see the difference
	}
}