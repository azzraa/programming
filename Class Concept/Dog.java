public class Dog {
  // Fields with access modifiers
  private String name; // Access modifier is private, no acces from outside

  // Constructor
  public Dog(String name) { // Every dog object must have a name
      this.name = name;
  }

  // Getter for name (public access)
  public String getName() {
      return name;
  }

  // Setter for name (public access)
  public void setName(String newName) {
      name = newName;
  }

  public static void main(String[] args) {
      // Creating a new Dog object using the constructor
      Dog myDog = new Dog("Lassie");
      System.out.println(myDog.getName()); // Output: Lassie
  }
}
