package strategy_pattern;

public class NoFly implements IFlyStrategy {
    @Override
    public void fly() {
        System.out.println("NoFly");
    }
}
