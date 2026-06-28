// Factory Method Pattern Example

// Vehicle interface
interface Vehicle {
    void start();
}

// Car class
class Car implements Vehicle {

    public void start() {
        System.out.println("Car is starting...");
    }
}

// Bike class
class Bike implements Vehicle {

    public void start() {
        System.out.println("Bike is starting...");
    }
}

// Bus class
class Bus implements Vehicle {

    public void start() {
        System.out.println("Bus is starting...");
    }
}

// Factory class
class VehicleFactory {

    public Vehicle getVehicle(String type) {

        if (type == null) {
            return null;
        }

        if (type.equalsIgnoreCase("Car")) {
            return new Car();
        }

        if (type.equalsIgnoreCase("Bike")) {
            return new Bike();
        }

        if (type.equalsIgnoreCase("Bus")) {
            return new Bus();
        }

        return null;
    }
}

// Main class
public class Main {

    public static void main(String[] args) {

        VehicleFactory factory = new VehicleFactory();

        Vehicle v1 = factory.getVehicle("Car");
        v1.start();

        Vehicle v2 = factory.getVehicle("Bike");
        v2.start();

        Vehicle v3 = factory.getVehicle("Bus");
        v3.start();
    }
}