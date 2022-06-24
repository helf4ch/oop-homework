package factory.pizza;

import factory.ingredientFactories.*;

public class GreekPizza extends Pizza{
    private IPizzaIngridientFactory ingredientFactory;

    public GreekPizza(IPizzaIngridientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        this.name = "Greek Pizza from " + ingredientFactory.getFactoryName() + ".";
    }

    @Override
    public void prepare() {
        this.dough = ingredientFactory.createDough();
        this.sause = ingredientFactory.createSause();
        this.cheese = ingredientFactory.createCheese();
        this.veggies = ingredientFactory.createVeggies();
        this.sausage = ingredientFactory.createSausage();
    }
}
