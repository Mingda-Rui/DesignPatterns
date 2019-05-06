package pers.mingda.designpatterns.chapt4.pizza;

import pers.mingda.designpatterns.chapt4.pizza.ingredient.Dough;
import pers.mingda.designpatterns.chapt4.pizza.ingredient.Sauce;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        // The NY Pizza has its own
        // marinara style sauce and thin crust.    
        name = "NY Style Sauce and Cheese Pizza";
        dough = new Dough() {};
        sauce = new Sauce() {};

        // And one topping, reggiano cheese!        
//        toppings.add("Grated Reggiano Cheese");
    }

    @Override
    public void prepare() {

    }
}