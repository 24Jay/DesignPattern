package behavior.observer.inf;

import behavior.observer.WeatherData;

public interface IStation
{
	public void register(IObserver observer, int i);
	public void publizeWeather(WeatherData data);	
}
