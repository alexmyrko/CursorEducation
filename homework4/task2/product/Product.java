package homework4.task2.product;

import homework4.task2.AgeRestriction;
import homework4.task2.interfaces.Buyable;

public abstract class Product implements Buyable {
    private String name;
    private double price;
    private int quantity;
    private AgeRestriction ageRestriction;


    public Product(String name, double price, int quantity, AgeRestriction ageRestriction) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.ageRestriction = ageRestriction;
    }

    public String getName() {
        return name;
    }


    public int getQuantity() {
        return quantity;
    }

    public AgeRestriction getAgeRestriction() {
        return ageRestriction;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
