package org.fmamic.design.patterns.decorator.beverage;

public class Espresso implements Beverage {

    public double cost() {
        return 2.5;
    }

    public String getDescription() {
        return "Espresso";
    }
}
