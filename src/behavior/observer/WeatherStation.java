package behavior.observer;

import behavior.observer.inf.IObserver;
import behavior.observer.inf.IStation;

/***
 * 观察者模式定义了对象之间的一对多依赖，当一个对象改变状态时，它的所有的依赖者都会收到通知并且自动更新
 * 
 * @author jay
 *
 */

public class WeatherStation implements IStation
{
	IObserver[] observers;

	public WeatherStation()
	{
		observers = new IObserver[2];
	}

	/**
	 * 想要得到天气预报的人需要在气象中心注册
	 * 
	 * @param observer
	 * @param i
	 */
	@Override
	public void register(IObserver observer, int i)
	{
		observers[i] = observer;
	}

	/**
	 * 气象中心发布天气情况，每个注册过的观察者都会得到通知
	 * 
	 * @param data
	 */
	public void publizeWeather(WeatherData data)
	{
		for (int i = 0; i < observers.length; i++)
			observers[i].updateData(data);
	}
}
