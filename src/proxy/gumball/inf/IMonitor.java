package proxy.gumball.inf;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IMonitor extends Remote
{
	public String getState() throws RemoteException;
}
