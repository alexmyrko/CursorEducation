package homework8;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static List<Car> carsList = new ArrayList<>();
    static Map<UUID, Car> carsMap = new LinkedHashMap<>();

    public static void main(String[] args) {
        CarGenerator carGenerator = new CarGenerator();
        for (int i = 0; i < 500; i++) {
            carsList.add(carGenerator.generateCar());
        }

        List<Car> selectedCars = getCars(carsList);
        for (Car car : selectedCars)
            carsMap.put(car.getId(), car);

        System.out.println("Result of cars search:");
        for(Car car : carsMap.values())
            System.out.println(car.toString());
    }

    public static List<Car> getCars(List<Car> allCars){
        List<Car> cars = null;
        List<Car> carsFilteredByBrand = allCars.stream().filter(car -> car.getBrand() == Brand.TESLA || car.getBrand() == Brand.AUDI).collect(Collectors.toList());
        System.out.println("Cars filtered by brand:");
        printCars(carsFilteredByBrand);
        List<Car> carsFilteredByYear =  carsFilteredByBrand.stream().filter(car -> car.getYear() < 2018).collect(Collectors.toList());
        System.out.println("Cars filtered by brand and not older than 2018:");
        printCars(carsFilteredByYear);
        List<Car> carsFilteredByMileage = carsFilteredByYear.stream().filter(car -> car.getMileage() < 40000).collect(Collectors.toList());
        System.out.println("Cars filtered by brand, not older than 2018 and with mileage less than 40000:");
        printCars(carsFilteredByMileage);
        List<Car> carsSortedByPrice = carsFilteredByMileage.stream().sorted(Comparator.comparingInt(Car::getPrice)).collect(Collectors.toList());
        System.out.println("Cars filtered by brand, not older than 2018 with mileage less than 40000 and sorted by price: ");
        printCars(carsSortedByPrice);
        cars = carsSortedByPrice.stream().limit(3).collect(Collectors.toList());
        System.out.println("3 cheapest cars filtered by brand, not older than 2018 with mileage less than 40000 and sorted by price: ");
        printCars(cars);
        return cars;
    }

    public static void printCars(List<Car> cars){
        for (Car car : cars){
            System.out.println(car.toString());
        }
        System.out.println();
    }
}
