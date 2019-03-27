package pers.mingda.designpatterns.chapt4;

// The NY ingredient factory implements 
// the interface for all ingredient factories
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    
    public Dough createDough() {
        return new ThinCrustDough();    
    }

    public Sauce createSauce() {
        return new MarinaraSauce();    
    }

    public Cheese createCheese() {
        return new ReggianoCheese();    
    }    

    public Veggies[] createVeggies() {
        // For veggies, we return an array of 
        // Veggies. Here we've hardcoded the 
        // veggies. We coud make this more
        // sophisticated, but that doesn't really
        // add anything to learning the factory
        // pattern, so we'll keep it simple.    
        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggies;
    }

    public Pepperoni createPepperoni() {
        // The best sliced pepperoni. This
        // is shared between new York
        // and Chicago. Make sure you
        // use it on the next page when
        // you get to implement the 
        // Chicago factory yourself    
        return new SlicedPepperoni();    
    }    

    public Clams createClam() {
        // New York is on the coast; it
        // getes fresh clams. Chicago has
        // to settle for frozen.
        return new FreshClams();    
    }    

}