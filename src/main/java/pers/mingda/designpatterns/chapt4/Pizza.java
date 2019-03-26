package pers.mingda.designpatterns.chapt4;

import java.util.ArrayList;

// We'll start with an abstract 
// Pizza class and all the concrete
// pizzas will derive from this.
public abstract class Pizza {
    // Each Pizza has a name, a type of dough, a
    // type of sauce, and a set of toppings.    
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    // The abstract class provides 
    // some basic defaults for baking,
    // cutting and boxing.    
    void prepare() {
        // Preparation follows a 
        // number of steps in a 
        // particular sequence.     
        System.out.println("Preparing " + name);    
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("   " + toppings.get(i) );
        }
    }
    
    void bake() {
        System.out.println("Bake for 25 minutes at 350");    
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");    
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }    

    public String getName() {
        return name;    
    }
}