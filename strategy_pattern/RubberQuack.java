package strategy_pattern;

public class RubberQuack implements IQuackStrategy {
    @Override
    public void quack() {
        System.out.println("RubberQuack");
    }
}
