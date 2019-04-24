package pers.mingda.designpatterns.chapt8;

public class BeverageTestDrive {
    public static void main(String[] args) {

        // Create a tea
        Tea tea = new Tea();

        // A coffee.
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        // And call prepareRecipe() on both!
        System.out.println("\nMaking tea...");
        tea.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffeeHook.prepareRecipe();
    }
}