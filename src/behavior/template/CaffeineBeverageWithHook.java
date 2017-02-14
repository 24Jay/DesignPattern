package behavior.template;

/**
 * Template
 * @author jay
 *
 */
public abstract class CaffeineBeverageWithHook
{
	// 将模板方法声明为final，防止子类改变模板方法
	final void prepareRecipe()
	{
		System.out.println("Start the recipe>>>>>>>");
		boilWater();
		brew();
		pourInCup();
		addCondiment();
	}

	abstract void brew();

	abstract void addCondiment();

	void boilWater()
	{
		System.out.println("Boiling water!");
	}

	void pourInCup()
	{
		System.out.println("Pouring into cup");
	}

	/**
	 * 钩子hook是一种被声明在抽象类中的方法，但是只有空或者默认的实现。 钩子的存在让类有能力对算法的不同点进行挂钩。 要不要挂钩，由子类决定。
	 * 
	 * @return
	 */
	boolean customerWantsCondiments()
	{
		return true;
	}
}
