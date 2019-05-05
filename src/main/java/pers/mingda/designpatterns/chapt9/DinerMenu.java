package pers.mingda.designpatterns.chapt9;

// And here's Mel's implementation of the Diner menu
public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    // Mel takes a different approach; he's using an Array so he
    // can control the max size of the menu and retrieve menu
    // items out without having to cast his objects.
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS]; 

        addItem("Vegetarian BLT",
            "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT",
            "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day", 
            "Soup of the day, with a side of potato salas", false, 3.29);
        addItem("Hotdog",
            "A hot dog, with saurkraut, relish, onions, topped with cheese",
            false, 3.05);
        // a couple of other Diner Menu items added here
    }

    // addItem() takes all the parameters 
    // necessary to create a MenuItem and 
    // instantiates one. It also checks to make
    // sure we haven't hit hte menu size limit.
    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            // Mel specifically wnats to keep his menu under a 
            // certain size (presumably so he doesn't have to
            // remember too many recipes).
            System.out.println("Sorry, menu is full! Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    // We're not going to need the getMenuItems() 
    // method anymore and in fact, we don't want it
    // because it exposes our internal implementation!
    // public MenuItem[] getMenuItems() {
    //     return menuItems;
    // }

    // Here's the createIterator() method.
    // It creates a DinerMenuIterator
    // from the menuItems array and
    // returns it to the client.
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
    // We're returning the Iterator interface. The client
    // doesn't need to konw how the menuItems are maintained
    // in the DinerMenu, nor does it need to know how the 
    // DinerMenuIterator is implemented. It just needs to ues the
    // iterators to step through the items in the menu.

    // other menu methods here 
    // Like Lou, Mel has a bunch of code that depends on the implementation of 
    // his menu being an Array. He's too busy cooking to rewrite all of this.

}