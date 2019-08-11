package pers.mingda.designpatterns.chapt12.observer;

import java.util.ArrayList;
import java.util.Iterator;

// Observable must implement QuackObservable
// because these are the same method calls
// that are going to be delegated to it.
public class Observable implements QuackObservable {
    ArrayList<Observer> observers = new ArrayList<>();
    QuackObservable duck;

    // In the constructor we get passed the QuackObservable
    // that is uing this object to manage its observable behavior.
    // Check out the notify() method below; you'll see that when a
    // notify occurs, Observable passes this object along so that the
    // oberver knows which object is quacking.
    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    // Here's the code for registering an observer.
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    // And the code for doing the noifications.

    public void notifyObservers() {
        Iterator<Observer> iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = (Observer) iterator.next();
            observer.update(duck);
        }
    }

}
