// Used for reading input from various sources, 
// including user input from the console
// It provides methods for parsing primitive types and strings
import java.util.Scanner;

public class Introduction {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    // Add code below:
    System.out.println("What is your name?");
    String userName = input.next();
    System.out.printf("Hello %s! It's nice to meet you.", userName);
    
  }
}