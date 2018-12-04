package pers.mingda.designpatterns.chapt1;

public class MallardDuck extends Duck {

    public MallardDuck() {

        // A MallardDuck uses the Quack class to
        // handle its quack, so when performQuack
        // is called, the responsibility for the
        // quack is delegated to he Quack object
        // and we get a real quack.
        quackBehavior = new Quack();

        // And it uses FlyWithWings as its
        // FlyBehavior type.
        flyBehavior = new FlyWithWings();

    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }

}
