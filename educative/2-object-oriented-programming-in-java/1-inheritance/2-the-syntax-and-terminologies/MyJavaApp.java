import java.util.Scanner;

// Base Class Vehicle
class Vehicle {

    // Private Fields
    private String make;
    private String color;
    private int year;
    private String model;

    // Parameterized Constructor
    public Vehicle(String make, String color, int year, String model) {
        this.make = make;
        this.color = color;
        this.year = year;
        this.model = model;
    }

    // public method to print details
    public void printDetails() {
        System.out.println("Manufacturer: " + make);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Model: " + model);
    }
}

// Derived Class Car

class Car extends Vehicle {

    // Private field
    private String bodyStyle;

    // Parameterized Constructor
    public Car(String make, String color, int year, String model, String bodyStyle) {
        // Calling parent class constructor
        super(make, color, year, model); 
        this.bodyStyle = bodyStyle;
    }
}


public class MyJavaApp {

    public static void main(String[] args) {
        
        Car X7 = new Car("BWM", "Black", 2025, "M60i","SUV");
        X7.printDetails();

    }
}