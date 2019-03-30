package pers.mingda.designpatterns.chapt4;

public class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        // The NY Store is composed with a NY
        // pizza ingredient factory. This will
        // be used to produce the ingredients 
        // for al NY style pizzas.
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
                
        if (item.equals("cheese")) {
            
            // We now pass each pizza the 
            // factory that should be used to 
            // produce its ingredients.            
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");

        } else if (item.equals("veggie")) {
            
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setNmae("New York Style Veggie Pizza");

        } else if (item.equals("clam")) {
            
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");

        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setNmae("New York Sytle Pepperoni Pizza");

        }
        return pizza;
    }
}