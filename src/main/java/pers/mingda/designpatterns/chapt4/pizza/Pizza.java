package pers.mingda.designpatterns.chapt4.pizza;

import pers.mingda.designpatterns.chapt4.pizza.ingredient.*;

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
    public abstract void prepare();
    
    public void bake() {
        System.out.println("Bake for 25 minutes at 350");    
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");    
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }    

    public void setName(String name) {
        this.name = name;    
    }

    public String getName() {
        return name;    
    }

    public String toString() {
        // code to print pizza here
        return "some pizza";
    }
}