package tutorials.Garbage Collection;

public class Main {

    public static void main(String[] args) {
        doCatStuff();
        System.out.println("I'm done doing cat stuff");
    }

    private static void doCatStuff() {
        Cat myCat = new Cat();
        myCat.meow();
    }
    
}
