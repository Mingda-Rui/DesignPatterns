package pers.mingda.designpatterns.chapt9;

import java.util.Iterator;
import java.util.ArrayList;

public class Waitress {
    // Now we just take an
    // ArrayList of menus.
    ArrayList<Menu> menus;
    

    // In the constructor the Waitres
    // takes the two menus.
    public Waitress(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    // And we iterate through the menus,
    // passing each menu's iterator to 
    // the overloaded printMenu() method.
    public void printMenu() {
        Iterator<Menu> menuIterator = menus.iterator();
        while (menuIterator.hasNext()) {
            Menu menu = (Menu)menuIterator.next();
            printMenu(menu.createIterator());
        }   
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        // Test if there are any more items.
        while(iterator.hasNext()) {
            // Get the next item.
            MenuItem menuItem = (MenuItem)iterator.next();
            // Use the item to get name, price
            // and description and print them.
            System.out.println(menuItem.getName() + ", ");
            System.out.println(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }

    // other methods here
    
} 