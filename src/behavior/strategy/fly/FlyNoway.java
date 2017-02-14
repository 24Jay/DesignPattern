package behavior.strategy.fly;

import behavior.strategy.inf.IFly;

public class FlyNoway implements IFly
{

	@Override
	public void fly()
	{
		System.out.println("I can't fly!");
	}

}
