package org.fmamic.design.patterns.decorator.beverage;

public class Milk extends Decorator {

    public Milk(final Beverage beverage) {
        setBeverage(beverage);
    }

    public double cost() {
        return getBeverage().cost() + 1.0;
    }

    public String getDescription() {
        return getBeverage().getDescription() + " with Milk";
    }

}
