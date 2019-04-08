package pers.mingda.designpatterns.chapt6.command;

import pers.mingda.designpatterns.chapt6.applicant.GarageDoor;

public class GarageDoorOpenCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.up();
    }

}