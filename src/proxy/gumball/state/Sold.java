package proxy.gumball.state;

import java.rmi.RemoteException;

import proxy.gumball.RemoteGumballMachine;
import proxy.gumball.inf.IState;

public class Sold implements IState
{
	/**
	 * 这里最好要加上序列化ID,会抛出InvalidClassException
	 * http://stackoverflow.com/questions/7173352/java-io-invalidclassexception
	 */
	private static final long serialVersionUID = -5344062050925412014L;

	private transient RemoteGumballMachine machine;

	public Sold(RemoteGumballMachine mach)
	{
		this.machine = mach;
	}

	@Override
	public void insertQuarter()
	{
		System.out.println("Machine working, please don't insert a quarter at this state.");
	}

	@Override
	public void ejectQuarter()
	{
		System.out.println("Sorry, You have already turn crank, quarter can not be returned.");
	}

	@Override
	public void turnCrank()
	{
		System.out.println("Turn crank twice doesn't make you two gambles");
	}

	@Override
	public void dispense()
	{
		machine.releaseGamble();

		try
		{
			if (machine.getCount() > 0)
				machine.setState(machine.getNoQuarter());
			else
				machine.setState(machine.getSoldOut());
		} catch (RemoteException e)
		{
			e.printStackTrace();
		}
	}

}
