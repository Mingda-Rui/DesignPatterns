package pers.mingda.designpatterns.chapt9;

public class MenuTestDrive {
    public static void main(String args[]) {
        // First we create the new menus.      
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        // Then we create a 
        // Waitress and pass
        // her the menus.
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

        waitress.printMenu();
    }
}