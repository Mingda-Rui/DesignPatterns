package pers.mingda.designpatterns.chapt12.observer;

// We need to implement the Observable interface or else
// we won't be able to register with a QuackObservable.
public class Quackologist implements Observer {

    public void update(QuackObservable duck) {
        // The Quackologist is simple; it just has one
        // method, update(), which prints out the
        // Quackable that just quacked.
        System.out.println("Quackologist: " + duck + " just quacked.");
    }
}
