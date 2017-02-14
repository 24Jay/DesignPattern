package behavior.strategy.quack;

import behavior.strategy.inf.IQuack;

public class MuteQuack implements IQuack
{

	@Override
	public void quack()
	{
		System.out.println("<<Silence>>");
	}

}
