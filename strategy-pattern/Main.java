package com.company;

public class Main {

    public static void DuckTest(Duck duck) {
        duck.quack();
        duck.swim();
        duck.fly();
        duck.display();
    }

    public static void main(String[] args) {
        Duck normalDuck = new Duck(new NormalQuack(), new NormalSwim(), new NormalFly(), new NormalDisplay());
        Duck silentDuck = new Duck(new SilentQuack(), new NormalSwim(), new NormalFly(), new NormalDisplay());
        Duck rubberDuck = new Duck(new RubberQuack(), new NormalSwim(), new NoFly(), new NormalDisplay());

        DuckTest(normalDuck);
        DuckTest(silentDuck);
        DuckTest(rubberDuck);
    }
}
