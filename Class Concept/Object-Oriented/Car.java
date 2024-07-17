public class Car {
    public String color;
    private int speed;
   
    public Car(String color, int speed) {
      // Variables color and speed accessible here
    }
   
    public void drive(boolean fourWheel) {
      // Variables color and speed accessible here
      fourWheel = true;
    }
  
    public static void main(String[] args) {
      Car ferrari = new Car("red", 200);
      System.out.println(ferrari.color);
      System.out.println(ferrari.speed);
    }
  }
  