package observer;

import observer.inf.IObserver;

public class TestObserver
{
	public static void main(String[] args)
	{
		WeatherStation station = new WeatherStation();
		IObserver mum = new MumObserver();
		IObserver cctv = new CCTVObserver();

		station.registerReport(mum, 0);
		station.registerReport(cctv, 1);

		System.out.println("##################################");
		WeatherData data = new WeatherData("Rainning", 12);
		station.publizeWeather(data);

		System.out.println("##################################");
		station.publizeWeather(new WeatherData());

		System.out.println("##################################");
		station.publizeWeather(new WeatherData("Snow", 0));
	}
}
/**
 * output: ################################## Mum says : Hey, it is going to
 * rain, take care of your self! CCTV : The National Weather Center publize the
 * weather report for future 24hours! CCTV : Centigrade = 12, Weather = Rainning
 * ################################## Mum says : Hey, I can do some washing
 * tomorrow! CCTV : The National Weather Center publize the weather report for
 * future 24hours! CCTV : Centigrade = 20, Weather = Sunshine
 * ################################## Mum says : Hey, take warm clothes! CCTV :
 * The National Weather Center publize the weather report for future 24hours!
 * CCTV : Centigrade = 0, Weather = Snow
 *
 */