/**
* A program can create a droid.
* A droid has two states: name, batteryLevel.
* The functions of program: Print a performing task and needed battery, exchange battery with another droid, check battery of a droid.
*/

public class Droid {
  // instance field
  String name;
  int batteryLevel;

  public String toString() {
    String sayHello = "Name droid: "+name;
    String myBattery = name+"\'s battery: "+batteryLevel+"\n";
    return sayHello+"\n"+myBattery;
  }

  // constructor
  public Droid(String droidName) {
    name = droidName;
    batteryLevel = 100;
  }

  // behavior
  public void performTask(String task) {
    System.out.println(name+" is performing task: "+ task);
    batteryLevel -= 10;
    System.out.println(task+" took 10 battery");
  }

  public void batteryTransfer(Droid aDroid, int batteryEx) {
    System.out.println("The batteries is exchanging...\n");
    batteryLevel += batteryEx;
    aDroid.batteryLevel -= batteryEx;
  }

  public void checkBattery() {
    System.out.println("Checking battery...");
    System.out.println("Battery: "+batteryLevel);
  }

  public static void main(String[] args) {
    Droid codeyDroid = new Droid("Codey");
    System.out.println(codeyDroid);
    Droid goproDroid = new Droid("Gopro");
    System.out.println(goproDroid);

    codeyDroid.batteryTransfer(goproDroid, -10);
    System.out.println(codeyDroid);
    System.out.println(goproDroid);
  }
}