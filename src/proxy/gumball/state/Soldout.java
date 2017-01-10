package proxy.gumball.state;

import proxy.gumball.RemoteGumballMachine;
import proxy.gumball.inf.IState;

public class Soldout implements IState
{
	/**
	 * 这里最好要加上序列化ID,会抛出InvalidClassException
	 * http://stackoverflow.com/questions/7173352/java-io-invalidclassexception
	 */
	private static final long serialVersionUID = -3433903771213257645L;
	
	private transient RemoteGumballMachine machine;
	
	public Soldout(RemoteGumballMachine mach)
	{
		this.machine = mach;
	}
	@Override
	public void insertQuarter()
	{
		System.out.println("It is a pity! Please don't insert a dollar! No gambles at this time.");
	}

	@Override
	public void ejectQuarter()
	{
		System.out.println("Do, Eject the quarter!");
	}

	@Override
	public void turnCrank()
	{
		System.out.println("No Quarter state, this operation is forbidden!");
	}

	@Override
	public void dispense()
	{
		System.out.println("No Quarter state, this operation is forbidden!");		
	}

}
