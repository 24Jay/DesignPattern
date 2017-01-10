package proxy.rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;


public class RemoteImpl  extends UnicastRemoteObject implements IRemote
{

	protected RemoteImpl() throws RemoteException
	{
	}

	/**
	 * 
	 */

	@Override
	public String sayHello() throws RemoteException
	{
		return "Server says : 'Hey!'";
	}

	public static void main(String[] args)
	{
		try
		{
			IRemote remote = new RemoteImpl();
			// Naming.bind("RemoteHello", remote);
//			IRemote stub = (IRxemote) UnicastRemoteObject.exportObject(remote, 0);
			Registry registry = LocateRegistry.createRegistry(8888);
			registry.rebind("RemoteHello", remote);
			System.out.println("Create Server Service.");

		} catch (RemoteException e)
		{
			e.printStackTrace();
		}

	}

}
