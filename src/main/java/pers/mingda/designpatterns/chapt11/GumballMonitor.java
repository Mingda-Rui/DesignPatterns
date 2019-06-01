package pers.mingda.designpatterns.chapt11;

public class GumballMonitor {
    GumballMachine machine;

    // The monitor takes the machine in its
    // constructor and assigns it to the 
    // machine instance variable.
    public GumballMonitor(GumballMachine machine) {
        this.machine = machine;
    }

    // Our report method just prints a report with 
    // location, inventory and the machine's state.
    public void report() {
        System.out.println("Gumball Machine: " + machine.getLocation());
        System.out.println("Current inventory: " + machine.getCount() + " gumballs");
        System.out.println("Current state: " + machine.getState());
    }
}
