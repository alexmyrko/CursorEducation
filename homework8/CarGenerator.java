package homework8;

import java.util.Calendar;
import java.util.Random;
import java.util.UUID;

public class CarGenerator {
    public Brand generateBrand(){
        int n = new Random().nextInt(Brand.values().length);
        return Brand.values()[n];
    }

    public UUID generateId(){
        return UUID.randomUUID();
    }

    public int generateYear(){
        int minYear = 1960;
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return minYear + new Random().nextInt(currentYear - minYear);
    }

    public int generatePrice(){
        int minPrice = 1000;
        int maxPrice = 70_000;
        return minPrice + new Random().nextInt(maxPrice - minPrice) / 100 * 100;
    }

    public int generateMileage(){
        return new Random().nextInt(1_000_000);
    }
}
