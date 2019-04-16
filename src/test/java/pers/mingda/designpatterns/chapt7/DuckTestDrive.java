package pers.mingda.designpatterns.chapt7;

import pers.mingda.designpatterns.chapt7.adapter.TurkeyAdapter;

public class DuckTestDrive {
    public static void main(String[] args) {
        // Let's create a Duck...
        MallardDuck duck = new MallardDuck();

        // and a Turkey.
        WildTurkey turkey = new WildTurkey();

        // And then wrap the turkey 
        // in a TurkeyAdapter, which 
        // makes it look like a Duck.
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        // Then, let's test the Turkey:
        // make it gobble, make it fly.
        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        // Now let's test the duck
        // by calling the testDuck()
        // method, which expects a 
        // Duck object.
        System.out.println("\nThe Duck says...");
        testDuck(duck);

        // Now the big test: we try to pass
        // off the turkey as a duck...
        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);

    }
    
    // Here's out testDuck() method; it 
    // gets a duck and calls its quack()
    // and fly() methods.
    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}