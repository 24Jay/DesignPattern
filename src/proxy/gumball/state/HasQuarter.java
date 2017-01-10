package proxy.gumball.state;

import proxy.gumball.RemoteGumballMachine;
import proxy.gumball.inf.IState;

public class HasQuarter implements IState
{
	/**
	 * 这里最好要加上序列化ID,会抛出InvalidClassException
	 * http://stackoverflow.com/questions/7173352/java-io-invalidclassexception
	 */
	private static final long serialVersionUID = -5603828484611027247L;
	private transient RemoteGumballMachine machine;

	public HasQuarter(RemoteGumballMachine machine)
	{
		this.machine = machine;
	}

	@Override
	public void insertQuarter()
	{
		System.out.println("You have insert a quarter, please don't insert another quarter!");
	}

	@Override
	public void ejectQuarter()
	{
		System.out.println("You choose to stop the business, your quarter returned .");
		machine.setState(machine.getNoQuarter());
	}

	@Override
	public void turnCrank()
	{
		System.out.println("You turned the crank, gambles is prepared....");
		machine.setState(machine.getSold());
	}

	@Override
	public void dispense()
	{
		System.out.println("No gamble dispensed at this state.");
	}

}
