public class BurritoCalculator {
    public static boolean hasLeftoverFunds(int burritoCost) {
      int budget = 100;
      int numBurritos = 0;
      
      while (budget >= burritoCost) {
        numBurritos++;
        budget -= burritoCost;
      }
  
      System.out.println("Remaining budget: " + budget);
      return budget > 0;
    }
      
    public static void main(String []args) {
      System.out.println(hasLeftoverFunds(7)); 
      System.out.println(hasLeftoverFunds(10)); 
    }
  }
  
  