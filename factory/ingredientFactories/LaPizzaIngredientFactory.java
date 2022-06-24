package factory.ingredientFactories;

import factory.ingredients.cheeses.*;
import factory.ingredients.doughs.*;
import factory.ingredients.sausages.*;
import factory.ingredients.sauses.*;
import factory.ingredients.veggies.*;

public class LaPizzaIngredientFactory implements IPizzaIngridientFactory {
    
    @Override
    public String getFactoryName() {
        return "Los-Angeles";
    }

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sause createSause() {
        return new PlumTomatoSause();
    }

    @Override
    public Cheese createCheese() {
        return new CheddarCheese();
    }

    @Override
    public Veggie[] createVeggies() {
        Veggie[] veggies = { new Garlic(), new Onion() };
        return veggies;
    }

    @Override
    public Sausage createSausage() {
        return new RottenSausage();
    } 
}
