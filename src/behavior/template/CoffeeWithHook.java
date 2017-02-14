package behavior.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook
{

	@Override
	void brew()
	{
		System.out.println("Dripping coffee through filter.");
	}

	@Override
	void addCondiment()
	{
		System.out.println("Adding sugar and milk.");
	}

	@Override
	boolean customerWantsCondiments()
	{
		String answer = getUserInput();
		if (answer.toLowerCase().startsWith("y"))
			return true;
		else
			return false;
	}

	private String getUserInput()
	{
		String answer = null;
		System.out.println("Would you like milk and sugar with coffee(y/n)?");
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));

		try
		{
			answer = reader.readLine();
		} catch (IOException e)
		{
			e.printStackTrace();
		}

		if (answer == null)
			return "no";
		return answer;
	}

}
