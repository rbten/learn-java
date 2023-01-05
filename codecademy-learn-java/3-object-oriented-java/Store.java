public class Store {
  // scope of Store class starts after curly brace
  String productType;
  int inventoryCount;
  double inventoryPrice;

  // constructor
  public Store(String product) {
    productType = product;
  }

  public Store(String product, int count, double price) {
    productType = product;
    inventoryCount = count;
    inventoryPrice = price;
  }

  // greet method
  public void greetCustomer(String customer) {
    System.out.println("Welcome, "+customer+"!");
  }

  // advertise method
  public void advertise() {
    System.out.println("Come spend some money!");
    System.out.println("Selling "+productType+"!");
  }

  // increase price method
  public void increasePrice(double priceInflation) {
    double updatePrice = inventoryPrice + priceInflation;
    inventoryPrice = updatePrice;
  }

  // calculate total price method
  public double getTotalPrice(){
    double totalPrice = inventoryPrice+inventoryPrice*0.08;
    return totalPrice;
  }

  public static void main(String[] args) {
    //  scope of main() starts after curly brace
    //  program tasks

    // create the instance below
    Store lemonadeStand = new Store("lemonade", 10, 1.5);
    lemonadeStand.greetCustomer("Robert");
    System.out.println(lemonadeStand.inventoryPrice);
    lemonadeStand.increasePrice(0.5);
    System.out.println(lemonadeStand.inventoryPrice);
    double lemonadePrice = lemonadeStand.getTotalPrice();
    System.out.println(lemonadePrice);
    }
  // scope of main() ends after curly brace
}
// scope of Store class ends after curly brace