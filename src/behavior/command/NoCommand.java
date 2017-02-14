package behavior.command;

import behavior.command.inf.ICommand;

public class NoCommand implements ICommand
{

	@Override
	public void execute()
	{
		System.out.println("Null command, Do nothing!");		
	}

}
