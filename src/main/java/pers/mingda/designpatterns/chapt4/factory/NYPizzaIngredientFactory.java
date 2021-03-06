package pers.mingda.designpatterns.chapt4.factory;

import pers.mingda.designpatterns.chapt4.pizza.ingredient.*;

// The NY ingredient factory implements 
// the interface for all ingredient factories
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    
    public Dough createDough() {
//        return new ThinCrustDough();
        return new Dough() {};
    }

    public Sauce createSauce() {
//        return new MarinaraSauce();
        return new Sauce() {};
    }

    public Cheese createCheese() {
//        return new ReggianoCheese();
        return new Cheese() {};
    }

    public Veggies[] createVeggies() {
        // For veggies, we return an array of 
        // Veggies. Here we've hardcoded the 
        // veggies. We coud make this more
        // sophisticated, but that doesn't really
        // add anything to learning the factory
        // pattern, so we'll keep it simple.    
//        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        Veggies veggies[] = new Veggies[0];
        return veggies;
    }

    public Pepperoni createPepperoni() {
        // The best sliced pepperoni. This
        // is shared between new York
        // and Chicago. Make sure you
        // use it on the next page when
        // you get to implement the 
        // Chicago factory yourself    
//        return new SlicedPepperoni();
        return new Pepperoni() {};
    }    

    public Clams createClam() {
        // New York is on the coast; it
        // getes fresh clams. Chicago has
        // to settle for frozen.
//        return new FreshClams();
        return new Clams() {};
    }    

}