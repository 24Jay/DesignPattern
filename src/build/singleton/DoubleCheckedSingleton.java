package build.singleton;

/**
 * 使用雙重枷鎖，首先檢查是否已經有實例，如果沒有實例，再進行同步。 這樣就一來，只有第一次會同步,這正是我們想要的。 這個可以幫助提升性能
 * 
 * @author jay
 *
 */
public class DoubleCheckedSingleton
{
	// Singleton_1 has an instance : uniqueInstance
	private volatile static DoubleCheckedSingleton uniqueInstance;

	// this constructor can only be invoked in its own class
	private DoubleCheckedSingleton()
	{
	}

	/**
	 * @return
	 */
	public static DoubleCheckedSingleton getInstance()
	{
		// 如果還沒有實例，就進行同步，創建一個,所以ｉｆ框裏面的代碼只會執行一次
		if (null == uniqueInstance)
		{
			synchronized (DoubleCheckedSingleton.class)
			{
				if (null == uniqueInstance)
				{
					/**
					 * 如果没有volatile，这里会有问题：
					 * 因为下面这一步实际上可以分为三步
					 * １．分配内存　：allocat()；   
                     * 2. 实例化对象   
                     * ３．将uniqueInstance指向分配的内存空间
                     * 
                     * 如果没有volatile,这三步可能会因为指令重排序的关系，顺序变成１，３，２；
                     * 当线程Ａ执行到３的时候，此时uniqueInstance!=null了;
                     * 这时候，线程B执行到外层的判断，uniqueIntance==null为false,这时候线程Ｂ直接返回尚未初始化的实例，
                     * 会造成程序崩溃。
                     * 
                     * */
					uniqueInstance = new DoubleCheckedSingleton();
				}
			}
		}
		// 如果已經有了實例就不需要再進行判斷了，直接返回實例即可
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
					DoubleCheckedSingleton a = DoubleCheckedSingleton.getInstance();
					System.out.println("Newly created singleton = " + a);
				}
			}).start();
		}
	}
}
