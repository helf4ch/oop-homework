package strategy_pattern;

public class SilentQuack implements IQuackStrategy {
    @Override
    public void quack() {
        System.out.println("SilentQuack");
    }
}
