package singleton;

/**
 * A simple singleton pattern. 
 * To ensure this class has only one class, and
 * offer a global access point. 
 * 此例子证明了经典的单例模式其实还是不能够保证“只有一个实例”
 * @author jay
 *
 */
public class SimpleSingleton
{
	// SimpleSingleton has an instance : uniqueInstance
	private static SimpleSingleton uniqueInstance;

	// this constructor can only be invoked in its own class
	private SimpleSingleton()
	{
	}

	public static SimpleSingleton getInstance()
	{
		if (null == uniqueInstance)
		{
			// sleep this thread for 0.1 seconds, so that other thread may enter
			// this point.
			try
			{
				Thread.sleep(100);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			uniqueInstance = new SimpleSingleton();
		}
		return uniqueInstance;
	}

	public static void main(String[] args)
	{

		for (int i = 0; i < 10; i++)
		{
			Thread thread = new Thread(new Runnable()
			{

				@Override
				public void run()
				{
					SimpleSingleton a = SimpleSingleton.getInstance();
					System.out.println("Newly created singleton = " + a);
				}
			});
			thread.start();
		}
	}
}

/**
 * output:
 *
 * Newly created singleton = singleton.SimpleSingleton@5097878e
Newly created singleton = singleton.SimpleSingleton@5d2a71b2
Newly created singleton = singleton.SimpleSingleton@585a62b3
Newly created singleton = singleton.SimpleSingleton@278d8d22
Newly created singleton = singleton.SimpleSingleton@63d6cae
Newly created singleton = singleton.SimpleSingleton@31ed5890
Newly created singleton = singleton.SimpleSingleton@7f2d51f7
Newly created singleton = singleton.SimpleSingleton@22a0b4e0
Newly created singleton = singleton.SimpleSingleton@6c308163
Newly created singleton = singleton.SimpleSingleton@7595bd09
*/
