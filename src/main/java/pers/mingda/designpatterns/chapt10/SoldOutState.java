package pers.mingda.designpatterns.chapt10;

public class SoldOutState implements State {
    GumballMachine gumballMachine;

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
}