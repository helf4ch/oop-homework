package strategy_pattern;

public class NormalSwim implements ISwimStrategy {
    @Override
    public void swim() {
        System.out.println("NormalSwim");
    }
}
