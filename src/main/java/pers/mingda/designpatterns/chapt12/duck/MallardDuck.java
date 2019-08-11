package pers.mingda.designpatterns.chapt12.duck;

import pers.mingda.designpatterns.chapt12.observer.Observable;
import pers.mingda.designpatterns.chapt12.observer.Observer;

// Your standard Mallard duck.
public class MallardDuck implements Quackable {
    // Each Quackable has an
    // Observable instance variable.
    Observable observable;

    // In the constructor, we create an
    // Observable and pass it a reference
    // to the MallardDuck object.
    public MallardDuck() {
        observable = new Observable(this);
    }

    public void quack() {
        System.out.println("Quack");
        // When we quack, we need to let the
        // observers know about it.
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }
}