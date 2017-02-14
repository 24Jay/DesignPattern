package structure.proxy.gumball;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import structure.proxy.gumball.inf.IRemoteMachine;

public class GumballServer
{

	public static void main(String []args)
	{
		try
		{
			IRemoteMachine remote = new RemoteGumballMachine(5,"Beijing");
			Registry registry = LocateRegistry.createRegistry(8888);
			registry.rebind("RemoteGumballMachine", remote);
			System.out.println("Gumball Machine Monitor Service.");

		} catch (RemoteException e)
		{
			e.printStackTrace();
		}
	}
}
