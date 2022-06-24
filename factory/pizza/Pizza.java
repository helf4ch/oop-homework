package factory.pizza;

import factory.ingredients.cheeses.*;
import factory.ingredients.doughs.*;
import factory.ingredients.sausages.*;
import factory.ingredients.sauses.*;
import factory.ingredients.veggies.*;

public abstract class Pizza {
    String name;
    Dough dough;
    Sause sause;
    Cheese cheese;
    Veggie[] veggies;
    Sausage sausage;

    public abstract void prepare();
    
    public void getDescription() {
        System.out.println(this.name);
        System.out.println("Ingredients:");
        System.out.println("Dough - " + this.dough.getDescription());
        System.out.println("Sause - " + this.sause.getDescription());
        System.out.println("Cheese - " + this.cheese.getDescription());
        System.out.println("Sausage - " + this.sausage.getDescription());
        System.out.print("Veggies: ");
        for (Veggie veggie : this.veggies) {
            System.out.print(veggie.getDescription() + "; ");
        }
        System.out.println();
    }

    public void bake() {
        System.out.println("Your pizza is baking!");
    }
    
    public void cut() {
        System.out.println("Now we are going to cut your pizza...");
    }
    
    public void box() {
        System.out.println("Now pizza in the box.");
    }
}
