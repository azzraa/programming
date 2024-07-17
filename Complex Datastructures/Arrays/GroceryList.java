public class GroceryList {
    public static double getTotalCost(double[] groceryPrices) {
    double totalCost = 0.0;
    for (double itemCost : groceryPrices) {
      totalCost += itemCost;
    }
    return totalCost;
  }
  
    public static void main(String[] args) {
      double[] groceryPrices = {10.0, 12.3, 8.45, 2.43};
      System.out.println(getTotalCost(groceryPrices));
      
      double[] unlikelyGroceryPrices = {100.23, -100.23, 0.0, -78.54};
      System.out.println(getTotalCost(unlikelyGroceryPrices));
    }
  }
  