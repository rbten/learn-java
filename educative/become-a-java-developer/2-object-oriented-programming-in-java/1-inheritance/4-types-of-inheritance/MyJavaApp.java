// Base Vehicle class
class Vehicle {

    private int topSpeed;

    public void setTopSpeed(int speed) {
        this.topSpeed = speed;
        // System.out.println("The top speed is set to: " + topSpeed);
        System.out.println("The top speed of " + getClass().getSimpleName() + " is set to: " + topSpeed);
    }
}


// Single inheritance
class Car extends Vehicle {
    
    public void openTrunk() {
        System.out.println("The car trunk is Open Now");
    }
}

// Hierarchical inheritance
class Truck extends Vehicle {

}


// Multi-level inheritance
class Prius extends Car {

    public void turnOnHybrid() {
        System.out.println("The Hybrid mode is turned on!");
    }
}

public class MyJavaApp {
    public static void main(String[] args) {
        // Prius priusPrime = new Prius();
        // priusPrime.setTopSpeed(320);
        // priusPrime.openTrunk();
        // priusPrime.turnOnHybrid();

        Car corolla = new Car();
        corolla.setTopSpeed(220);

        Truck volvo = new Truck();
        volvo.setTopSpeed(120);
    }
}