package pers.mingda.designpatterns.chapt4.factory;

import pers.mingda.designpatterns.chapt4.pizza.ingredient.*;

public interface PizzaIngredientFactory {
    
    Dough createDough();
    Sauce createSauce();
    Veggies[] createVeggies();
    Clams createClam();

    Cheese createCheese();
}