package homework4.task2;

import homework4.task2.exceptions.AgeRestrictionException;
import homework4.task2.exceptions.NotEnoughMoneyException;
import homework4.task2.exceptions.OutOfStockException;
import homework4.task2.product.Appliance;
import homework4.task2.product.Computer;
import homework4.task2.product.FoodProduct;
import homework4.task2.product.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static List<Product> products = new ArrayList<>();
    public static List<Customer> customers = new ArrayList<>();
    public static void main(String[] args) throws AgeRestrictionException, NotEnoughMoneyException, OutOfStockException {

        // Define and add products to products list
        FoodProduct chocolate = new FoodProduct("Chocolate Milka 500g", 5, 2, AgeRestriction.NONE, "15.02.2021");
        FoodProduct whisky = new FoodProduct("Whisky Grant 12 y.o. 0.7", 20, 1, AgeRestriction.ADULT, "01.07.2025");
        Appliance blender = new Appliance("Blender Philips", 37.5, 1, AgeRestriction.NONE);
        Computer notebook = new Computer("HP Probook G7", 500, 1, AgeRestriction.NONE);
        FoodProduct cigarettes = new FoodProduct("Cigarettes Winston", 2.2, 3, AgeRestriction.ADULT, "10.12.2022");
        FoodProduct cheese = new FoodProduct("Camabert", 4, 15, AgeRestriction.NONE, "27.01.2021");
        products.add(whisky);
        products.add(blender);
        products.add(notebook);
        products.add(chocolate);
        products.add(cheese);
        products.add(cigarettes);

        // Define and add customers to customers list
        Customer joeBiden = new Customer("Joe Biden", 70, 1500);
        Customer gretta = new Customer("Gretta Tumberg", 16, 300);
        Customer umberto = new Customer("Umberto Sanchez", 27, 15);
        Customer erich = new Customer("Erich Shtrulmahn", 47, 2300);
        Customer lisa = new Customer("Lisa Lindholm", 12, 50);
        customers.add(joeBiden);
        customers.add(gretta);
        customers.add(umberto);
        customers.add(erich);
        customers.add(lisa);

        // using processPurchase method and printing results after
        PurchaseManager.processPurchase(chocolate, gretta);
        PurchaseManager.processPurchase(whisky, joeBiden);
        PurchaseManager.processPurchase(whisky, gretta);
        PurchaseManager.processPurchase(whisky,umberto);
        PurchaseManager.processPurchase(notebook, erich);
        PurchaseManager.processPurchase(blender, erich);
        System.out.println(whisky.toString());
        System.out.println(chocolate.toString());
        System.out.println(gretta.toString());
        System.out.println(erich.toString());

        //  Filtering expirable products and geting the name of the first product with the soonest date of expiration
        Optional<Product> firstExpired = products.stream().filter(product -> product instanceof FoodProduct).
                sorted(Comparator.comparing(product -> ((FoodProduct) product).getExpirationDate())).findFirst();

        //  Filtering all products with adult age restriction and sorting them by price in ascending order
        List<Product> forAdults = products.stream().filter(product -> product instanceof FoodProduct).
                filter(product -> ((FoodProduct) product).getAgeRestriction() == AgeRestriction.ADULT).
                sorted(Comparator.comparing(product -> ((FoodProduct) product).getPrice())).collect(Collectors.toList());

        System.out.println(firstExpired.get().getName());
        System.out.println();

        for (Product product : forAdults)
            System.out.println(product.toString());
    }

    public static class PurchaseManager {

        public static void processPurchase(Product product, Customer customer) {
            for (Product item : products){
                if (item.getName().equals(product.getName())) {
                    try {
                        customer.buy(item);
                    } catch (OutOfStockException e) {
                        System.out.println(e.getMessage());
                    } catch (AgeRestrictionException e) {
                        System.out.println(e.getMessage());
                    } catch (NotEnoughMoneyException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        }
    }
}

