package behavior.command.stereo;

import behavior.command.inf.ICommand;

public class StereoOffCommand implements ICommand
{
	Stereo stereo;
	
	public StereoOffCommand(Stereo st)
	{
		this.stereo = st;
	}
	@Override
	public void execute()
	{
		stereo.off();
	}

}
