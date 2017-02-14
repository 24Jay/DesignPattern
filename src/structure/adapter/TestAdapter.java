package structure.adapter;

import structure.adapter.inf.IDuck;

public class TestAdapter
{
	public static void main(String []args)
	{
		IDuck duck = new MallardDuck();
		IDuck turkeyDuck = new TurkeyAdapter(new WildTurkey());
		
		duck.fly();
		duck.quack();
		
		turkeyDuck.fly();
		turkeyDuck.quack();
	}
}
