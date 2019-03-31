package pers.mingda.designpatterns.chapt5;

public class Singleton {
    private static Singleton uniqueInstance;

    // other useful instance variables here 

    private Singleton() {}

    // By adding the synchronized keyword to 
    // getInstance(), we force every thread to
    // wait its turn before it can enter the
    // method. That is, no two threads may 
    // enter the method at the same time.
    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    // other useful methods here
}