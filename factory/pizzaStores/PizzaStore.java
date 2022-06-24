package factory.pizzaStores;

import factory.pizza.*;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();

        System.out.println("Your order:");
        pizza.getDescription();

        pizza.bake();
        pizza.cut();
        pizza.box();

        System.out.println("Bon appetit!");

        return pizza;
    }
    
    abstract Pizza createPizza(String type);
}
