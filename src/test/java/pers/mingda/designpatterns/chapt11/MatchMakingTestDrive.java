package pers.mingda.designpatterns.chapt11;

import java.lang.reflect.Proxy;
import pers.mingda.designpatterns.chapt11.matchmaking.PersonBean;
import pers.mingda.designpatterns.chapt11.matchmaking.NonOwnerInvocationHandler;
import pers.mingda.designpatterns.chapt11.matchmaking.OwnerInvocationHandler;

public class MatchMakingTestDrive {
    // instance variables here

    // Main just creates the test 
    // drive and calls its drive()
    // method to get things going.
    public static void main(String[] args) {
        MatchMakingTestDrive test = new MatchMakingTestDrive();
        test.drive();
    }

    // The constructor initializes
    // our DB of people in the 
    // matchmaking service.
    public MatchMakingTestDrive() {
        initializeDatebase();
    }

    public void drive() {
        // Let's retieve a person from the DB
        PersonBean joe = getPersonFromDatabase("Joe Javabean");
        // ...and create an owner proxy.
        PersonBean ownerProxy = getOwnerproxy(joe);
        // Call a getter
        System.out.println("Name is " + ownerProxy.getName());
        // and then a setter
        ownerProxy.setInterests("bowling, Go");
        System.out.println("Interests set from owner proxy");
        try {
            // and then try to change the rating.
            // this shouldn't work!
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception e) {
            System.out.println("Can't set rating from owner proxy");
        }
        System.out.println("Rating is " + ownerProxy.getHotOrNotRating());

        // Now create a non-owner proxy
        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
        // ...and call a getter
        System.out.println("Name is " + nonOwnerProxy.getName());
        try {
            // followed by a setter
            // This shouldn't work!
            nonOwnerProxy.setInterests("bowling, Go");
        } catch (Exception e) {
            System.out.println("Can't set interesets from non owner proxy");
        }
        // Then try to set the rating.
        // This should work!
        nonOwnerProxy.setHotOrNotRating(3);
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
    }

    // other methods like getOwnerProxy and getNonOwnerProxy here

    // Mock methods for tests
    private void initializeDatebase() {}

    //TODO finish the method
    private PersonBean getPersonFromDatabase(String name) {
        return null;
    }

    // This method takes a person object(the real
    // subject) and returns a proxy for it. Because the
    // proxy has the same interface as the subject, we 
    // return a PersonBean.
    PersonBean getOwnerProxy(PersonBean person) {
        // To create a proxy we use
        // the static newProxyInstance
        // method on the Proxy class...
        return (PersonBean) Proxy.newProxyInstance(
            // We pass it the classloader 
            // for our subject...
            person.getClass().getClassLoader(),
            // ...and the set of interfaces the
            // proxy needs to implement...
            person.getClass().getInterfaces(),
            // ...and an invocation handler, in this
            // proxy needs to implement...
            new OwnerInvocationHandler(person));
            // We pass the real subject into the constructor
            // of the invocation handler. If you look back
            // two pages you'll see this is how the handler gets
            // access to the real subject.
    }

    PersonBean getNonOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
            person.getClass().getClassLoader(), 
            person.getClass().getInterfaces(),
            new NonOwnerInvocationHandler(person));
    }
}