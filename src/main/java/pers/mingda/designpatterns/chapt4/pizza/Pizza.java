package pers.mingda.designpatterns.chapt4.pizza;

import java.util.ArrayList;

public abstract class Pizza {
    // Each Pizza holds a set of ingredients
    // that are used in its preparation.   
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;
    
    // We' ve now made the prepare method abstract
    // This is where we are going to collect the
    // ingredients needed for the pizza, which of 
    // course will come from the ingredient factory
    abstract void prepare();
    
    void bake() {
        System.out.println("Bake for 25 minutes at 350");    
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");    
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }    

    void setName(String name) {
        this.name = name;    
    }

    public String getName() {
        return name;    
    }

    public String toString() {
        // code to print pizza here 
    }
}