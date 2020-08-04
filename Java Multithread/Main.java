import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class producer extends Thread
{
	public void run()
	{
		while(true)
		{
			synchronized (Queue.lock) {
				
				if(!Queue.put())
				{
					System.out.println("Queue is full. No task is already taken by any of the consumer.");
					try {
						Queue.lock.wait();
					} catch(InterruptedException e) {
						System.out.println(e.getMessage());
					}
				}
			}

			try {
				Thread.sleep(3);
			}catch (Exception e) {
			}
		}
	}
}
class Consumer extends Thread
{
	public void run()
	{
		while(true)
		{
			synchronized (Queue.lock) {

				if(!Queue.take())
				{	
					System.out.println("Queue is empty. There is no task present in the Queue.");
					try {
						Queue.lock.wait();
					} catch(InterruptedException e) {
						System.out.println(e.getMessage());
					}
				}
			}
			
			try {
				Thread.sleep(10);
			}catch (Exception e) {
			}
		}
	}
}
class Queue 
{
	private static List<Integer> queue =  new ArrayList<Integer>();
	private static final int max_size = 10;
	private static int number = 0;
	private static int value = 0;
	public static Object lock =  new Object();
	
	static boolean put()
	{
		if(number <= max_size)
		{
			queue.add(value);
			System.out.println("Producer adding Task "+(value++) +" to the queue.");
			lock.notifyAll();
			return true;
		}
		return false;
	}
	
	static boolean take()
	{
		if(number > 0)
		{
			int value = queue.remove(0);
			System.out.println("Consumer Thread Poping value "+(--number)+" removing "+value+" from the queue");
			lock.notify();
			return true;
		}
		return false;
	}	
}
public class Main {
	public static void main(String []args)
	{
		producer p = new producer();
		p.start();
		ExecutorService poolProducer = Executors.newSingleThreadExecutor();
		poolProducer.execute(p);
		final int numberOfProducerThread = 10;
		ExecutorService poolConsumer = Executors.newCachedThreadPool();
		for (int i = 0; i < numberOfProducerThread; i++) {
			Consumer c = new Consumer();
			c.start();
			poolConsumer.execute(c);
		}
	}
}
