package pers.mingda.designpatterns.chapt6.command;

public class NoCommand implements Command {
    
    public void execute() {System.out.println("No Command");}

    public void undo() {
        System.out.println("Undo Nothing");
    }
}