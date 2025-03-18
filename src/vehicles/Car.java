package vehicles;

import interfaces.Movable;

public final class Car extends Vehicle implements Movable {
    private int seats;

    public int getSeats() {
        return seats;
    }

    public Car() {
        super();
        this.seats = 4;
    }

    public Car(String brand, String model, int seats) {
        super(brand, model);
        this.seats = seats;
    }

    @Override
    public void start() {
        System.out.println("Car is starting with ignition.");
    }

    @Override
    public void move() {
        System.out.println(brand + " " + model + " is driving.");
    }

    public void accelerate() {
        System.out.println("Car is accelerating.");
    }

    public void accelerate(int speed) {
        System.out.println("Car is accelerating to " + speed + " mph.");
    }
}

