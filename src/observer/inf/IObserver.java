package observer.inf;

import observer.WeatherData;

public interface IObserver
{
	public void updateData(WeatherData weather);

}
