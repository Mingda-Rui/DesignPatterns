package pers.mingda.designpatterns.chapt11.matchmaking;

// InvocationHandler is part of the java.lang.reflect
// package, so we need to import it.
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

// All invocation handlers implement
// the InvocationHandler interface.
public class OwnerInvocationHandler implements InvocationHandler {
    PersonBean person;

    // We're passed the Real Subject in the
    // constructor and we keep a reference to it.
    public OwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }

    // Here's the invoke method that gets 
    // called every time a method is invoked 
    // on the proxy.
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        
        try {
            // If the method is a getter, 
            // we go ahead and invoke it 
            // on the real subject.
            if (method.getName().startsWith("get")) {
                return method.invoke(person, args);

            // Otherwise, if it is the setHotOrNotRating() method
            // we disallow it by throwing a IllegalAccessException.
            } else if (method.getName().equals("setHotOrNotRating")) {    
                throw new IllegalAccessException();

            // Because we are the owner any 
            // other set method is fine and we go
            // ahead and invoke it on the real subject.
            } else if (method.getName().startsWith("set")) {
                return method.invoke(person, args);
            }

        // This will happen if the real subject throws an exception.
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        // If any other method is called, 
        // we're just going to return null 
        // rather than take a chance.
        return null;
    }

}