package pers.mingda.designpatterns.chapt12;

import pers.mingda.designpatterns.chapt12.duckfactory.AbstractDuckFactory;
import pers.mingda.designpatterns.chapt12.duckfactory.CountingDuckFactory;
import pers.mingda.designpatterns.chapt12.duck.Quackable;
import pers.mingda.designpatterns.chapt12.duck.QuackCounter;
import pers.mingda.designpatterns.chapt12.duck.Flock;

// Here's our main method to
// get everything going.
public class DuckSimulator {
    public static void main (String[] args) {
        // We create a simulator and then 
        // call its simulate() method.
        DuckSimulator simulator = new DuckSimulator();
        // First we create the factory that we're going
        // to pass into the simulate() method.
        AbstractDuckFactory duckFactory = new CountingDuckFactory();

        simulator.simulate(duckFactory);
    }

    // Create all the Quackables, just like before.
    void simulate(AbstractDuckFactory duckFactory) {
        // Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        // Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable gooseDuck = duckFactory.createGooseDuck();
        System.out.println("\nDuck Simulator: With Composite - Flocks");

        // First we create a Flock, and 
        // load it up with Quackables.
        Flock flockOfDucks = new Flock();

        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        // Then we create a new 
        // Flock of Mallards
        Flock flockOfMallards = new Flock();

        // Here we're creating a 
        // little family of mallards...
        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();

        // ..and adding them to the
        // Flock of mallards.
        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        // Then we add the Flock of 
        // mallards to the main flock.
        flockOfDucks.add(flockOfMallards);
        System.out.println("\nDuck Simulator: Whole Flock Simulation");
        // Let's test out the entire Flock!
        simulate(flockOfDucks);

        System.out.println("\nDuck Simulator: Mallard Flock Simulation");
        // Then let's just test out the mallard's Flock.
        simulate(flockOfMallards);

        // Finally, let's give the Quackologist the data.
        System.out.println("\nThe ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    void simulate(Quackable duck) {
        // Nothing needs to change here, a Flock is a Quackable!
        duck.quack();
    }
}