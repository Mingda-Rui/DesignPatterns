package pers.mingda.designpatterns.chapt10;

public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    // Here are all the inappropriate
    // actions for this state.
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
    }

    // And here's where the real work begins...
    public void dispense() {
        // We're in the SoldState, which
        // means the customer paid. So,
        // we first need to ask the
        // machine to release a gumball.
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            // Then we ask the machine what
            // the gumball count is, and either
            // transition to the NoQuarterState
            // or the SoldOutState.
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Oops, out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}