package strategy_pattern;

public class NormalDisplay implements IDisplayStrategy {
    @Override
    public void display() {
        System.out.println("NormalDisplay");
    }
}
