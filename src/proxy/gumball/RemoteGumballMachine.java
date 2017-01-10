package proxy.gumball;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import proxy.gumball.inf.IRemoteMachine;
import proxy.gumball.inf.IState;
import proxy.gumball.state.HasQuarter;
import proxy.gumball.state.NoQuarter;
import proxy.gumball.state.Sold;
import proxy.gumball.state.Soldout;

public class RemoteGumballMachine extends UnicastRemoteObject implements IRemoteMachine
{

	private IState soldOut;
	private IState noQuarter;
	private IState hasQuarter;
	private IState sold;

	private IState state = soldOut;
	private int count = 0;
	private String location = "China, wuhan";
	
	@Override
	public int getCount() throws RemoteException
	{
		return count;
	}

	@Override
	public String getLocation() throws RemoteException
	{
		return location;
	}

	@Override
	public IState getState() throws RemoteException
	{
		return state;
	}
	
	
	
	public RemoteGumballMachine(int gumbleNumber, String location) throws RemoteException
	{
		// set gamble numbers
		this.count = gumbleNumber;
		this.location = location;
		
		soldOut = new Soldout(this);
		noQuarter = new NoQuarter(this);
		hasQuarter = new HasQuarter(this);
		sold = new Sold(this);
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

	public void releaseGamble()
	{
		System.out.println("Gamble is out!");
		count--;
	}


	
}
