package pers.mingda.designpatterns.chapt11.rmi;

// RemoteException and Remote
// interface are in java.rmi.package.
import java.rmi.*;

// Your interface MUST extend java.rmi.Remote
public interface MyRemote extends Remote {

    // All of your remote methods must 
    // declare a RemoteException.
    public String sayHello() throws RemoteException;
}