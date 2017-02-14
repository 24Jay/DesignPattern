package behavior.strategy.fly;

import behavior.strategy.inf.IFly;

public class FlyWithWings implements IFly
{

	@Override
	public void fly()
	{
		System.out.println("I'm flyying!");
	}

}
