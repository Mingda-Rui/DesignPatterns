package pers.mingda.designpatterns.chapt8;

public class Tea {

    // This look very similar to the
    // one we just implemented in 
    // Coffee; the second and forth
    // steps are different, but it's 
    // basically the same recipe.
    void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    // Notice that these two methods are 
    // exactly the same as they are in Coffee!
    // So we definitely have some code duplication
    // going on here.
    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // These two methods are specialized to Tea.
    public void steepTeaBag() {
        System.out.println("Steeping the tea");
    }

    public void addLemon() {
        System.out.println("Adding Lemon");
    }

}