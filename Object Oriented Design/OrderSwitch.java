public class OrderSwitch {
  // Instance variables
  boolean isFilled;
  double billAmount;
  String shipping;

  // Constructor
  public OrderSwitch(boolean filled, double cost, String shippingMethod) {
      if (cost > 24.00) {
          System.out.println("High value item!");
      }
      isFilled = filled;
      billAmount = cost;
      shipping = shippingMethod;
  }

  // Method to ship the order
  public void ship() {
      if (isFilled) {
          System.out.println("Shipping");
          System.out.println("Shipping cost: " + calculateShipping());
      } else {
          System.out.println("Order not ready");
      }
  }

  // Method to calculate shipping cost
  public double calculateShipping() {
      double shippingCost;
      // Switch statement to determine shipping cost
      switch (shipping) {
          case "Regular":
              shippingCost = 0;
              break;
          case "Express":
              shippingCost = 1.75;
              break;
          default:
              shippingCost = 0.50;
      }
      return shippingCost;
  }

  public static void main(String[] args) {
      // Create OrderSwitch objects
      OrderSwitch book = new OrderSwitch(true, 9.99, "Express");
      OrderSwitch chemistrySet = new OrderSwitch(false, 72.50, "Regular");

      // Call ship method on the objects
      book.ship();
      chemistrySet.ship();
  }
}
