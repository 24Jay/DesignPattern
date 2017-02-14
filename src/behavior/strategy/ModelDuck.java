package behavior.strategy;

import behavior.strategy.fly.FlyNoway;
import behavior.strategy.quack.MuteQuack;

public class ModelDuck extends Duck
{

	@Override
	public void display()
	{
		System.out.println("I am a model duck that cannot fly and quack, but i can swimming");
	}
	
	public ModelDuck()
	{
		this.fly = new FlyNoway();
		this.quack = new MuteQuack();
	}

}
