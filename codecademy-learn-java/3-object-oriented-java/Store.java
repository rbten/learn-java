public class Store {
  // scope of Store class starts after curly brace
  String productType;
  int inventoryCount;
  double inventoryPrice;

  // constructor
  public Store(String product) {
    productType = product;
  } 

  // advertise method
  public void advertise() {
    System.out.println("Come spend some money!");
    System.out.println("Selling "+productType+"!");
  }

  public Store(String product, int count, double price) {
    productType = product;
    inventoryCount = count;
    inventoryPrice = price;
  }

  public static void main(String[] args) {
    //  scope of main() starts after curly brace
    //  program tasks

    // create the instance below
    Store lemonadeStand = new Store("lemonade");
    System.out.println(lemonadeStand.productType);

    Store cookieShop = new Store("cookies", 12, 37.5);
    System.out.println("Name: "+cookieShop.productType);
    System.out.println("Amount: "+cookieShop.inventoryCount);
    System.out.println("Price: "+cookieShop.inventoryPrice);
    }
  // scope of main() ends after curly brace
}
// scope of Store class ends after curly brace