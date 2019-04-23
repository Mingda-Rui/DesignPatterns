package pers.mingda.designpatterns.chapt8;

// Here's our Coffee class for making coffee.
public class Coffee {
    
    // Here's our recipe for coffee,
    // straight out of the training manual.
    void prepareRecipe() {
        // Each of the steps is implemented as
        // a separate method.
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    // Each of there methods
    // implements one step of
    // the algorithm. There's 
    // a method to boil water,
    // brew the coffee, pour
    // the coffee in a cup and 
    // add sugar and milk.
    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void brewCoffeeGrinds() {
        System.out.println("Dripping Coffee through filter");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public void addSugarAndMilk() {
        System.out.println("Adding Sugar and Milk");
    }
}