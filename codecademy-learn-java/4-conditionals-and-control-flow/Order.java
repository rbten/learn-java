public class Order {
  boolean isFilled;
  double billAmount;
  String shipping;
  String couponCode;

  public Order (boolean filled, double cost, String shippingMethod, String coupon) {
    if (cost > 24.00) {
      System.out.println("Hight value item!");
    }

    isFilled = filled;
    billAmount = cost;
    shipping = shippingMethod;
    couponCode = coupon;
  }

  public void ship() {
    if (isFilled) {
      System.out.println("Shipping");
      System.out.println("Shipping cost: "+calculateShipping());
    } else {
      System.out.println("Order not ready");
    }
  }

  public double calculateShipping() {
    if (shipping.equals("Regular")) {
      return 0;
    } else if (shipping.equals("Express")) {
      if (couponCode.equals("ship50")) {
        return 0.75;
      } else {
        return 1.75;
      }
    } else {
      return 0.5;
    }
  }

  public static void main(String[] args) {
    Order book = new Order(true, 9.99, "Express", "ship50");
    Order chemistrySet = new Order(true, 72.50, "Regular", "freeship");

    book.ship();
    chemistrySet.ship();
  }
}