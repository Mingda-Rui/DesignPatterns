package pers.mingda.designpatterns.chapt9;

import java.util.Iterator;

public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    // The printVegetarianMenu() method
    // takes the allMenu's composite and 
    // gets its iterator. That will be our      
    // CompositeIterator.
    public void printVegetarianMenu() {
        Iterator<MenuComponent> iterator = allMenus.createIterator();
        System.out.println("\nVEGETARIAN MENU\n----");
        // Iterate through every element of the composite.
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent)iterator.next();
            try {
                // Call each element's is Vegetarian() method 
                // and if true, we call its print() method.
                if (menuComponent.isVegetarian()) {
                    // print() is only called on MenuItems, 
                    // never composites. Can you see whu?
                    menuComponent.print();
                } 
            } catch (UnsupportedOperationException e) {
                // We implemented isVegetarian() on the 
                // Menus to always throw an exception. If 
                // that happens we catch the exception, but
                // continue with our iteration.
            }
        }
        
    }
} 