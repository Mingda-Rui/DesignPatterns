package pers.mingda.designpatterns.chapt2;

import java.util.ArrayList;

public class StatisticsDisplay implements Observer, DisplayElement {

    private ArrayList<Float> tempuratureList;
    private ArrayList<Float> humidityList;
    private ArrayList<Float> pressureList;

    private float sumOfTemp;
    private float sumOfHumidity;
    private float sumOfPressure;

    private float avgTemp;
    private float avgHumidity;
    private float avgPressure;

    private float maxTemp;
    private float maxHumidity;
    private float maxPressure;

    private float minTemp;
    private float minHumidity;
    private float minPressure;

    private WeatherData weatherData;


    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);

        tempuratureList = new ArrayList<Float>();
        humidityList = new ArrayList<Float>();
        pressureList = new ArrayList<Float>();

        sumOfTemp = 0;
        sumOfHumidity = 0;
        sumOfPressure = 0;

        maxTemp = 0;
        maxHumidity = 0;
        maxPressure = 0;

        minTemp = 0;
        minHumidity = 0;
        minPressure = 0;
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + avgTemp + "/" + maxTemp + "/" + minTemp);
    }

    public void update(float temp, float humidity, float pressure) {

        tempuratureList.add(temp);
        humidityList.add(humidity);
        pressureList.add(pressure);

        sumOfTemp += temp;
        sumOfHumidity += humidity;
        sumOfPressure += pressure;

        setMinMax(temp, humidity, pressure);

        calculateAvg();

        display();

    }

    private void setMinMax(float temp, float humidity, float pressure) {

        if(tempuratureList.size() == 1 && humidityList.size() == 1 && pressureList.size() == 1) {
            minTemp = temp;
            minHumidity = humidity;
            minPressure = pressure;
        }

        if(temp < minTemp) {
            minTemp = temp;
        } else if(temp > maxTemp) {
            maxTemp = temp;
        }
        if(humidity < minHumidity) {
            minHumidity = humidity;
        } else if(humidity > maxHumidity) {
            maxHumidity = humidity;
        }
        if(pressure < minPressure) {
            minPressure = pressure;
        } else if(pressure > maxPressure) {
            maxPressure = pressure;
        }
    }

    private void calculateAvg() {
        avgTemp = sumOfTemp / tempuratureList.size();
        avgHumidity = sumOfHumidity / humidityList.size();
        avgPressure = sumOfPressure / pressureList.size();
    }
}
