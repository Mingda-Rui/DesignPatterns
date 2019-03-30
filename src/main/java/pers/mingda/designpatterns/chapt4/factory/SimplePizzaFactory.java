package pers.mingda.designpatterns.chapt4.factory;

import pers.mingda.designpatterns.chapt4.pizza.Pizza;

public class SimplePizzaFactory {

    // First we define a 
    // createPizza() method in
    // the factory. This is the
    // method all clients will use to
    // instantiate new objects.
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        // Here's the code we
        // plucked out of the 
        // orderPizza() method.
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}

class CheesePizza extends Pizza {}
class PepperoniPizza extends Pizza {}
class ClamPizza extends Pizza {}
class VeggiePizza extends Pizza {}