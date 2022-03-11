package com.company;

public class RubberQuack implements IQuackStrategy {
    @Override
    public void quack() {
        System.out.println("RubberQuack");
    }
}
