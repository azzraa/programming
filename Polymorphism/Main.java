// Base class
class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Derived class
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof");
    }
}

// Derived class
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        // Polymorphism in action
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound(); // Outputs: Woof
        myCat.makeSound(); // Outputs: Meow

        // An array of Animals
        Animal[] animals = {new Dog(), new Cat(), new Animal()};
        for (Animal animal : animals) {
            animal.makeSound(); // Outputs: Woof, Meow, Some generic animal sound
        }
    }
}
