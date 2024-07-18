package Lambda;

public class Cat implements Printable {

    public String name;
    public int age;

    public Cat() {}

    public String print(String suffix) {
        return "Meow " + suffix;
    }

}
