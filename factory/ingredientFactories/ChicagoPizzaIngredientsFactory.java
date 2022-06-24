package factory.ingredientFactories;

import factory.ingredients.cheeses.*;
import factory.ingredients.doughs.*;
import factory.ingredients.sausages.*;
import factory.ingredients.sauses.*;
import factory.ingredients.veggies.*;

public class ChicagoPizzaIngredientsFactory implements IPizzaIngridientFactory {
    
    @Override
    public String getFactoryName() {
        return "Chicago";
    }

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sause createSause() {
        return new BarbecueSause();
    }

    @Override
    public Cheese createCheese() {
        return new ParmesanCheese();
    }

    @Override
    public Veggie[] createVeggies() {
        Veggie[] veggies = { new Olives(), new Onion(), new ChilliPeper() };
        return veggies;
    }

    @Override
    public Sausage createSausage() {
        return new RottenSausage();
    } 
}
