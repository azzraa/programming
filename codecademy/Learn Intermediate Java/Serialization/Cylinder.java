import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Cylinder implements Serializable {
  private String make;
  private int year;
  private static final long serialVersionUID = 1L;
  private Engine engine;

  public Cylinder(String make, int year) {
    this.make = make;
    this.year = year;
  }

 private void writeObject(ObjectOutputStream stream) throws IOException {
    stream.writeObject(this.make);
    stream.writeInt(this.year); 
  }
 
  private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
    this.make = (String) stream.readObject();
    this.year = (int) stream.readInt();
    double liters = (double) stream.readDouble();
    int cylinders = (int) stream.readInt();
  }    


  public String toString(){
    return String.format("Car make is: %s, Car year is: %d, %s", this.make, this.year, this.engine);
  }

  public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
    Cylinder toyota = new Cylinder("Toyota", 2021);
    Cylinder honda = new Cylinder("Honda", 2020);
    FileOutputStream fileOutputStream = new FileOutputStream("cars.txt");
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
    objectOutputStream.writeObject(toyota);
    objectOutputStream.writeObject(honda);

    FileInputStream fileInputStream = new FileInputStream("cars.txt");
    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

    Cylinder toyotaCopy = (Cylinder) objectInputStream.readObject();
    Cylinder hondaCopy = (Cylinder) objectInputStream.readObject();

    boolean isSameObject = toyotaCopy == toyota;
    System.out.println("Toyota (Copy) - "+toyotaCopy);
    System.out.println("Toyota (Original) - "+toyota);
    System.out.println("Is same object: "+ isSameObject);
  }
}