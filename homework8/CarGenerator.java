package homework8;

import java.util.Calendar;
import java.util.Random;
import java.util.UUID;

public class CarGenerator {
    private Brand generateBrand(){
        int n = new Random().nextInt(Brand.values().length);
        return Brand.values()[n];
    }

    private UUID generateId(){
        return UUID.randomUUID();
    }

    private int generateYear(){
        int minYear = 1960;
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return minYear + new Random().nextInt(currentYear - minYear);
    }

    private int generatePrice(){
        int minPrice = 1000;
        int maxPrice = 70_000;
        return minPrice + new Random().nextInt(maxPrice - minPrice) / 100 * 100;
    }

    private int generateMileage(){
        return new Random().nextInt(1_000_000);
    }

    public Car generateCar(){
        UUID id = generateId();
        Brand brand = generateBrand();
        int year = generateYear();
        int price = generatePrice();
        int mileage = generateMileage();
        return new Car(id, brand, year, mileage, price);
    }
}
