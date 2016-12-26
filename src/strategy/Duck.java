package strategy;

import strategy.inf.IFly;
import strategy.inf.IQuack;

public abstract class Duck
{
	IFly fly;
	IQuack quack;

	public Duck()
	{

	}

	public abstract void display();

	public void performFly()
	{
		fly.fly();
	}

	public void performQuack()
	{
		quack.quack();
	}

	public void setFly(IFly flyBehavior)
	{
		fly = flyBehavior;
	}
	
	public void setQuack(IQuack quackBehavior)
	{
		quack = quackBehavior;
	}
	
	public void swim()
	{
		System.out.println("All ducks float, even decoys!");
	}
}
