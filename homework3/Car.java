package homework3;

public class Car {
    private int speed;
    private String brand;
    private int gear;
    private int maxConstructiveSpeed = 180;

    public Car(String brand){
        this.brand =  brand;
        System.out.println("Car is: " + brand);
    }

    public static void main(String[] args) {

    }

    public void start(){
        gear = 1;
        System.out.println("Car starts with gear " + gear);
    }

    public void stop(){
        gear = 0;
        System.out.println("Car stops. Gear is " + gear);
    }

    public void move(int gear){
        if (gear == 0 || gear > 5) {
            System.out.println("Gear " + gear + " does not exist");
            return;
        }
        this.gear = gear;
        System.out.println("Car moves on gear " + gear);
    }

    public void keepSpeed(int speed){
        if (speed < 0){
            System.out.println(speed + " kmPH does not exist for forward movement");
            return;
        }
        if (speed > maxConstructiveSpeed) {
            System.out.println(speed + " kmPH speed exceeds maximum constructive car speed");
            return;
        }
        this.speed = speed;
        System.out.println("Car keeps the speed " + this.speed + " kmPH");
    }
}
