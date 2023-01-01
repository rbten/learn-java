public class Car {
  String color = "Red";
  int mpg = 4;
  boolean isElectric = false;

  // Constructor 1
  public Car(String carColor, int milesPerGallon) {
    color = carColor;
    mpg = milesPerGallon;
  }

  // Constructor 2
  public Car(boolean electricCar, int milesPerGallon) {
    isElectric = electricCar;
    mpg = milesPerGallon;
  }

  // Constructor 3
  public Car() {

  }

  public static void main(String[] args) {
    Car myFirstCar = new Car();
    System.out.println("Color: "+myFirstCar.color);
    System.out.println("MPG: "+myFirstCar.mpg);
    System.out.println("Electric: "+myFirstCar.isElectric+"\n");

    Car mySecondCar = new Car("Gray", 0);
    System.out.println("Color: "+mySecondCar.color);
    System.out.println("MPG: "+mySecondCar.mpg);
    System.out.println("Electric: "+mySecondCar.isElectric+"\n");

    Car myThirdCar = new Car(true, 10);
    System.out.println("Color: "+myThirdCar.color);
    System.out.println("MPG: "+myThirdCar.mpg);
    System.out.println("Electric: "+myThirdCar.isElectric+"\n");
  }
}