package pers.mingda.designpatterns.chapt9;

public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    // In the constructor the Waitres
    // takes the two menus.
    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    // The printMenu() method now creates two
    // iterators, one for each menu.
    public void printMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
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