package factory.ingredientFactories;

import factory.ingredients.cheeses.*;
import factory.ingredients.doughs.*;
import factory.ingredients.sausages.*;
import factory.ingredients.sauses.*;
import factory.ingredients.veggies.*;

public interface IPizzaIngridientFactory {
    String getFactoryName();
    Dough createDough();
    Sause createSause();
    Cheese createCheese();
    Veggie[] createVeggies();
    Sausage createSausage();
}
