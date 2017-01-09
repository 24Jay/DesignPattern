package status;

import status.inf.IState;

public class GambleMachine
{
	IState soldOut;
	IState noQuarter;
	IState hasQuarter;
	IState sold;

	IState state = soldOut;
	int count = 0;

	public GambleMachine(int gumbleNumber)
	{
		// set gamble numbers
		this.count = gumbleNumber;
		
		soldOut = new SoldOutState(this);
		noQuarter = new NoQuarterState(this);
		hasQuarter = new HasQuarterState(this);
		sold = new SoldState(this);
		if(count > 0)
			state = noQuarter;

	}

	public void insertQuarter()
	{
		state.insertQuarter();
	}
	
	public void ejectQuarter()
	{
		state.ejectQuarter();
	}
	
	public void turnCrank()
	{
		state.turnCrank();
	}
	
	public void dispense()
	{
		state.dispense();
	}
	
	public void setState(IState state)
	{
		this.state = state;
	}
	
	public IState getState()
	{
		return state;
	}

	public IState getSoldOut()
	{
		return soldOut;
	}

	public IState getNoQuarter()
	{
		return noQuarter;
	}

	public IState getHasQuarter()
	{
		return hasQuarter;
	}

	public IState getSold()
	{
		return sold;
	}

	public int getCount()
	{
		return count;
	}

	public void releaseGamble()
	{
		System.out.println("Gamble is out!");
		count--;
	}

}
