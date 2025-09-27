class Vehicle {
    private String speed;
    private String model;

    public Vehicle() {
        speed = "100";
        model = "Tesla";
    }

    public String getSpeed() {
        return speed;
    }

    public String getModel() {
        return model;
    }
}

// Derived class
class Car extends Vehicle {
    public String name;

    public Car() {
        name = "";
    }

    public void setDetails(String name) {
        this.name = name;
    }

    public String getDetails(String carName) {
        String details = "";
        
        details = carName + ", " + getSpeed() + ", " + getModel();

        return details;
    }
}



public class MyJavaApp {
    public static void main(String[] args) {
        Car aTesla = new Car();
        System.out.println(aTesla.getDetails("X"));

    }
}