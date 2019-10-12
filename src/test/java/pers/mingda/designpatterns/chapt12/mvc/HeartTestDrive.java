package pers.mingda.designpatterns.chapt12.mvc;

import pers.mingda.designpatterns.chapt12.mvc.model.HeartModel;
import pers.mingda.designpatterns.chapt12.mvc.controller.ControllerInterface;
import pers.mingda.designpatterns.chapt12.mvc.controller.HeartController;

public class HeartTestDrive {
    public static void main(String[] args) {
        HeartModel heartModel = new HeartModel();
        // All we need to do is create
        // the controller and pass it a 
        // heart monitor.
        ControllerInterface model = new HeartController(heartModel);
    }
}