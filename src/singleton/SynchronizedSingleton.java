package singleton;

/**
 * A synchronized  singleton pattern.
 * 此例子证明了synchronized单例模式能够保证多线程情况下依然能够正常工作
 * 但是它依然会有负作用，同步会造成程序执行效率下降，因爲每次調用的時候都會進行同步。
 * 因此如果这个类是频繁使用的，那么可能就需要重新考虑其他的方法了。
 * 
 * @author jay
 *
 */
public class SynchronizedSingleton
{
	// Singleton_1 has an instance : uniqueInstance
	private static SynchronizedSingleton uniqueInstance;

	// this constructor can only be invoked in its own class
	private SynchronizedSingleton()
	{
	}

	/**
	 * @return
	 */
	public static synchronized SynchronizedSingleton getInstance()
	{
		if (null == uniqueInstance)
		{
			/*try
			{
				Thread.sleep(100);
				
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			*/
			uniqueInstance = new SynchronizedSingleton();
		}
		return uniqueInstance;
	}

	public static void main(String[] args)
	{

		for (int i = 0; i < 10; i++)
		{
			new Thread(new Runnable()
			{
				@Override
				public void run()
				{
					SynchronizedSingleton a = SynchronizedSingleton.getInstance();
					System.out.println("Newly created singleton = " + a);
				}
			}).start();
		}
	}
}
