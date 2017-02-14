package structure.facade;

import structure.facade.util.Amplifier;
import structure.facade.util.DvdPlayer;
import structure.facade.util.PopcornPopper;
import structure.facade.util.Projector;
import structure.facade.util.Screen;
import structure.facade.util.TheaterLight;
import structure.facade.util.Tuner;

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
