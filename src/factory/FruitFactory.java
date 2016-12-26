package factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import factory.fruit.Apple;
import factory.fruit.Banana;
import factory.fruit.Fruit;
import factory.fruit.Grape;
import factory.inf.IFactory;

public class FruitFactory implements IFactory<Fruit>
{

	@Override
	public Fruit create()
	{
		Random random = new Random();
		int i = random.nextInt(3);
		switch (i) {
		case 0:
			return new Apple();
		case 1:
			return new Grape();
		case 2:
			return new Banana();
		default:
			return new Apple();
		}
	}

	@Override
	public List<Fruit> createList()
	{
		ArrayList<Fruit> list = new ArrayList<Fruit>();
		for (int i = 0; i < 6; i++)
			list.add(create());
		return list;
	}

}
