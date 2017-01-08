package status;

import status.inf.IState;

public class HasQuarterState implements IState
{
	GambleMachine machine;
	
	public HasQuarterState(GambleMachine machine)
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
