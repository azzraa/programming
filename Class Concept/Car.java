public class Car {
  // Fields with access modifiers
  public String color;
  private int speed;
 
  // Constructor
  public Car(String color, int speed) {
      this.color = color;
      this.speed = speed;
  }
 
  // Method to simulate driving
  public void drive(boolean fourWheel) {
      // Simulate the car driving
      fourWheel = true;
  }

  public int getSpeed() {
      return speed;
  }

  public void setSpeed(int speed) {
      this.speed = speed;
  }

  public static void main(String[] args) {
      Car ferrari = new Car("red", 200);
      System.out.println(ferrari.color); // Output: red
      System.out.println(ferrari.getSpeed()); // Output: 200
  }
}
