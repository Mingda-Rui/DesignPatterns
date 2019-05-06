package pers.mingda.designpatterns.chapt4;

import pers.mingda.designpatterns.chapt4.pizzastore.*;
import pers.mingda.designpatterns.chapt4.pizza.*;

public class PizzaTestDrive {

    public static void main(String[] args) {
        // First we create two 
        // different stores.    
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore(); 

        // Then use one one store
        // to make Ethan's order        
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
        
    }
}