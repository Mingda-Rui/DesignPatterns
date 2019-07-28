package pers.mingda.designpatterns.chapt12;

import pers.mingda.designpatterns.chapt12.duckfactory.AbstractDuckFactory;
import pers.mingda.designpatterns.chapt12.duckfactory.CountingDuckFactory;
import pers.mingda.designpatterns.chapt12.duck.Quackable;
import pers.mingda.designpatterns.chapt12.duck.Goose;
import pers.mingda.designpatterns.chapt12.duck.GooseAdapter;
import pers.mingda.designpatterns.chapt12.duck.QuackCounter;

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

    // The simulate() method takes an AbstractDuckFactory 
    // and uses it to create ducks rather than instantiating
    // them directly.
    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        // Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable gooseDuck = duckFactory.createGooseDuck();

        System.out.println("\nDuck Simulator: With Abstract Factory");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    // Here we overload the simulate
    // method to simulate just one duck.
    void simulate(Quackable duck) {
        // Here we let polymorphism do its magic: no
        // matter what kind of Quackable gets passed in,
        // the simulate() method asks it to quack.
        duck.quack();
    }
}