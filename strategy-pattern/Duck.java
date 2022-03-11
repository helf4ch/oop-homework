package com.company;

public class Duck {
    private IQuackStrategy quackStrategy;
    private ISwimStrategy swimStrategy;
    private IFlyStrategy flyStrategy;
    private IDisplayStrategy displayStrategy;

    Duck(IQuackStrategy quackStrategy, ISwimStrategy swimStrategy, IFlyStrategy flyStrategy, IDisplayStrategy displayStrategy) {
        this.quackStrategy = quackStrategy;
        this.swimStrategy = swimStrategy;
        this.flyStrategy = flyStrategy;
        this.displayStrategy = displayStrategy;
    }

    void quack() {
        quackStrategy.quack();
    }

    void swim() {
        swimStrategy.swim();
    }

    void fly() {
        flyStrategy.fly();
    }

    void display() {
        displayStrategy.display();
    }
}
