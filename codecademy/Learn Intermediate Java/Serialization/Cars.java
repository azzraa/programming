import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Cars implements Serializable {
  private String make;
  private int year;
  private static final long serialVersionUID = 1L;

  public static void main(String[] args) throws FileNotFoundException, IOException {
    FileOutputStream fileOutputStream = new FileOutputStream("cars.txt");
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
  }
}