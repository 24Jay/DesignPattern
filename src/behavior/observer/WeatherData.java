package behavior.observer;

public class WeatherData
{
	private String weather;
	private int centigrade;

	public WeatherData()
	{
		this.weather = "Sunshine";
		this.centigrade = 20;
	}

	public WeatherData(String weather, int cent)
	{
		this.weather = weather;
		this.centigrade = cent;
	}

	public String getWeather()
	{
		return weather;
	}

	public void setWeather(String weather)
	{
		this.weather = weather;
	}

	public int getCentigrade()
	{
		return centigrade;
	}

	public void setCentigrade(int centigrade)
	{
		this.centigrade = centigrade;
	}

}
