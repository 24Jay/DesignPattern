package proxy.gumball.state;

import proxy.gumball.RemoteGumballMachine;
import proxy.gumball.inf.IState;

public class NoQuarter implements IState
{

	/**
	 * 这里最好要加上序列化ID,会抛出InvalidClassException
	 */
	private static final long serialVersionUID = 2383247520489250193L;
	
	private transient RemoteGumballMachine machine;

	public NoQuarter(RemoteGumballMachine mach)
	{
		this.machine = mach;
	}

	@Override
	public void insertQuarter()
	{
		System.out.println("You have insert a quarter!");
		machine.setState(machine.getHasQuarter());
	}

	@Override
	public void ejectQuarter()
	{
		System.out.println("No quarter, this operation is forbidden!");

	}

	@Override
	public void turnCrank()
	{
		System.out.println("No quarter, this operation is forbidden!");

	}

	@Override
	public void dispense()
	{
		System.out.println("No quarter, this operation is forbidden!");

	}

}
