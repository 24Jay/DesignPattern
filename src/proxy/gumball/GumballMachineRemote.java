package proxy.gumball;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import proxy.gumball.inf.IMonitor;
import status.GambleMachine;

public class GumballMachineRemote extends UnicastRemoteObject implements IMonitor
{
	List<GambleMachine> list;
	private static int count = 0;

	public GumballMachineRemote(List<GambleMachine> li) throws RemoteException
	{
		this.list = li;
	}

	// public GumballMachineRemote() throws RemoteException
	// {
	//
	// }

	public GumballMachineRemote() throws RemoteException
	{
		count++;
		list = new ArrayList<GambleMachine>();
		for (int i = 0; i < 3; i++)
		{
			GambleMachine machine = new GambleMachine(5);
			machine.insertQuarter();
			list.add(machine);
		}
	}

	@Override
	public String getState() throws RemoteException
	{
		StringBuilder builder = new StringBuilder("");

		for (GambleMachine ma : list)
		{

			builder.append("Count : " + count+",  Gumballs : "+ ma.getCount() + ", State : " + ma.getState() + "\n");
		}
		System.out.println("GGGGGGGGGGgg");
		return builder.toString() + count;
	}

	public static void main(String[] args)
	{
		try
		{
			IMonitor remote = new GumballMachineRemote();
			
			remote = new GumballMachineRemote();
			Registry registry = LocateRegistry.createRegistry(8888);
			registry.rebind("RemoteGumballMachine", remote);
			System.out.println("Gumball Machine Monitor Service.");

		} catch (RemoteException e)
		{
			e.printStackTrace();
		}
	}

}
