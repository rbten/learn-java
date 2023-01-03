public class Car {
  String nameOfCar = "CX-5";
  String color = "Gray";
  int mpg = 20;
  int milesDriven = 0;
  boolean isElectric = false;

  // Constructor 1
  public Car(String carName, String carColor, int milesPerGallon) {
    nameOfCar = carName;
    color = carColor;
    mpg = milesPerGallon;
  }

  // Constructor 2
  public Car(String carName, int milesPerGallon, boolean electricCar) {
    nameOfCar = carName;
    mpg = milesPerGallon;
    isElectric = electricCar;
  }

  // Constructor 3
  public Car() {
  }

  // Constructor 4
  public Car(String carName, String carColor, int carMilesPerGallon, int carMilesDriven, boolean electricCar) {
    nameOfCar = carName;
    color = carColor;
    mpg = carMilesPerGallon;
    milesDriven = carMilesDriven;
    isElectric = electricCar;
  }

  // Start engine method
  public void startEngine() {
    System.out.println("Start "+nameOfCar);
    System.out.println("Vroom!");
    System.out.println("Vroom!");
    System.out.println("Vroom!");
  }

  public void showCar() {
    System.out.println("Name: "+nameOfCar);
    System.out.println("Color: "+color);
    System.out.println("MPG: "+mpg);
    System.out.println("Miles driven: "+milesDriven);
    System.out.println("Electric: "+isElectric);
  }

  public static void main(String[] args) {
    // Object 1
    Car myFirstCar = new Car();    
    myFirstCar.startEngine();

    // Object 2
    Car mySecondCar = new Car("C300", "Black", 0);

    // Object 3
    Car myThirdCar = new Car("Vios", 10, true);
  }
}