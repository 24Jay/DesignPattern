package structure.facade;

import structure.facade.util.Amplifier;
import structure.facade.util.DvdPlayer;
import structure.facade.util.PopcornPopper;
import structure.facade.util.Projector;
import structure.facade.util.Screen;
import structure.facade.util.TheaterLight;
import structure.facade.util.Tuner;

public class TestFacade
{

	public static void main(String[] args)
	{
		Amplifier amp = new Amplifier();
		Tuner tuner = new Tuner();
		DvdPlayer dvdPlayer = new DvdPlayer();
		Projector projector = new Projector();
		TheaterLight theaterLight = new TheaterLight();
		Screen screen = new Screen();
		PopcornPopper popper = new PopcornPopper();
	
		HomeTheaterFacade facade = new HomeTheaterFacade(amp, tuner, dvdPlayer, projector, theaterLight, screen,
				popper);
		facade.watchMovie();
		facade.endMovie(); 
	}
}
