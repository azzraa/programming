import java.util.*;

class SetReview {
  public static void main(String[] args) {

    Set<String> colors = new HashSet<String>();
    colors.add("red");
    colors.add("orange");
    System.out.println(colors);
    if (colors.contains("red")){
      System.out.println("Set contains red");
    }

    Set<String> primary = new HashSet<String>();
    primary.add("red");
    primary.add("yellow");
    primary.add("green");
    primary.remove("green");
    for (String value: primary) {
      System.out.println(value);
    }

    colors.addAll(primary);
    colors.retainAll(primary);
    colors.removeAll(primary);
    System.out.println(colors); 

    System.out.println(colors.size());
  }
}