package proxy;

import proxy.gumball.GumballClient;
import proxy.gumball.GumballServer;

public class TestRemoteGumball
{
	public static void main(String []args)
	{
		GumballServer.main(null);
		GumballClient.main(null);
	}
}
