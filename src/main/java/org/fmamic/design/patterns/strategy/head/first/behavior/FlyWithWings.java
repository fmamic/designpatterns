package org.fmamic.design.patterns.strategy.head.first.behavior;

import org.fmamic.design.patterns.strategy.head.first.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    public void fly() {
        System.out.println("Fly with wings");
    }

}
