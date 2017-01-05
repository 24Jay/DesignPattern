package template;

public class TestTemplate
{
	public static void main(String []args)
	{
		TeaWithHook tea = new TeaWithHook();
		CoffeeWithHook coffee = new CoffeeWithHook();
		
		System.out.println("Making tea............");
		tea.prepareRecipe();
		
		System.out.println("\n\nMaking coffee............");
		coffee.prepareRecipe();
	}
}
