package pers.mingda.designpatterns.chapt11;

// Don't forget to import java.rmi.*;
import java.rmi.Remote;
import java.rmi.RemoteException;
import pers.mingda.designpatterns.chapt10.State;

// This is the remote interface.
public interface GumballMachineRemote extends Remote {
    public int getCount() throws RemoteException;
    public String getLocation() throws RemoteException;
    public State getStete() throws RemoteException;
}