import java.io.FileWriter;
import java.io.IOException;

public class FileWriterIntro {
  public static void main(String[] args) throws IOException {
    FileWriter writer = new FileWriter("output.txt");
    String outputText = "Is there someone?";
    writer.write(outputText);
    writer.close();
  }
}