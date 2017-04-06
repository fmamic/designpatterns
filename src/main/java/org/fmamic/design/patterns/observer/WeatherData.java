package org.fmamic.design.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private final List<Observer> observers = new ArrayList<Observer>();

    private int temperature;

    private int pressure;

    private int humidity;

    public void registerObserver(final Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(final Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserver() {
        for (final Observer observer : observers) {
            observer.update(getTemperature(), getHumidity(), getPressure());
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(final int temperature) {
        this.temperature = temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(final int pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(final int humidity) {
        this.humidity = humidity;
    }
}
