package org.fmamic.design.patterns.observer.display;

import org.fmamic.design.patterns.observer.Observer;

public class CurrentCondition implements Observer, Display {

    int humidity = 0;

    public void update(final int temperature, final int humidity, final int pressure) {
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Display Current Condition " + this.humidity);
    }
}
