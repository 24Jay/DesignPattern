package strategy.fly;

import strategy.inf.IFly;

public class FlyNoway implements IFly
{

	@Override
	public void fly()
	{
		System.out.println("I can't fly!");
	}

}
