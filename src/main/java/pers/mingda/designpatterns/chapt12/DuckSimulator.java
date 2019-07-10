package pers.mingda.designpatterns.chapt12;

// Here's our main method to
// get everything going.
public class DuckSimulator {
    public static void main (String[] args) {
        // We create a simulator and then 
        // call its simulate() method.
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    void simulate() {
        // We need some ducks, so
        // her ewe create one of 
        // each Quackable...
        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedheadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();
        // We make a Goose that acts like
        // a Duck by wrapping the Goose
        // in the GooseAdapter.
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