package observer;

import observer.inf.IObserver;

public class CCTVObserver implements IObserver
{
	@Override
	public void updateData(WeatherData weather)
	{
		recordWeatherData(weather);
	}

	private void recordWeatherData(WeatherData we)
	{
		System.out.println("CCTV : The National Weather Center publize the weather report for future 24hours!");
		System.out.println("CCTV : Centigrade = "+we.getCentigrade()+", Weather = "+we.getWeather());
	}
}
