public class Duplicate {
    public static boolean hasDuplicates(String[] groceryList) {
     for (int i = 0; i < groceryList.length - 1; i++) {
       for (int j = i + 1; j < groceryList.length; j++) {
         if (groceryList[i] == groceryList[j]) {
          return true; 
         }
       }
     }
     return false;
   }
   
   
     public static void main(String[] args) {
       String[] groceryList = {"apples", "banana", "Apples", "chocolate"};
       System.out.println(hasDuplicates(groceryList));
     }
   }
   