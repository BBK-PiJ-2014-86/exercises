package day22;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;


public class Server extends UnicastRemoteObject implements EchoService{


	public Server() throws RemoteException {
	}

	public String echo(String s) throws RemoteException {

		System.out.println("Replying to client "+s);
		return s;
	}



	
	
}
