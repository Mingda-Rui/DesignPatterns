package pers.mingda.designpatterns.chapt10;

public class SoldOutState implements State {
    transient GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("No Gumball Left, Ejecting the Quarter Automatically!");
    }

    public void ejectQuarter() {
        System.out.println("No Quarter in the Gumball Machine!");
    }

    public void turnCrank() {
        System.out.println("Nothing Happens!");
    }

    public void dispense() {
        System.out.println("Invoking diepense method in the SoldOutState, Manually Throw IllegalStateException!");
    }

    public void refill(int gumballNumbers) {
        int currentCount = gumballMachine.getCount();
        if (currentCount != 0) {
            System.out.println("Oops, there must be something wrong, SoldOutState should have no gumball left. But refilled the gumballs anyway");
        }
        gumballMachine.setCount(currentCount + gumballNumbers);
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
}