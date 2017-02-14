package structure.proxy.gumball;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import structure.proxy.gumball.inf.IRemoteMachine;

public class GumballClient
{

	public static void main(String []args)
	{

		try
		{
			System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
			IRemoteMachine remote = (IRemoteMachine) Naming.lookup("rmi://127.0.0.1:8888"
					+ "/RemoteGumballMachine");
			System.out.println("Location = "+remote.getLocation());
			System.out.println("Count = "+remote.getCount());
			System.out.println("State = "+remote.getState());
		} catch (RemoteException | NotBoundException | MalformedURLException e)
		{
			e.printStackTrace();
		}
	}
}
