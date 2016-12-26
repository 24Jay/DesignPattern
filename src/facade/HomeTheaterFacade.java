package facade;

import facade.util.Amplifier;
import facade.util.DvdPlayer;
import facade.util.PopcornPopper;
import facade.util.Projector;
import facade.util.Screen;
import facade.util.TheaterLight;
import facade.util.Tuner;

public class HomeTheaterFacade
{
	Amplifier amp;
	Tuner tuner;
	DvdPlayer dvdPlayer;
	Projector projector;
	TheaterLight theaterLight;
	Screen screen;
	PopcornPopper popper;

	public HomeTheaterFacade(Amplifier amp, Tuner tuner, DvdPlayer dvdPlayer, Projector projector,
			TheaterLight theaterLight, Screen screen, PopcornPopper popper)
	{
		this.amp = amp;
		this.tuner =tuner;
		this.dvdPlayer = dvdPlayer;
		this.projector = projector;
		this.theaterLight = theaterLight;
		this.screen = screen;
		this.popper = popper;
	}
	
	public void watchMovie()
	{
		System.out.println("Get ready to watch a movie...");
		amp.doSomething();
		tuner.doSomething();
		dvdPlayer.doSomething();
		projector.doSomething();
		screen.doSomething();
		popper.doSomething();
	}
	
	public void endMovie()
	{
		System.out.println("Put an end to a movie watching>>");
		amp.doSomething();
		tuner.doSomething();
		dvdPlayer.doSomething();
		projector.doSomething();
		screen.doSomething();
		popper.doSomething();
	}
	
}
