package pers.mingda.designpatterns.chapt6.applicant;

public class Stereo {
    public void on() { System.out.println("The stereo is on"); }
    public void off() { System.out.println("The stereo is off"); }
    public void setCd() { System.out.println("Set the CD for stereo"); }
    public void setDvd() { System.out.println("Set the DVD for stereo"); }
    public void setRadio() { System.out.println("Set the Radio for stereo"); }
    public void setVolume(int volume) { System.out.println("Set the volume to " + volume + " for the stereo"); }
}