package pers.mingda.designpatterns.chapt4.pizza;

import pers.mingda.designpatterns.chapt4.factory.*;

public class ClamPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    
    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        // ClamPizza also stashes an ingredient factory
        this.ingredientFactory = ingredientFactory;            
    }    

    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
    }    
}