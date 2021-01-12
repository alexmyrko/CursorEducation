package homework4.task2.product;

import homework4.task2.AgeRestriction;

public class Appliance extends ElectronicsProduct{

    public Appliance(String name, double price, int quantity, AgeRestriction ageRestriction){
        super(name, price,quantity, ageRestriction);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }
}
