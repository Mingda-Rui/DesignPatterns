package pers.mingda.designpatterns.chapt12.duckfactory;

import pers.mingda.designpatterns.chapt12.duck.Quackable;
import pers.mingda.designpatterns.chapt12.duck.MallardDuck;
import pers.mingda.designpatterns.chapt12.duck.RedheadDuck;
import pers.mingda.designpatterns.chapt12.duck.DuckCall;
import pers.mingda.designpatterns.chapt12.duck.RubberDuck;
import pers.mingda.designpatterns.chapt12.duck.GooseAdapter;

// DuckFactory extends the abstract factory.
public class DuckFactory extends AbstractDuckFactory {

    // Each method creates a product:
    // a particular kind of Quackable.
    // The actual product is unknown
    // to the simulator - it just knows
    // it's getting a Quackable.

    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    public Quackable createDuckCall() {
        return new DuckCall();
    }

    public Quackable createRubberDuck() {
        return new RubberDuck();
    }

    public Quackable createGooseDuck() {
        return new GooseAdapter();
    }
}