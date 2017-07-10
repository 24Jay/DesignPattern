package build.singleton;

import java.lang.reflect.Constructor;

/**
 * @author jay
 *
 */
public class EagerlySinleton
{
	/****
	 * 如果應用程序總是創建或者使用singleton實例子，利用這個方法保證在JVM加載類的時候就馬上創建此唯一的實例
	 * JVM保證任何線程訪問之前一定先創建此實例
	 */
	private static EagerlySinleton uniqueInstance = new EagerlySinleton();

	// this constructor can only be invoked in its own class
	private EagerlySinleton()
	{
	}

	/**
	 * @return
	 */
	public static EagerlySinleton getInstance()
	{
		return uniqueInstance;
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException
	{

		for (int i = 0; i < 10; i++)
		{
			new Thread(new Runnable()
			{
				@Override
				public void run()
				{
					EagerlySinleton a = EagerlySinleton.getInstance();
					System.out.println("Newly created singleton = " + a);
				}
			}).start();
		}
		
		/***
		 * 通过反射来破解单例模式
		 */
		Class<?> cl = EagerlySinleton.class;
		EagerlySinleton ins1 = (EagerlySinleton) cl.newInstance();
		EagerlySinleton ins2 = (EagerlySinleton) cl.newInstance();
		System.out.println("ins1==ins2 : "+(ins1 == ins2));
	}
}
