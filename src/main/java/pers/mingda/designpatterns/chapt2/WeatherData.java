package pers.mingda.designpatterns.chapt2;

import java.util.ArrayList;

public class WeatherData implements Subject {

    // We've added an ArrayList to
    // hold the Observers, and we
    // create in the constructor.
    private ArrayList observers;

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    // When an observer registers, we just
    // add it to the end of the list
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    // Likewise, when an observer wants to un-register,
    // we just take it off the list.
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    // Here's the fun part; this is where we
    // tell all the observers about the state.
    // Because they are all Observers, we
    // know they all implement update(), so
    // we know how to notify them.
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    // We notify the Observers when
    // we get updated measurements
    // from the Weather Station.
    public void measurementsChanged() {
        notifyObservers();
    }

    // Okay, while we wanted to ship a nice little
    // weather station with each book, the publisher
    // wouldn't go for it. So, rather than reading
    // actual weather data off a device, we're
    // going to use this method to test our display
    // elements. Or, for fun, you could write code
    // to grab measurements off the web.
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();

        // other WeatherData methods here
    }
}




















