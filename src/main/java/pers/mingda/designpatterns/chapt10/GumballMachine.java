package pers.mingda.designpatterns.chapt10;

public class GumballMachine {

    // Here are the four states; they match the
    // states in Mighty Gumball's state diagram.
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    // Here's the instance variable that is going to
    // keep track of the current state we're in.
    // We start in the SOLD_OUT state.
    int state = SOLD_OUT;
    
    // We have a second instance variable that 
    // keeps track of the number of gumballs in 
    // the machine.
    int count = 0;

    // The constructor takes an initial
    // inventory of gumballs. If the inventory
    // isn't zero, the machine enters state
    // NO_QUARTER, meaning it is waiting for 
    // someone to insert a quarter, otherwise it 
    // stays in the SOLD_OUT state.
    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    // Now we start implementing 
    // the actions as methods...
    public void insertQuarter() {
        // When a quarter is inserted, if...
        if (state == HAS_QUARTER) {
            // a quarter is already inserted 
            // we tell the customer;
            System.out.println("You can't insert another quarter");
        } else if (state == NO_QUARTER) {
            // otherwise we accept the 
            // quarter and transition to the
            // HAS_QUARTER state.
            state = HAS_QUARTER;
            System.out.println("You inserted a quarter");
        } else if (state == SOLD_OUT) {
            // and if the machine is sold
            // out, we reject the quarter.
            System.out.println("You can't insert a quarter, the machine is sold out");
        } else if (state == SOLD) {
            // If the customer just bought a  
            // gumball he needs to wait until the
            // transaction is complete before
            // inserting another quarter.
            System.out.println("Please wait, we're already giving you a gumball");
        }
    }

    // Now, if the customer tries to remove the quarter...
    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            // If there is a quarter, we 
            // return it and go back to
            // the NO_QUARTER state.
            System.out.println("Quarter returned");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            // Otherwise, if there isn't 
            // one we can't give it back.
            System.out.println("You haven't inserted a quarter");
        } else if (state == SOLD) {
            // If the customer just 
            // turned the crank, we can't 
            // give a refund; he already
            // has the gumball!
            System.out.println("Sorry, you already turned the crank");
        } else if (state == SOLD_OUT) {
            // You can't eject if the machine is sold
            // ou, it doesn't accept quarters!
            System.out.println("You can't eject, you haven't inserted a quarter yet");
        }

    }

    // The customer tries to turn the crank...
    public void turnCrank() {
        if (state == SOLD) {
            // Someone's trying to cheat the machine.
            System.out.println("Turning twice doesn't get you another gumball!");
        } else if (state == NO_QUARTER) {
            // We need a quarter first.
            System.out.println("You turned but there's no quarter");
        } else if (state == SOLD_OUT) {
            // We can't deliver gumballs;
            // there are none.
            System.out.println("You turned, but there are no gumballs");
        } else if (state == HAS_QUARTER) {
            // Success! They get a gumball. Change
            // the state to SOLD and call the
            // machine's dispense() method.
            System.out.println("You turned...");
        }
    }

    // Called to dispense a gumball.
    public void dispense() {
        if (state == SOLD) {
            // We're in the SOLD state; give'em a gumball!
            System.out.println("A gumball comes rolling out the slot");
            count = count - 1;
            if (count == 0) {
                // Here's where we handle the 
                // "out of gumballs" condition:
                // If this was the last one, we 
                // set the machine's states to
                // SOLD_OUT; otherwise, we're 
                // back to not having a quarter.
                System.out.println("Oops, out of gumballs!");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        // None of there should 
        // ever happen, but if 
        // they do, we give'em 
        // an error, not a gumball.
        } else if (state == NO_QUARTER) {
            System.out.println("You need to pay first");
        } else if (state == SOLD_OUT) {
            System.out.println("No gumball dispensed");
        } else if (state == HAS_QUARTER) {
            System.out.println("No gumball dispensed");
        }
    }
}