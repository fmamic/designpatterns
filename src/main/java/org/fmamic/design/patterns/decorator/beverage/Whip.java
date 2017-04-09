package org.fmamic.design.patterns.decorator.beverage;

public class Whip extends Decorator {

    public Whip(final Beverage beverage) {
        setBeverage(beverage);
    }

    public double cost() {
        return getBeverage().cost() + 1.15;
    }

    public String getDescription() {
        return getBeverage().getDescription() + " with Whip";
    }

}
