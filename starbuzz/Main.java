package starbuzz;

public class Main {
    public static void main(String[] args) {
        IBeverage orderedBeverage = new SoyDecorator(25, new WhipDecorator(10, new MochaDecorator(20, new MilkDecorator(15, new HouseBlend(70)))));
        
        System.out.println(orderedBeverage.getDescription());
        System.out.println(orderedBeverage.getCost());
    }
}
