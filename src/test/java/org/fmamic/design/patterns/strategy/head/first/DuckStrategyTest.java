package org.fmamic.design.patterns.strategy.head.first;

import org.fmamic.design.patterns.strategy.head.first.animal.MallardDuck;
import org.fmamic.design.patterns.strategy.head.first.behavior.FlyWithWings;
import org.fmamic.design.patterns.strategy.head.first.behavior.Quack;
import org.junit.Test;

public class DuckStrategyTest {

    @Test
    public void duckStrategyTest() {
        final Duck duck = new MallardDuck();

        duck.setQuackBehavior(new Quack());
        duck.setFlyBehavior(new FlyWithWings());

        duck.display();
        duck.performFly();
        duck.preformQuack();

        duck.swim();
    }

}
