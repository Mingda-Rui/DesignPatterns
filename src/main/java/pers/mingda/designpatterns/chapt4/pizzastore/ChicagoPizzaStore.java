package pers.mingda.designpatterns.chapt4.pizzastore;

import pers.mingda.designpatterns.chapt4.pizza.*;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
//        } else if (item.equals("veggie")) {
//            return new ChicagoStyleVeggiePizza();
//        } else if (item.equals("clam")) {
//            return new ChicagoStyleClamPizza();
//        } else if (item.equals("pepperoni")) {
//            return new ChicagoStylePepperoniPizza();
        } else return null;
    }

}