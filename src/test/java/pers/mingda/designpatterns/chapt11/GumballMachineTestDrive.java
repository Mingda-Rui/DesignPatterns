package pers.mingda.designpatterns.chapt11;

import java.rmi.Naming;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine = null;
        int count = 0;

        // Pass in a locaiton and initial # of 
        // gumballs on the command line.
        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        // First we need to add a try/catch block
        // around the gumball instantiation because our
        // constructor can now throw exceptions.
        try {
            count = Integer.parseInt(args[1]);
            gumballMachine = new GumballMachine(args[0], count);
            // We also add the call to Naming.rebind,
            // which publishes the GumballMachine stub
            // under the name gumballmachine.
            Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachine);
        } catch (Exception e) {

        }
        
        

        // ...and instantiate a monitor and pass it a  
        // machine to provide a report on.
        GumballMonitor monitor = new GumballMonitor(gumballMachine);

        // rest of test code here

        // When we need a report on    
        // the machine, we call the
        // report() method.
        monitor.report();
    }
}