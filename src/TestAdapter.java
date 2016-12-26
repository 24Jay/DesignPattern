import adapter.MallardDuck;
import adapter.TurkeyAdapter;
import adapter.WildTurkey;
import adapter.inf.IDuck;

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
