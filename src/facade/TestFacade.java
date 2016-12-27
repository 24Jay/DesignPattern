package facade;
import facade.util.Amplifier;
import facade.util.DvdPlayer;
import facade.util.PopcornPopper;
import facade.util.Projector;
import facade.util.Screen;
import facade.util.TheaterLight;
import facade.util.Tuner;

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
