package behavior.command.light;

import behavior.command.inf.ICommand;

public class LightOnCommand implements ICommand
{
	Light light;
	
	public LightOnCommand(Light light)
	{
		this.light = light;
	}
	@Override
	public void execute()
	{
		light.on();
	}

}


