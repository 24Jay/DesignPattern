package behavior.command.stereo;

import behavior.command.inf.ICommand;

public class StereoOnWithCDCommand implements ICommand
{
	Stereo stereo;
	
	public StereoOnWithCDCommand(Stereo st)
	{
		this.stereo = st;
	}
	
	@Override
	public void execute()
	{
		stereo.on();
		stereo.setCD();
		stereo.setVolume(24);
	}

}
