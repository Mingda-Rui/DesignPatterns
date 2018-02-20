package pers.mingda.designpatterns.chapt2;

// This display implements Observer
// so it can get changes from the
// WeatherData object.
// It also implements DisplayElements,
// because our API is going to
// require all display elements to
// implement this interface.
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    // The constructor is passed the
    // weatherData object (the Subject)
    // and we use it to register the
    // display as an observer.
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {

        // When update() is called, we
        // save the temp and humidity
        // and call display().
        this.temperature = temperature;
        this.humidity = humidity;
        display();

    }

    public void display() {

        // The display() method
        // just prints out the most
        // recent temp and humidity.
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");

    }
}














