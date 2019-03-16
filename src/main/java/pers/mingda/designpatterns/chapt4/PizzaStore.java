package pers.mingda.designpatterns.chapt4;

public class PizzaStore {
    // Now we give PizzaStore a reference
    // to a SimplePizzaFactory.
    SimplePizzaFactory factory;

    // PizzaStore gets the factory passed to
    // it in the constructor.
    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(
        String type /* We're now passing in the type of pizza to orderPizza */) {

        Pizza pizza;

        // And the orderPizza() method uses the
        // factory to create its pizzas by simply
        // passing on the type of the order.
        pizza = factory.createPizza(type);

        // Each Pizza subtype (CheesPizza,
        // VeggiePizza, etc.) knows how to 
        // prepare itself.
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

// other methods here

}