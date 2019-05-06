package pers.mingda.designpatterns.chapt4.pizza;

import pers.mingda.designpatterns.chapt4.factory.*;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory; 
    
    // To make a pizza now, we need
    // a factory to procide the 
    // ingredients. So each Pizza
    // class gets a factory passed
    // into its constructor, and it's
    // stored in an instance variable    
    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;    
    }    

    public void prepare() {
        // The prepare() method steps through creating
        // a cheese pizza, and each time it needs an
        // ingredient, it asks the factory to produce it    
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();    
    }    
    
}