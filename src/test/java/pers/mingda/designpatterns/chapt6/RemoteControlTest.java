package pers.mingda.designpatterns.chapt6;

import pers.mingda.designpatterns.chapt6.control.*;
import pers.mingda.designpatterns.chapt6.command.*;
import pers.mingda.designpatterns.chapt6.applicant.*;

// This is our Client in Command Pattern-speak
public class RemoteControlTest {
    public static void main(String[] args) {
        // The remote is out Invoker;
        // it will be passed a 
        // command object that can 
        // be used to make requests.
        SimpleRemoteControl remote = new SimpleRemoteControl();
        
        // Now we create a Light
        // object, this will be the
        // Receiver of the request.
        Light light = new Light();

        GarageDoor garageDoor = new GarageDoor();

        // Here, create a command and 
        // pass the Receiver to it.
        LightOnCommand lightOn = new LightOnCommand(light);

        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

        // Here, pass the command
        // to the Invoker.
        remote.setCommand(lightOn);

        // And then we simulate the 
        // button being pressed
        remote.buttonWasPressed();

        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}