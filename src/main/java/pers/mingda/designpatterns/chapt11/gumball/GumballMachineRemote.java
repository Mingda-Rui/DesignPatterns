package pers.mingda.designpatterns.chapt11.gumball;

// Don't forget to import java.rmi.*;
import java.rmi.Remote;
import java.rmi.RemoteException;
import pers.mingda.designpatterns.chapt10.State;

// This is the remote interface.
public interface GumballMachineRemote extends Remote {
    // All return types need 
    // to be primitive or
    // Serializable...
    public int getCount() throws RemoteException;
    public String getLocation() throws RemoteException;
    public State getState() throws RemoteException;
    // Here are the methods were going to support.
    // Each one throws RemoteException.
}