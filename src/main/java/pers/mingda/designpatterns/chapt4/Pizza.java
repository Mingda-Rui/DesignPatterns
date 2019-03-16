package pers.mingda.designpatterns.chapt4;

public class Pizza {
    Pizza orderPizza(
        String type /* We're now passing in the type of pizza to orderPizza */) {

        Pizza pizza;

        // Based on the type of pizza, we 
        // instantiate the correct contrete class
        // and assign it to the pizza instance
        // variable. Note that each pizza here
        // has to implement the Pizza interface.
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }

        // Each Pizza subtype (CheesPizza,
        // VeggiePizza, etc.) knows how to 
        // prepare itself.
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}