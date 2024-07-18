class BirthdayPerson {
    public int age;
    public int wisdom;
    public int fitness;

    // Constructor to initialize the person's attributes
    public BirthdayPerson(int inputAge) {
        this.age = inputAge;
        this.wisdom = inputAge * 5;
        this.fitness = 100 - inputAge;
    }

    // Method to set the age
    public void setAge(int newAge) {
        this.age = newAge;
    }

    // Method to set the wisdom
    public void setWisdom(int newWisdom) {
        this.wisdom = newWisdom;
    }

    // Method to set the fitness
    public void setFitness(int newFitness) {
        this.fitness = newFitness;
    }

    // Method to handle birthday logic
    public void hasBirthday() {
        this.setAge(this.age + 1);
        this.setWisdom(this.wisdom + 5);
        this.setFitness(this.fitness - 3);
    }

    public static void main(String[] args) {
        // Creating a Person object with an initial age of 20
        BirthdayPerson emily = new BirthdayPerson(20);
        
        // Call the hasBirthday method
        emily.hasBirthday();
        
        // Print the updated attributes
        System.out.println("New age is: " + emily.age);
        System.out.println("New wisdom is: " + emily.wisdom);
        System.out.println("New fitness is: " + emily.fitness);
    }
}