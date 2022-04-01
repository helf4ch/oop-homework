package starbuzz;

public class Espresso implements IBeverage {
    private int cost;
    private String description = "Espresso";

    Espresso(int cost) {
        this.cost = cost;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
