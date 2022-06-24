package factory.ingredientFactories;

import factory.ingredients.cheeses.*;
import factory.ingredients.doughs.*;
import factory.ingredients.sausages.*;
import factory.ingredients.sauses.*;
import factory.ingredients.veggies.*;

public class NyPizzaIngredientsFactory implements IPizzaIngridientFactory {

    @Override
    public String getFactoryName() {
        return "New-York";
    }

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sause createSause() {
        return new MarinaraSause();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggie[] createVeggies() {
        Veggie[] veggies = { new Tomatos(), new ChilliPeper() };
        return veggies;
    }

    @Override
    public Sausage createSausage() {
        return new PeperoniSausage();
    }
}
