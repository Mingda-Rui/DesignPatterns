package pers.mingda.designpatterns.chapt9;

import java.util.Iterator;

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu cafeMenu;
    

    // In the constructor the Waitres
    // takes the two menus.
    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    // The printMenu() method now creates two
    // iterators, one for each menu.
    public void printMenu() {
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
        Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();
        // And then calls the
        // overloaded printMenu()
        // with each iterator.
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
        // We're using the Cafe's 
        // menu for our dinner menu.
        // All we have to do to print
        // it is create the iterator,
        // and pass it to printMenu().
        // That's it!
        System.out.println("\nDINNER");
        printMenu(cafeIterator);
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