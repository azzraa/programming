package tutorials.GarbageCollection;

public class Main {
    public static void main(String[] args) {
        // Calls the doCatStuff method and then prints a message
        doCatStuff();
        System.out.println("I'm done doing cat stuff");
    }

    private static void doCatStuff() {
        // Creates an instance of the Cat class.
        Cat myCat = new Cat();
        // Calls the meow method on the myCat object
        myCat.meow();
    }
}

class Cat {
    // The meow method prints "Meow!" to the console
    void meow() {
        System.out.println("Meow!");
    }
}

/* How Garbage Collection Works Here:
- When doCatStuff is called, a Cat object is created
- After meow is called, the Cat object goes out of scope
- The garbage collector will eventually remove the Cat object from memory since it is no longer referenced */