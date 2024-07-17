package tutorials.Lambda;
 
public class Lambdas {     
    public static void main(String[] args) {
           
        Printable lamdaPrintable = (s) -> "Meow " + s;
        printThing(lamdaPrintable);
    }       
    // Method printThing that takes in any objec that implements the Implement Interface
    static void printThing(Printable thing) {
        thing.print("!");
    }    
}
 