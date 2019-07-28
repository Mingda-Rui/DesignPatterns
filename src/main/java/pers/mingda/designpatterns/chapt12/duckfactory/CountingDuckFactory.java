package pers.mingda.designpatterns.chapt12;

// CountingDuckFactory also extends the abstract factory.
public class CountingDuckFactory extends AbstractDuckFactory {
    
    // Each method wraps the Quackable with the quack
    // counting decorator. The simulator will never know 
    // the difference; it just gets back a Quackable.
    // But now our rangers can be sure that all quacks are
    // being counted.

    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}