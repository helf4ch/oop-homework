package starbuzz;

public class Decaf implements IBeverage {
    private int cost;
    private String description = "Decaf";

    Decaf(int cost) {
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
