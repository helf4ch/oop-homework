package starbuzz;

public class HouseBlend implements IBeverage {
    private int cost;
    private String description = "HouseBlend";

    HouseBlend(int cost) {
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
