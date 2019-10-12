package pers.mingda.designpatterns.chapt12.mvc;

import pers.mingda.designpatterns.chapt12.mvc.model.BeatModel;
import pers.mingda.designpatterns.chapt12.mvc.model.BeatModelInterface;
import pers.mingda.designpatterns.chapt12.mvc.controller.BeatController;
import pers.mingda.designpatterns.chapt12.mvc.controller.ControllerInterface;

public class DJTestDrive {
    public static void main(String[] args) {
        // First create a model...
        BeatModelInterface model = new BeatModel();
        
        // ...then create a controller and 
        // pass it the model. Remeber, the
        // controller creates the view, so we
        // don't have to do that.
        ControllerInterface controller = new BeatController(model);

    }
}