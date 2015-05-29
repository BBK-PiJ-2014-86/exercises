package day22;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServerLauncher {

	
	public static void main (String []s) {
		
		if (System.getSecurityManager()==null) {
			System.setSecurityManager(new RMISecurityManager());
		}
		
		try {
			
			Registry reg = LocateRegistry.createRegistry(50111);
			
			Server server = new Server(); 
			
			String host = "//127.0.0.1/50111";
			String service = "echo1";
			reg.rebind(host+service, server);
		
			
			System.out.println("Binding complete");
			
		}catch (RemoteException e) {
		
			e.printStackTrace();
		}
	}
}
