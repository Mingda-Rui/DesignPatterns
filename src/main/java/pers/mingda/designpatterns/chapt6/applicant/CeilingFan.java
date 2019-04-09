package pers.mingda.designpatterns.chapt6.applicant;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    // Notice that the CeilingFan class holds local
    // state representing the speed of the ceiling fan.
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        // code to set fan to high
    }

    public void medium() {
        speed = MEDIUM;
        // code to set fan to medium
    }

    public void low() {
        speed = LOW;
        // code to set fan to low
    }

    public void off() {
        speed = OFF;
        // code to turn fan off
    }

    // We can get the current
    // speed of the ceiling fan
    // using getSpeed().
    public int getSpeed() {
        return speed;
    }
}