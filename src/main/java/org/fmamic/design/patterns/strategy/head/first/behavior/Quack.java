package org.fmamic.design.patterns.strategy.head.first.behavior;

import org.fmamic.design.patterns.strategy.head.first.QuackBehavior;

public class Quack implements QuackBehavior {

    public void quack() {
        System.out.println("Quack");
    }

}
