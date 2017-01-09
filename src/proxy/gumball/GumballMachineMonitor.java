package proxy.gumball;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import proxy.gumball.inf.IMonitor;

public class GumballMachineMonitor
{

	public static void main(String[] args)
	{
		
		try
		{
			System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
			IMonitor remote = (IMonitor) Naming.lookup("rmi://127.0.0.1:8888"
					+ "/RemoteGumballMachine");
			System.out.println(remote.getState());
		} catch (RemoteException | NotBoundException | MalformedURLException e)
		{
			e.printStackTrace();
		}
	}

}
