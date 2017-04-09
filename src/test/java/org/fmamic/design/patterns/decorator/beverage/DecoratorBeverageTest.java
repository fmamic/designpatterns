package org.fmamic.design.patterns.decorator.beverage;

import org.junit.Test;

public class DecoratorBeverageTest {

    @Test
    public void beverageTest() {
        final Beverage espresso = new Espresso();

        final Decorator milk = new Milk(espresso);
        final Decorator whip = new Whip(milk);

        System.out.println(whip.getDescription());
        System.out.println(whip.cost());
    }

}
