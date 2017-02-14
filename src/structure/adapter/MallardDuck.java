package structure.adapter;

import structure.adapter.inf.IDuck;

public class MallardDuck implements IDuck
{

	@Override
	public void quack()
	{
		System.out.println("Quack");
	}

	@Override
	public void fly()
	{
		System.out.println("The MallardDuck is flyying!");
	}

}
