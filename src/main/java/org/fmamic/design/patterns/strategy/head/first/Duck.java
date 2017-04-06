package org.fmamic.design.patterns.strategy.head.first;

public abstract class Duck {

    private FlyBehavior flyBehavior;

    private QuackBehavior quackBehavior;

    public void swim() {
        System.out.println("Swim");
    }

    public void display() {
        System.out.println("Display");
    }

    public void preformQuack() {
        getQuackBehavior().quack();
    }

    public void performFly() {
        getFlyBehavior().fly();
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(final FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(final QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
