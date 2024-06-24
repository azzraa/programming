import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Fields implements Serializable {
  private String make;
  private int year;
  private static final long serialVersionUID = 1L;
  private transient String model;

  public Fields(String make, int year, String model) {
    this.make = make;
    this.year = year;
    this.model = model;
  }

  public String toString(){
    return String.format("Car make is: %s, Car year is: %d, Car model is: %s, serialVersionUID: %d", this.make, this.year, this.model, serialVersionUID);
  }

  public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
    Fields toyota = new Fields("Toyota", 2021, "Corolla");
    Fields honda = new Fields("Honda", 2020, "Civic");
    FileOutputStream fileOutputStream = new FileOutputStream("cars.txt");
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
    objectOutputStream.writeObject(toyota);
    objectOutputStream.writeObject(honda);

    FileInputStream fileInputStream = new FileInputStream("cars.txt");
    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

    Car toyotaCopy = (Car) objectInputStream.readObject();
    Car hondaCopy = (Car) objectInputStream.readObject();

    System.out.println("Toyota (Copy) - "+ toyotaCopy);
    System.out.println("Toyota (Original) - "+ toyota);
  }
}