package pers.mingda.designpatterns.chapt10;

public class WinnerState implements State {
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("Cann't insert quarter in winnerstate, ejecting the quarter");
    }

    public void ejectQuarter() {
        System.out.println("Sorry, you've already turned the crank");
    }

    public void turnCrank() {
        System.out.println("Shouldn't turn crank twice");
    }
    
    public void dispense() {
        // Here we release two gumballs and then   
        // either go to the NoQuarterState or the   
        // SoldOutState
        System.out.println("YOU'RE A WINNER! You get two gumballs for your quarter");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            // As long as we have a second
            // gumball we release it.
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("Oops, out of gumballs!");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}