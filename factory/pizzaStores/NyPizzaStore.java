package factory.pizzaStores;

import factory.pizza.*;
import factory.ingredientFactories.*;

public class NyPizzaStore extends PizzaStore {
    
    @Override
    public Pizza createPizza(String type) {
        Pizza piza = null;
        IPizzaIngridientFactory ingredientFactory = new NyPizzaIngredientsFactory();
        
        if (type.equals("cheese")) {
            piza = new CheesePizza(ingredientFactory);
        } else if (type.equals("greek")) {
            piza = new GreekPizza(ingredientFactory);
        } else if (type.equals("pepperoni")) {
            piza = new PepperoniPizza(ingredientFactory);
        }

        return piza;
    }
}
