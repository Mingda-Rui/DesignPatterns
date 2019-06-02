package pers.mingda.designpatterns.chapt11.gumball;

// We need to import the RMI package because we are
// using the RemoteException class below...
import java.rmi.RemoteException;

public class GumballMonitor {
    // Now we're going to rely on the remote
    // interface rather than the concrete
    // GumballMachine class.
    GumballMachineRemote machine;

    // The monitor takes the machine in its
    // constructor and assigns it to the 
    // machine instance variable.
    public GumballMonitor(GumballMachineRemote machine) {
        this.machine = machine;
    }

    // Our report method just prints a report with 
    // location, inventory and the machine's state.
    public void report() {
        try {
            System.out.println("Gumball Machine: " + machine.getLocation());
            System.out.println("Current inventory: " + machine.getCount() + " gumballs");
            System.out.println("Current state: " + machine.getState());
        } catch (RemoteException e) {
            // We also need to catch any remote exceptions
            // that might happen as we try to invoke methods
            // that are ultimately happening over the network.
            e.printStackTrace();
        }
        
    }
}
