public class Loops {
    public static void main(String[] args) {
      int num = 0;
  
      while (num < 10) {
        num++;
        if (num > 10) {
          break;
        }
      }
  
      do {
        System.out.println("Impossible!");
      } while (2 == 4);
  
      int[] myArray = new int[10];
  
      for (int i = 0; i < myArray.length; i++) {
        myArray[i] = i;
      }
  
      for (int x : myArray) {
        if (x % 2 == 0) {
          continue;
        }
        System.out.println(x);
      }
  
    }
  }