public class Dog {
  // Instance fields to store the dog's breed, owner status, and age
  String breed;
  boolean hasOwner;
  int age;

  // Constructor method to initialize the instance fields
  public Dog(String dogBreed, boolean dogOwned, int dogYears) {
      // Print message indicating the constructor is invoked
      System.out.println("Constructor invoked!");
      // Assign parameter values to the instance fields
      breed = dogBreed;
      hasOwner = dogOwned;
      age = dogYears;
  }

  public static void main(String[] args) {
      // Print message indicating the main method has started
      System.out.println("Main method started");
      
      // Create a new Dog object with breed "poodle", not owned, and age 4
      Dog fido = new Dog("poodle", false, 4);
      
      // Create a new Dog object with breed "shiba inu", owned, and age 12
      Dog nunzio = new Dog("shiba inu", true, 12);
      
      // Determine if Fido is older than Nunzio
      boolean isFidoOlder = fido.age > nunzio.age;
      
      // Calculate the total age of both dogs
      int totalDogYears = nunzio.age + fido.age;
      
      // Print details about the created dogs
      System.out.println("Two dogs created: a " + fido.breed + " and a " + nunzio.breed);
      
      // Print the result of the age comparison
      System.out.println("The statement that Fido is an older dog is: " + isFidoOlder);
      
      // Print the total age of both dogs
      System.out.println("The total age of the dogs is: " + totalDogYears);
      
      // Print message indicating the main method has finished
      System.out.println("Main method finished");
  }
}
