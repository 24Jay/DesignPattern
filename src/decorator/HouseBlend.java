package decorator;

import decorator.inf.Beverage;

public class HouseBlend extends Beverage
{

	public HouseBlend()
	{
		description = "HouseHold";
	}
	
	@Override
	public double cost()
	{
		return 0.89;
	}

}
