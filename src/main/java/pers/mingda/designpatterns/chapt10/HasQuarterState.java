package pers.mingda.designpatterns.chapt10;

import java.util.Random;

public class HasQuarterState implements State {
    // First we add a random number
    // generator to generate the 
    // 10% chance of winning...
    Random randomWinner = new Random(System.currentTimeMillis());
    // In each implementation of State, we 
    // add the transient keyword to the 
    // GumballMachine instance variable. This  
    // tells the JVM not to serialize this field.
    // Note that this can be slightly dangerous
    // if you try to access this field once its
    // been serialized and transferred.
    transient GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public void turnCrank() {
        // ...then we determine if this customer won.
        System.out.println("You turned...");
        int winner = randomWinner.nextInt(10);
        if ((winner == 0) && (gumballMachine.getCount() > 1)) {
            // If they won, and there's enough gumballs left for 
            // them to get two, we go to the WinnerState;
            // otherwise, we go to the SoldState (just like we
            // always did).
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
        
    }

    public void dispense() {
        // Anohter inappropriate 
        // action for this state.
        System.out.println("No gumball dispensed");
    }
}