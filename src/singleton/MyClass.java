package singleton;

public class MyClass
{
	private static MyClass singleton;

	private MyClass()
	{

	}

	public static MyClass getInstance()
	{
		if (singleton == null)
			singleton = new MyClass();
		return singleton;
	}

}
