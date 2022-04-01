package strategy_pattern;

public class NormalQuack implements IQuackStrategy {
    @Override
    public void quack() {
        System.out.println("NormalQuack");
    }
}