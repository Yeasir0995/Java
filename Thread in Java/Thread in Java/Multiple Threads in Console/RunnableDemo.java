import java.lang.*;

public class RunnableDemo implements Runnable
{
	Thread t;
	int sleepTime;
	public RunnableDemo(String name, int sleepTime)
	{
		this.sleepTime = sleepTime;
		t = new Thread(this,name);
		t.start();
	}
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("I am "+t.getName()+" : "+i);
			try
			{
				Thread.sleep(this.sleepTime);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
	public static void main(String args[])
	{
		RunnableDemo rd1 = new RunnableDemo("Thread 1", 1000);
		RunnableDemo rd2 = new RunnableDemo("Thread 2", 1000);
							//You may change the int value from the parameter and see the difference
	}
}