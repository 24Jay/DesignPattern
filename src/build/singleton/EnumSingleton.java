package build.singleton;

public enum EnumSingleton
{
	INSTANCE;

	public void doSomething()
	{
		System.out.println("This is an EnumSingleton!");
	}
}
