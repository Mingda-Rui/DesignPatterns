package pers.mingda.designpatterns.chapt12.mvc.controller;

public interface ControllerInterface {
    // Here are all the methods the view can 
    // call on the controller.
    void start();
    void stop();
    void increaseBPM();
    void decreaseBPM();
    void setBPM(int bpm);
}