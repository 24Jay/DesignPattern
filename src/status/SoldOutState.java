package status;

import status.inf.IState;

public class SoldOutState implements IState
{
	GambleMachine machine;
	
	public SoldOutState(GambleMachine machine)
	{
		this.machine = machine;
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
