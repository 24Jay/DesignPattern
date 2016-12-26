package strategy.quack;

import strategy.inf.IQuack;

public class MuteQuack implements IQuack
{

	@Override
	public void quack()
	{
		System.out.println("<<Silence>>");
	}

}
