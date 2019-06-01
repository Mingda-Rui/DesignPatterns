package pers.mingda.designpatterns.chapt10;

public interface State {

    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
    default void refill(int gumballNumbers) {
        System.out.println("Cannot refill in the moment, take back your gumballs please!");
    }

}