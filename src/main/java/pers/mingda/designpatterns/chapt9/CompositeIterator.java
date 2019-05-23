package pers.mingda.designpatterns.chapt9;

import java.util.Iterator;
import java.util.Stack;

// Like all iterators, we're implementing 
// the java.util.Iterator interface.
public class CompositeIterator implements Iterator<MenuComponent> {
    Stack<Iterator<MenuComponent>> stack = new Stack<>();

    // The iterator of the top level
    // composite we're going to iterate over
    // is passed in. We throw that in a 
    // stack data structure.
    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }

    // Okay, when the client wants
    // to get the next element we 
    // first make sure there is one 
    // by calling hasNext()...
    @Override
    public MenuComponent next() {
        // If there is a next element, we 
        // get the current iterator off the
        // stack and get its next element.
        if (hasNext()) {
            Iterator<MenuComponent> iterator = stack.peek();
            MenuComponent component = iterator.next();
            if (component instanceof Menu) {
                // If that element is a menu, we have 
                // another composite that needs to
                // be included in the iteration, so we 
                // throw it on the stack. In either 
                // case, we return the component.
                stack.push(component.createIterator());
            }
            return component;
        } else {
            return null;
        }
    }

    public boolean hasNext() {
        // To see if there is a next element,
        // we check to see if the stack is 
        // empty; if so, there isn't
        if (stack.empty()) {
            return false;
        
        // Otherwise, we got the iterator
        // off the top of the stack and see
        // if it has a next element. If it
        // doesn't we pop it off the stack.
        // and call hasNext() recursively.
        } else {
            Iterator<MenuComponent> iterator = stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                // Otherwise there is a next element
                // and we return true.
                return true;
            }
        }
    }

    // We're not supporting 
    // remove, just traversal.
    public void remove() {
        throw new UnsupportedOperationException();
    }
}