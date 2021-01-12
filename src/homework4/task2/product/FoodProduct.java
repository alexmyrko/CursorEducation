package homework4.task2.product;

import homework4.task2.AgeRestriction;
import homework4.task2.interfaces.Expirable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class FoodProduct extends Product implements Expirable {
    private Date expirationDate;

    public FoodProduct(String name, double price, int quantity, AgeRestriction ageRestriction, String expirationDate){
        super(name, price, quantity, ageRestriction);
        try {
            this.expirationDate = new SimpleDateFormat("dd.MM.yyyy").parse(expirationDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


    @Override
    public double getPrice() {
        Date now = new Date();
        long days15 = ChronoUnit.DAYS.between(getExpirationDate().toInstant(), now.toInstant());
        if ((expirationDate.getTime() - now.getTime()) < days15)
            return super.getPrice() * 0.7;
        else return super.getPrice();
    }

    @Override
    public Date getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String toString() {
        String result = String.format("name: %s\nprice: %.2f\nquantity: %d\nage restriction: %s\n",
                getName(), getPrice(), getQuantity(), getAgeRestriction().toString());
        return result + getExpirationDate().toString() + "\n";
    }
}
