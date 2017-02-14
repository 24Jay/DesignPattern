package structure.proxy;

import structure.proxy.gumball.GumballClient;
import structure.proxy.gumball.GumballServer;

public class TestRemoteGumball
{
	public static void main(String []args)
	{
		GumballServer.main(null);
		GumballClient.main(null);
	}
}
