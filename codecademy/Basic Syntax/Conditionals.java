class Conditionals {
    public static void main(String[] args) { 
      boolean breakfastTime = false;
      boolean lunchTime = false;
      boolean dinnerTime = true;
      if (breakfastTime) {
        System.out.println("Let's have waffles!");
      } else if (lunchTime) {
         System.out.println("Let's have sandwiches!");
      } else if (dinnerTime) {
         System.out.println("Let's have pizza!");
      } else {
         System.out.println("It's not time to eat!");
      }
    }
  }