package pers.mingda.designpatterns.chapt12;

// QuackCounter is a decorator
// Like with Adapter, we need to
// implement the target interface.
public class QuackCounter implements Quackable {
    // We've got an instance variable
    // to hold on to the quacker
    // we're decorating.
    Quackable duck;
    // And we're counting ALL
    // quacks, so we'll use a static
    // variable to keep track.
    static int numberOfQuacks;

    // We get the reference to the
    // Quackable we're decorating in 
    // the constructor.
    public QuackCounter (Quackable duck) {
        this.duck = duck;
    }

    public void quack() {
        // When quack() is called, we delegate the call to
        // the Quackable we're decorating...
        duck.quack();
        // ... then we increase the number of quacks.
        numberOfQuacks++;
    }

    public static int getQuack() {
        // We're adding one other method
        // to the decorator. This static
        // method just returns the number
        // of quacks that have occurred
        // in all Quackables.
        return numberOfQuacks;
    }
}