package pers.mingda.designpatterns.chapt12;

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
        Quackable gooseDuck = new GooseAdapter(new Goose());

    }

    void simulate() {
        // Each time we create a 
        // Quackable, we wrap it
        // with a new decorator.
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        // The park ranger told us he didn't 
        // want to count geese honks, so we 
        // don't decorate it.
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator");

        // ... then we simulate each one.
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        // Once the Goose is wrapped, we can treat
        // it just like other duck Quackables.
        simulate(gooseDuck);

        // Here's where we gather the quacking behavior for the Quackologists.
        System.out.println("The ducks quacked " + QuackCounter.getQuack() + " times");
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