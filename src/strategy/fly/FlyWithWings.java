package strategy.fly;

import strategy.inf.IFly;

public class FlyWithWings implements IFly
{

	@Override
	public void fly()
	{
		System.out.println("I'm flyying!");
	}

}
