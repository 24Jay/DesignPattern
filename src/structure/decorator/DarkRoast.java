package structure.decorator;

import structure.decorator.inf.Beverage;

public class DarkRoast extends Beverage
{

	public DarkRoast()
	{
		description = "DarkRoast";
	}
	@Override
	public double cost()
	{
		return 2.99;
	}

}
