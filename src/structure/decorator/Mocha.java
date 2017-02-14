package structure.decorator;

import structure.decorator.inf.Beverage;
import structure.decorator.inf.CondimentDecorator;

public class Mocha extends CondimentDecorator
{
	Beverage beverage;
	
	public Mocha(Beverage beverage)
	{
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription()
	{
		return beverage.getDescription()+", Mocha";
	}

	@Override
	public double cost()
	{

		return beverage.cost()+1.0;
	}

}
