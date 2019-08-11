package pers.mingda.designpatterns.chapt12.observer;

// QuackObervable is the interface
// that Quackables should implement
// if they want to be ovserved.
public interface QuackObservable {
    // It has a method for registering 
    // Observers. Any object implementing 
    // the Obaserver interface can listen
    // to quacks. We'll define the Observer
    // interface in a sec.
    public void registerObserver(Observer observer);

    // It also has a method for 
    // notifying the observers.
    public void notifyObservers();
}