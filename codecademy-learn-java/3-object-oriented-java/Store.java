public class Store {
  // scope of Store class starts after curly brace
  String productType;

  // new method: constructor!
  public Store(String product) {
    productType =product
  } 

  public static void main(String[] args) {
    //  scope of main() starts after curly brace
    System.out.println("Start of the main method.");
    //  program tasks

    // create the instance below
    Store lemonadeStand = new Store();

    System.out.println(lemonadeStand);

  }
  // scope of main() ends after curly brace
}
// scope of Store class ends after curly brace