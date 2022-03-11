package com.company;

public class SilentQuack implements IQuackStrategy {
    @Override
    public void quack() {
        System.out.println("SilentQuack");
    }
}
