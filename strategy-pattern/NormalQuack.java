package com.company;

public class NormalQuack implements IQuackStrategy {
    @Override
    public void quack() {
        System.out.println("NormalQuack");
    }
}