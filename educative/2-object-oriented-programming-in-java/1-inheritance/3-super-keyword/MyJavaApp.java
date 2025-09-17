class Vehicle {
    
    int fuelCap = 90;
    private String make;
    private String color;
    private int year;
    private String model;

    public Vehicle(String make, String color, int year, String model) {
        this.make = make;
        this.color = color;
        this.year = year;
        this.model = model;
    }
    
    public void printDetails() {
        System.out.println("Manufacturer: " + make);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Model: " + model);
    }

    public void display() {
        System.out.println("I am from the the Vehicle class");
    }
}

class Car extends Vehicle {
    int fuelCap = 50;
    private String bodyStyle;

    public Car(String make, String color, int year, String model, String bodyStyle) {
        super(make, color, year, model);
        this.bodyStyle = bodyStyle;
    }
    
    public void carDetails() {
        super.printDetails();
        System.out.println("Body style: " + bodyStyle);
    }

    public void display() {
        System.out.println("Fuel Capacity from the Vehicle class: " + super.fuelCap);
        System.out.println("Fuel Capacity from the Car class: " + fuelCap);
    }

    public void printOut() {
        super.display();
    }
}

public class MyJavaApp {
    public static void main(String[] args) {
        Car corolla = new Car("Toyota", "White", 2025, "LE", "Sedan");
        corolla.carDetails();
    }
}