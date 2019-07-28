package pers.mingda.designpatterns.chapt12.duckfactory;

import pers.mingda.designpatterns.chapt12.duck.Quackable;

// We're defining an abstract factory
// that subclasses will implement to 
// create differen families.
public abstract class AbstractDuckFactory {

    // Each method creates one kind of duck.
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();
}