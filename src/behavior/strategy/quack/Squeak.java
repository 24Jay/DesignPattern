package behavior.strategy.quack;

import behavior.strategy.inf.IQuack;

public class Squeak implements IQuack
{

	@Override
	public void quack()
	{
		System.out.println("Squeak!!!!");
	}

}
