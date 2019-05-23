package pers.mingda.designpatterns.chapt9;

public class MenuTestDrive {
    public static void main(String args[]) {
        // Lset's first create all the menu objects.
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");
        
        // We also need two top level menu 
        // now that we'll name allMenus.
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        // We're using the Composite add() method to add
        // each menu to the top level menu, allMenus.
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        // add menu items here

        // New we need to add all the menu items,
        // here's one example, for the rest,
        // look at the complete source code.
        dinerMenu.add(new MenuItem("Pasta", 
            "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
            true,
            3.89));

        // And we're also adding a menu to a menu.
        // All dinerMenu cares about is that everything 
        // it holds, whether it's a menu item or a menu,
        // is a MenuCompenent.
        dinerMenu.add(dessertMenu);

        // Add some apple pie to the dessert menu...
        dessertMenu.add(new MenuItem(
            "Apple Pie",
            "Apple pie with a flakey crust, topped with vanilla icecream",
            true,
            1.59));

        // add more menu items here

        // Once we've constructed our entire
        // menu hierarchy, we hand the whole
        // thing to the Waitress, and as 
        // you've seen, it's easy as apple pie  
        // for her toprint it out.
        Waitress waitress = new Waitress(allMenus);

        waitress.printMenu();

    }
}