package pers.mingda.designpatterns.chapt11;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        int count = 0;

        // Pass in a locaiton and initial # of 
        // gumballs on the command line.
        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        // Don't forget to give
        // the constructor a 
        // location and count...
        count = Integer.parseInt(args[1]);
        GumballMachine gumballMachine = new GumballMachine(args[0], count);

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