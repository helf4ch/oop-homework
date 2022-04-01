package starbuzz;

public class DarkRoast implements IBeverage {
    private int cost;
    private String description = "DarkRoast";

    DarkRoast(int cost) {
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
