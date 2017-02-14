package behavior.command.light;

import behavior.command.inf.ICommand;

public class LightOffCommand implements ICommand
{
	Light light;

	public LightOffCommand(Light light)
	{
		this.light = light;
	}

	@Override
	public void execute()
	{
		light.off();
	}

}
