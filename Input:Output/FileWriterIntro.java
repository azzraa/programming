// Used for writing characters to a file
// It provides methods to create and write to text file
import java.io.FileWriter;

// Used for handling exceptions
// May be thrown while creating or writing to a file
import java.io.IOException;

public class FileWriterIntro {
  public static void main(String[] args) throws IOException {
    FileWriter writer = new FileWriter("output.txt");
    String outputText = "Is there someone?";
    writer.write(outputText);
    writer.close();
  }
}