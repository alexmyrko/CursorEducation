package homework4.task2;

import homework4.task2.exceptions.AgeRestrictionException;
import homework4.task2.exceptions.NotEnoughMoneyException;
import homework4.task2.exceptions.OutOfStockException;
import homework4.task2.product.Product;

public class Customer {
    private String name;
    private int age;
    private double balance;

    public Customer(String name, int age, double balance){
        this.name = name;
        this.age = age;
        this.balance = balance;
    }

    public void buy(Product product) throws OutOfStockException, AgeRestrictionException, NotEnoughMoneyException {
        if ((product.getAgeRestriction() == AgeRestriction.TEENAGER && getAge() < 13) ||
                (product.getAgeRestriction() == AgeRestriction.ADULT && getAge() < 19))
            throw new AgeRestrictionException(getName() + " has age restriction for " + product.getName() + "\n");

        if (getBalance() < product.getPrice())
            throw new NotEnoughMoneyException(getName() + " has balance " + getBalance() + ", but item price is " + product.getPrice()+"\n");

        if (product.getQuantity() == 0)
            throw new OutOfStockException(product.getName() + " is out of stock\n");

        product.setQuantity(product.getQuantity() - 1);
        setBalance(getBalance() - product.getPrice());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        String result = String.format("name: %s\nage: %d\nbalance: %.2f\n", getName(), getAge(), getBalance());
        return result;
    }
}
