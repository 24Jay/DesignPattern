package strategy;

import strategy.fly.FlyWithWings;
import strategy.quack.Quack;

public class MallardDuck extends Duck 
{

	@Override
	public void display()
	{
		System.out.println("I am a real mallad duck");
	}
	
	public MallardDuck()
	{
		this.fly = new FlyWithWings();
		this.quack = new  Quack();
	}
	
}
