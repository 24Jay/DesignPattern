package structure.decorator;

import structure.decorator.inf.Beverage;

/**
 * 装饰者模式动态的将责任附加到对象上面，若要拓展功能，装饰着提供了比继承更有弹性的替代方案
 * 
 * @author jay
 *
 */
public class TestDecorator
{
	public static void main(String[] args)
	{
		Beverage espresso = new Espresso();
		Mocha mocha = new Mocha(espresso);
		System.out.print(mocha.getDescription());
		System.out.println(", Price = " + mocha.cost());

		HouseBlend houseBlend = new HouseBlend();
		Beverage mochaHouseBlend = new Mocha(houseBlend);
		System.out.print(mochaHouseBlend.getDescription());
		System.out.println(", Price = " + mochaHouseBlend.cost());

		DarkRoast darkRoast = new DarkRoast();
		Mocha mochaDarkRoast = new Mocha(darkRoast);
		System.out.print(mochaDarkRoast.getDescription());
		System.out.println(", Price = " + mochaDarkRoast.cost());

		Soy soyEspresso = new Soy(espresso);
		Soy soyHouseBlend = new Soy(mochaHouseBlend);
		Soy soyDarkRoast = new Soy(darkRoast);
		System.out.println(soyEspresso.getDescription() + ", Price = " + soyEspresso.cost());
		System.out.println(soyHouseBlend.getDescription() + ", Price = " + soyHouseBlend.cost());
		System.out.println(soyDarkRoast.getDescription() + ", Price = " + soyDarkRoast.cost());
	}
}
