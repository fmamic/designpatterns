package org.fmamic.design.patterns.observer.weather.display;

import org.fmamic.design.patterns.observer.weather.Observer;

public class Forecast implements Observer, Display {

    private int temp = 0;

    public void update(final int temperature, final int humidity, final int pressure) {
        this.temp = temperature;
        display();
    }

    public void display() {
        System.out.println("Display Forecast: " + this.temp);
    }
}
