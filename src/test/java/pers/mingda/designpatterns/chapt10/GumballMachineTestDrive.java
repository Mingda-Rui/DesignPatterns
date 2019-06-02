package pers.mingda.designpatterns.chapt10;

import java.rmi.RemoteException;

public class GumballMachineTestDrive {
    public static void main(String[] args) throws RemoteException {
        // Load it up with
        // five gumballs total.
        GumballMachine gumballMachine = new GumballMachine(5);

        // Print out the state of the machine.
        System.out.println(gumballMachine);

        // Throw a quarter in...
        gumballMachine.insertQuarter();
        // Turn the crank; we should get our gumball.
        gumballMachine.turnCrank();

        // Print out the state of the machine, again.
        System.out.println(gumballMachine);

        // Throw a quarter in...
        gumballMachine.insertQuarter();
        // Ask for it back.
        gumballMachine.ejectQuarter();
        // Turn the crank; we shouldn't get our gumball.
        gumballMachine.turnCrank();

        // Print out the state of the machine, again.
        System.out.println(gumballMachine);

        // Throw a quarter in...
        gumballMachine.insertQuarter();
        // Turn the crank; we should get our gumball
        gumballMachine.turnCrank();
        // Throw a quarter in...
        gumballMachine.insertQuarter();
        // Turn the crank; we should get our gumball
        gumballMachine.turnCrank();
        // Ask for a quarter back we didn't put in
        gumballMachine.ejectQuarter();

        // Print out the state of the machine, again.
        System.out.println(gumballMachine);

        // Throw TWO quarters in...
        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        // Turn the crank; we should get our gumball.
        gumballMachine.turnCrank();
        // Now for the stress testing...
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        // Print that machine state one more time.
        System.out.println(gumballMachine);
    }
}