package org.fmamic.design.patterns.strategy.head.first.behavior;

import org.fmamic.design.patterns.strategy.head.first.FlyBehavior;

public class FlyWithPlane implements FlyBehavior {

    public void fly() {
        System.out.println("Fly with Plane");
    }

}
