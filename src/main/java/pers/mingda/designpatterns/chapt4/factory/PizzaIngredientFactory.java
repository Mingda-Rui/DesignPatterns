package pers.mingda.designpatterns.chapt4.factory;

import pers.mingda.designpatterns.chapt4.pizza.ingredient.*;

public interface PizzaIngredientFactory {
    
    public Dough createDough();
    public Sauce createSauce();
    public Veggies[] createVeggies();
    public Clams createClam();    
}