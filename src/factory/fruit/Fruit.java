package factory.fruit;

public class Fruit
{
	protected String name;

	public String printName()
	{
//		System.out.println("This is a fruit of " + name);
		return name;
	}

	@Override
	public String toString()
	{
		return name;
	}
	
	
}
