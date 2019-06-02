package pers.mingda.designpatterns.chapt10;

// Serializeable is in the java.io package.
import java.io.Serializable;

// Then we just extend the Serializable
// interface (which has no mehods in it).
// And now State in all the subclasses can 
// be transferred over the network.
public interface State extends Serializable {

    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
    default void refill(int gumballNumbers) {
        System.out.println("Cannot refill in the moment, take back your gumballs please!");
    }

}