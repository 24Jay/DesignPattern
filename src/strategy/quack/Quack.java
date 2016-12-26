package strategy.quack;

import strategy.inf.IQuack;

public class Quack implements IQuack
{

	@Override
	public void quack()
	{
		System.out.println("Quack!");
	}

}
