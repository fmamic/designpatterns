package org.fmamic.design.patterns.decorator.beverage;

public abstract class Decorator implements Beverage {

    private Beverage beverage;

    public Beverage getBeverage() {
        return beverage;
    }

    public void setBeverage(final Beverage beverage) {
        this.beverage = beverage;
    }
}
