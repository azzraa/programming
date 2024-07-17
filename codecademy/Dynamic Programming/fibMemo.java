import java.util.HashMap;
import java.util.Map;

public class fibMemo {

  public static void main(String[] args) {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    System.out.println(fibMemo(10, map));

    map = new HashMap<Integer, Integer>();
    System.out.println(fibMemo(20, map));
  }

  public static int fibMemo(int n, Map<Integer, Integer> map) {


    return n;
  }

}