package proxy.gumball.inf;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface IRemoteMachine extends Remote
{
	public int getCount() throws RemoteException;
	
	public String getLocation() throws RemoteException;
	
	public IState getState() throws RemoteException;
}
