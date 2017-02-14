package behavior.command.stereo;

public class Stereo
{
	private int volume = 0;

	public void on()
	{
		System.out.println("Stereo on!");
	}

	public void off()
	{
		System.out.println("Stereo off!");
	}

	public void setCD()
	{
		System.out.println("Set CD on Stereo!");
	}

	public void setVolume(int i)
	{
		this.volume = i;
		System.out.println("Set volume of this stereo to : " + i);
	}
	
	public int getVolume()
	{
		return volume;
	}
	
}
