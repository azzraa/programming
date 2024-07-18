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

