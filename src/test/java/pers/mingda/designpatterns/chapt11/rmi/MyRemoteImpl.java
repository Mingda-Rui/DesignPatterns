package pers.mingda.designpatterns.chapt11.rmi;

import java.rmi.*;
// UnicastRemoteObject is in the
// java.rmi.server package.
import java.rmi.server.*;

// Extending UnicastRemoteObject is the
// easiest way to make a remote object.
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    
    // You have to implement all the
    // interface methods, of course. But
    // notice that you do NOT have to
    // declare the RemoteException.
    public String sayHello() {
        return "Server says, 'Hey'";
    }

    // Your superclass constructor (for
    // UnicastRemoteObject) declares an exception, so 
    // You must write a constructor, because it means
    // that your constructor is calling rishy code (its
    // super constructor).
    public MyRemoteImpl() throws RemoteException { }

    public static void main(String[] args) {

        try {
            // Make the remote object, then 'bind' it to the
            // rmiregistery using the static Naming.rebind(). The
            // name you register it under is the name clients will
            // use to look it up in the RMI registry.
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHello", service);
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}