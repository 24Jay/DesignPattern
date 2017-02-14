package behavior.status;

import behavior.status.inf.IState;

public class SoldState implements IState
{

	GambleMachine machine;

	public SoldState(GambleMachine mach)
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

		if (machine.getCount() > 0)
			machine.setState(machine.getNoQuarter());
		else
			machine.setState(machine.getSoldOut());
	}

}
