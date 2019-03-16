package pers.mingda.designpatterns.chapt4;

public class Pizza {
    Pizza orderPizza() {
        // For flexibility, we really want 
        // this to be an abstract class or
        // interface, but we can't directly
        // instantiate either of those.
        Pizza pizza = new Pizza();

        // pizza.prepare();
        // pizza.bake();
        // pizza.cut();
        // pizza.box();
        return pizza;
    }
}