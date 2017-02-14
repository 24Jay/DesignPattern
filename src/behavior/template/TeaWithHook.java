package behavior.template;

public class TeaWithHook extends CaffeineBeverageWithHook
{

	@Override
	void brew()
	{
		System.out.println("Steeping the tea.");
	}

	@Override
	void addCondiment()
	{
		System.out.println("Adding lemon into teaport.");		
	}

}
