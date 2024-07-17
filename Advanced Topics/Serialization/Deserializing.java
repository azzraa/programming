import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Deserializing implements Serializable {
  private String make;
  private int year;
  private static final long serialVersionUID = 1L;

  public Deserializing(String make, int year) {
    this.make = make;
    this.year = year;
  }

  public String toString(){
    return String.format("Car make is: %s, Car year is: %d", this.make, this.year);
  }

  public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
    Deserializing toyota = new Deserializing("Toyota", 2021);
    Deserializing honda = new Deserializing("Honda", 2020);
    FileOutputStream fileOutputStream = new FileOutputStream("cars.txt");
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
    objectOutputStream.writeObject(toyota);
    objectOutputStream.writeObject(honda);

    FileInputStream fileInputStream = new FileInputStream("cars.txt");
    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
 
    Deserializing toyotaCopy = (Deserializing) objectInputStream.readObject();
    Deserializing hondaCopy = (Deserializing) objectInputStream.readObject();

    boolean isSameObject = toyotaCopy == toyota;
    System.out.println("Toyota (Copy) - "+ toyotaCopy);
    System.out.println("Toyota (Original) - "+ toyota);
    System.out.println("Is same object: "+ isSameObject);
  }
}