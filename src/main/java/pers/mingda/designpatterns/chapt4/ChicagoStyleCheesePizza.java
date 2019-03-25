package pers.mingda.designpatterns.chapt4;

public class ChicagoStyleCheesePizza extends Pizza {
    // The Chicago Pizza uses plum
    // tomatoes as a sauce along 
    // with extra thick crust.
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        
        // The Chicago style deep
        // dish pizza has lots of 
        // mozzarella chees!
        toppings.add("Shredded Mozzarella Cheese");
    }    

    // The Chicago style pizza also overrides the cut()
    // method so that the pieces are cut into squares.    
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }    
}