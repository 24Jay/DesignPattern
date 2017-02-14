package structure.proxy.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IRemote extends Remote
{
	/**
	 * 远程方法的变量和返回值都必须属于原语类型或者可序列化Serializable的。
	 * 因为远程方法的变量必须被打包通过网络运送，这要靠序列化来完成。
	 * 如果你传送原语类型，字符串，许多API内定的类型（数组和集合），都可以。
	 * 如果传送自己定义的类，必须保证实现了Serializable接口
	 * @return
	 * @throws RemoteException
	 */
	
	public String sayHello() throws RemoteException;
}
