package homework4.task2.product;

import homework4.task2.AgeRestriction;

public abstract class ElectronicsProduct extends Product{

    public ElectronicsProduct(String name, double price, int quantity, AgeRestriction ageRestriction) {
        super(name, price, quantity, ageRestriction);
    }
}
