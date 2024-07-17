public class Dog {
    private String name;
  
    public Dog(String name) {
      this.name = name;
    }
  
    public String getName() {
      return name;
    }
  
    public void setName(String newName) {
      name = newName;
    }
  
    public static void main(String[] args) {
      Dog myDog = new Dog("Lassie");
      System.out.println(myDog.getName());
    }
  
  }