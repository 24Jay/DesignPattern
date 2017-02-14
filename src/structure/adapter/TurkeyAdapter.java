package structure.adapter;

import structure.adapter.inf.IDuck;
import structure.adapter.inf.ITurkey;

/**
 * 创建一个适配器，使得火鸡可以像鸭子那样叫，可以飞那么远！
 * @author jay
 *
 */
public class TurkeyAdapter implements IDuck
{
	ITurkey turkey;

	public TurkeyAdapter(ITurkey tk)
	{
		this.turkey = tk;
	}

	@Override
	public void quack()
	{
		turkey.gobble();
	}

	@Override
	public void fly()
	{
		for (int i = 0; i < 24; i++)
			turkey.fly();
	}

}
