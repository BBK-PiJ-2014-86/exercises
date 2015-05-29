package day22;

import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * client -server architecture
 * Create the interface
 * it extends the interface Remote and all methods throw RemoteException (?)
 * Implement the interface in a class - extends UniCast.. class
 * Launch the server - Security manager (new RMISecurityManager())
 * We generate a server object that is to be binded to a registry naming.rebind(String, Remote)
 * 
 */

public interface EchoService extends Remote{
	
	/**
	 * The method returns the same string that was passed as an argument
	 * @param s
	 * @return returns the same string that was passed as an argument
	 */

	public String echo (String s) throws RemoteException;
	
}
