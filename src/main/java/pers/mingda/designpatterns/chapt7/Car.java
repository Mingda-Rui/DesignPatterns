package pers.mingda.designpatterns.chapt7;

public class Car {
    // Here's a component of 
    // this class. We can call
    // its methods.
    Engine engine;
    // other instance variables

    public Car() {
        // initialize engine, etc.
    }

    public void start(Key key) {

        // Here we're creating a new
        // object, its methods are legal.
        Doors doors = new Doors();

        // You can call a method 
        // on an object passed as 
        // a parameter.
        boolean authorized = key.turns();

        if (authorized) {

            // You can call a method on a
            // component of the object
            engine.start();

            // You can call a local method
            // within the object.
            updateDashboardDisplay();
            
            // You can call a mehtod on an 
            // object you create or instantiate.
            doors.lock();
        }
    }

    public void updateDashboardDisplay() {
        // update display
    }
}

class Engine {
    public void start() {}
}

class Doors {
    public void lock() {}
}

class Key {
    public boolean turns() {
        return true;
    }
}