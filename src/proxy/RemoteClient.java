package proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import proxy.inf.IRemote;

public class RemoteClient
{
	public static void go()
	{
		try
		{
			IRemote remote = (IRemote) Naming.lookup("rmi://127.0.0.1:8888/RemoteHello");
			System.out.println("Go = " + remote.sayHello());
		} catch (RemoteException | NotBoundException | MalformedURLException e)
		{
			e.printStackTrace();
		}
	}

	public static void goon()
	{
		try
		{
			Registry registry = LocateRegistry.getRegistry(8888);
			IRemote remote = (IRemote) registry.lookup("RemoteHello");
			System.out.println("Go on = " + remote.sayHello());
		} catch (RemoteException | NotBoundException e)
		{
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args)
	{
		go();
		goon();
	}
}