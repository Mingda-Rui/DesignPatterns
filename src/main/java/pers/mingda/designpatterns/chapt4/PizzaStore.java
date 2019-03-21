package pers.mingda.designpatterns.chapt4;

// PizzaStore is now abstract (see why below)
public abstract class PizzaStore {

    public Pizza orderPizza(
        String type /* We're now passing in the type of pizza to orderPizza */) {

        Pizza pizza;

        // Now createPizza is back to being a 
        // call to a method in the PizzaStore
        // rather than on a factory object.
        pizza = createPizza(type);

        // Each Pizza subtype (CheesPizza,
        // VeggiePizza, etc.) knows how to 
        // prepare itself.
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    // Now we've moved our factory
    // object to this method.
    abstract Pizza createPizza(String type);
    // Our "factory method" is now
    // abstract in PizzaStore

}