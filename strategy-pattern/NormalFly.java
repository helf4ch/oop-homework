package com.company;

public class NormalFly implements IFlyStrategy {
    @Override
    public void fly() {
        System.out.println("NormalFly");
    }
}
