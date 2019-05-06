package pers.mingda.designpatterns.chapt9;

import java.util.Iterator;

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;

    // In the constructor the Waitres
    // takes the two menus.
    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    // The printMenu() method now creates two
    // iterators, one for each menu.
    public void printMenu() {
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
        // And then calls the
        // overloaded printMenu()
        // with each iterator.
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator iterator) {
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