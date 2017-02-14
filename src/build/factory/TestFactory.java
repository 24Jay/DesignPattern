package build.factory;

import build.factory.inf.IFactory;

public class TestFactory
{

	@SuppressWarnings("rawtypes")
	public static void main(String[] args)
	{
		IFactory fruitFactory = new FruitFactory();
		IFactory pizzaFactory = new PizzaFactory();
		System.out.println("Fruit = " + fruitFactory.create());
		System.out.println("Pizza = " + pizzaFactory.create());

		System.out.println("FruitList = " + fruitFactory.createList());
		System.out.println("PizzaList = " + pizzaFactory.createList());
	}
}
