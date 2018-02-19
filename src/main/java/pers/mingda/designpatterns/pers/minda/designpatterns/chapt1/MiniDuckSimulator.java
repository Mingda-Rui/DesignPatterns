package pers.mingda.designpatterns.pers.minda.designpatterns.chapt1;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();

        // This calls the MallardDuck's inherited
        // performQuack() method, which then delegates to
        // the object's QuackBehavior (i.e. calls quack() on the
        // duck's inherited quackBehavior reference).
        mallard.performQuack();

        // Then we do the same thing with MallardDuck's
        // inherited performFly() method.
        mallard.performFly();
    }
}
