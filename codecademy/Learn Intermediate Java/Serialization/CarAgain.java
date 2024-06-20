import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CarAgain implements Serializable {
  private String make;
  private int year;
  private Engine engine;
  private static final long serialVersionUID = 1L;

  public CarAgain(String make, int year) {
    this.make = make;
    this.year = year;
    this.engine = new Engine(2.4, 6);
  }

  public String toString() {
    return String.format("Car make is: %s, Car year is: %d, %s", this.make, this.year, this.engine);
  }

  public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
    CarAgain toyota = new CarAgain("Toyota", 2021);
    CarAgain honda = new CarAgain("Honda", 2020);
    FileOutputStream fileOutputStream = new FileOutputStream("cars.txt");
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
    objectOutputStream.writeObject(toyota);
    objectOutputStream.writeObject(honda);

    FileInputStream fileInputStream = new FileInputStream("cars.txt");
    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

    CarAgain toyotaCopy = (CarAgain) objectInputStream.readObject();
    CarAgain hondaCopy = (CarAgain) objectInputStream.readObject();

    boolean isSameObject = toyotaCopy == toyota;
    System.out.println("Toyota (Copy) - "+toyotaCopy);
    System.out.println("Toyota (Original) - "+toyota);
    System.out.println("Is same object: "+ isSameObject);
  }
}