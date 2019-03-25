package pers.mingda.designpatterns.chapt4;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        // The NY Pizza has its own
        // marinara style sauce and thin crust.    
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        // And one topping, reggiano cheese!        
        toppings.add("Grated Reggiano Cheese");        
    }    
}