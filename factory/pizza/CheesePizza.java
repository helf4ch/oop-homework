package factory.pizza;

import factory.ingredientFactories.*;;

public class CheesePizza extends Pizza {
    private IPizzaIngridientFactory ingredientFactory;

    public CheesePizza(IPizzaIngridientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        this.name = "Cheese Pizza from " + ingredientFactory.getFactoryName() + ".";
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
