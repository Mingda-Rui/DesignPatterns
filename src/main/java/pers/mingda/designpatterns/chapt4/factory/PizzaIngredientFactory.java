package pers.mingda.designpatterns.chapt4.factory;

public interface PizzaIngredientFactory {
    
    public Dough createDough();
    public Sauce createSauce();
    public Veggies[] createVeggies();
    public Clams createClam();    
}