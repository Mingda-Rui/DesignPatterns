package pers.mingda.designpatterns.chapt5;

public class Singleton {
    // The volatile keyword ensures that multiple threads
    // handle the uniqueInstance variable correctly when it
    // is being initialized to the Singleton instance.
    private volatile static Singleton uniqueInstance;

    // other useful instance variables here 

    private Singleton() {}

    // Check for an instance and 
    // if there isn't one, enter a 
    // synchronized block.
    public static synchronized Singleton getInstance() {
        // Note we only synchronize
        // the first time through!
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    // Once in the block, check again and
                    // if still null, create an instance.
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    // other useful methods here
}