package structure.decorator;

import structure.decorator.inf.Beverage;
import structure.decorator.inf.CondimentDecorator;

public class Soy extends CondimentDecorator
{
	Beverage beverage;
	
	public Soy(Beverage beverage)
	{
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription()
	{
		return beverage.getDescription()+", Soy";
	}

	@Override
	public double cost()
	{
		return beverage.cost()+2.0;
	}

}
