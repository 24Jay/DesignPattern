package observer;

import observer.inf.IObserver;

public class MumObserver implements IObserver
{
	WeatherData weather = new WeatherData();

	@Override
	public void updateData(WeatherData weather)
	{
		if (weather.getWeather() == "Rainning")
			System.out.println("Mum says : Hey, it is going to rain, take care of your self!");
		else if (weather.getWeather() == "Sunshine")
			System.out.println("Mum says : Hey, I can do some washing tomorrow!");
		else
			System.out.println("Mum says : Hey, take warm clothes!");
	}

}
