package build.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import build.factory.inf.IFactory;
import build.factory.pizza.ChinaPizza;
import build.factory.pizza.FrancePizza;
import build.factory.pizza.ItalyPizza;
import build.factory.pizza.Pizza;


public class PizzaFactory implements IFactory<Pizza>
{

	@Override
	public Pizza create()
	{
		Random random = new Random();
		int i = random.nextInt(3);
//		System.out.println(i);
		switch (i) {
		case 0:
			return new ItalyPizza();
		case 1:
			return new ChinaPizza();
		default:
			return new FrancePizza();
		}
	}

	@Override
	public List<Pizza> createList()
	{
		ArrayList<Pizza> list = new ArrayList<Pizza>(); 
		for (int i = 0; i < 6; i++)
			list.add(create());
		return list;
	}

}
