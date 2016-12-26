package strategy.quack;

import strategy.inf.IQuack;

public class Squeak implements IQuack
{

	@Override
	public void quack()
	{
		System.out.println("Squeak!!!!");
	}

}
