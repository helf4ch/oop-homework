package starbuzz;

public class MilkDecorator implements IBeverage {
    private int cost;
    private String description = "MilkDecorator";

    MilkDecorator(int cost, IBeverage wrappedObject) {
        this.cost = cost + wrappedObject.getCost();
        this.description = wrappedObject.getDescription() + " with " + this.description;
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
