package behavior.status;

import behavior.status.inf.IState;

public class NoQuarterState implements IState
{
	GambleMachine machine;

	public NoQuarterState(GambleMachine mach)
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
