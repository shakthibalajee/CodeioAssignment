package Week4.Abstraction;

abstract class Vehicle{
    abstract void start();
    abstract void stop();
}

class Car extends Vehicle{
    @Override
    void start(){
        System.out.println("Car engine started");
    }
    void stop(){
        System.out.println("Car ignition stopped");
    }
}

class Bike extends Vehicle{
    @Override
    void start(){
        System.out.println("Bike engine started");
    }
    void stop(){
        System.out.println("Bike ignition stopped");
    }
}

public class VehicleControlSystem {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.start();
        bike.start();
        car.stop();
        bike.stop();
    }
}
