package pers.mingda.designpatterns.chapt10;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

// GumballMachine is going to subclass the UnicastRemoteObject;
// this gives it the ability to act as a remote service.
public class GumballMachine extends UnicastRemoteObject{

    // Here are all the States again...
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    // All you need to add here is the
    // new WinnerState and initialize 
    // it in the constructor.
    State winnerState;

    // ... and the State instance variable.
    State state = soldOutState;
        
    // The count instance variable holds
    // the count of gumballs - initially the
    // machine is empty.
    int count = 0;

    // our constructor takes the    
    // inital number of gumballs and 
    // store it in an instance variable.
    public GumballMachine(int numberGumballs) throws RemoteException {
        // It also creates the State
        // instances, one of each.
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = numberGumballs;
        if (numberGumballs > 0) {
            // If there are more than 0 
            // gumballs we set the state to the 
            // NoQuarterState.
            state = noQuarterState;
        } // else soldOutState
    }

    // Now for the actions. There are 
    // VERY EASY to implement now. We 
    // just delegate to the current state.
    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    // Note that we don't need an
    // action method for dispense() in
    // GumballMachine becase it's just an
    // internal action; a user can't ask the
    // machine to dispense directly. But we 
    // do call dispense() on the State object 
    // from the turnCrank() method.
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void refill(int gumballNumbers) {
        state.refill(gumballNumbers);
    }

    // This method allows other objects (like
    // our State objects) to transition the 
    // machine to a different state.
    void setState(State state) {
        this.state = state;
    }

    // The machine supports a releaseBall()
    // helper method that releases the ball and 
    // decrements the count instance variable.
    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }
    
    // More methods here including getters for each State...
    // This includes methods like getNoQuarterState() for getting each
    // state object, and getCount() for getting the gumball count.
    State getNoQuarterState() {
        return noQuarterState;
    }

    State getSoldOutState() {
        return soldOutState;
    }

    State getHasQuarterState() {
        return hasQuarterState;
    }

    State getSoldState() {
        return soldState;
    }

    State getWinnerState() {
        return winnerState;
    }

    int getCount() {
        return count;
    }

    void setCount(int gumballNumbers) {
        this.count = gumballNumbers;
    }
}