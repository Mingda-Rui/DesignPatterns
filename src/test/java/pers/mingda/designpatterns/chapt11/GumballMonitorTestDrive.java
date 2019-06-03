package pers.mingda.designpatterns.chapt11;

import java.rmi.Naming;
import pers.mingda.designpatterns.chapt11.gumball.GumballMonitor;
import pers.mingda.designpatterns.chapt11.gumball.GumballMachineRemote;

public class GumballMonitorTestDrive {

    public static void main(String[] args) {
        // Here's all the locations we're gooing to monitor.
        // We create an array of locaitons, 
        // one for each machine.
        String[] location = {"rmi://santafe.mightgumball.com/gumballmachine",
                            "rmi://boulder.mightgumball.com/gumballmachine",
                            "rmi://seattle.mightgumball.com/gumballmachine"};

        // We also create an array of monitors.
        GumballMonitor[] monitor = new GumballMonitor[location.length];

        for (int i = 0; i < location.length; i++) {
            // Now we need to get a proxy
            // to each remote machine.
            try {
                GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]);
                monitor[i] = new GumballMonitor(machine);
                System.out.println(monitor[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // Then we iterate through each
        // machine and print out its report.
        for (int i = 0; i < monitor.length; i++) {
            monitor[i].report();
        }
    }
}