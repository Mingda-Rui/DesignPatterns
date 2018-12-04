package pers.mingda.designpatterns.chapt1;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Slience >>");
    }
}
