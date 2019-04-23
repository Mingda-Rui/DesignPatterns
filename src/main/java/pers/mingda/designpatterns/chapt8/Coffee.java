package pers.mingda.designpatterns.chapt8;

// Here's our Coffee class for making coffee.
public class Coffee extends CaffeineBeverage {
    
    // Same for Coffee, except Coffee deals
    // with coffee, and sugar and milk instead
    // of tea bags and lemon.
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}