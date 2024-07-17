import java.util.ArrayList;
import java.util.LinkedList;

public class HelloWorld {
  public static void main(String[] args) {
    ArrayList<String> months = new ArrayList<String>(12);
    months.add("January");
    months.add("February");
    months.add("March");
    months.remove("February");
    System.out.println(months); 

    LinkedList<String> days = new LinkedList<String>();
    days.add("Monday");
    days.add("Tuesday");
    days.add(0, "Sunday");
    days.remove();
    System.out.println(days); 
  }
}