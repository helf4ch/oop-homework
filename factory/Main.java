package factory;

import factory.pizzaStores.*;

public class Main {
    public static void main(String[] args) {
        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        chicagoPizzaStore.orderPizza("cheese");

        System.out.println();

        LaPizzaStore laPizzaStore = new LaPizzaStore();
        laPizzaStore.orderPizza("greek");

        System.out.println();

        NyPizzaStore nyPizzaStore = new NyPizzaStore();
        nyPizzaStore.orderPizza("pepperoni");
    }
}
