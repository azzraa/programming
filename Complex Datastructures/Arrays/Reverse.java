public class Reverse {
    public static void reverseGroceries(String[] groceryList) {
    int j = groceryList.length - 1;
    for (int i = 0; i < groceryList.length/2; i++) {
      String temp = groceryList[i];
      groceryList[i] = groceryList[j];
      groceryList[j] = temp;
      j--;
    }
  }
  
    public static void main(String[] args) {
      String[] groceryList = {"apples", "banana", "Apples", "chocolate"};
      reverseGroceries(groceryList);
  
      for (String item : groceryList) {
        System.out.println(item);
      }
    }
  }
  