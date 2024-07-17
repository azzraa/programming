package Operators;

public class Logic {
    public static void main(String[] args) {
        // || is the OR operator
        // && is the AND operator
        // ! is the NOT operator

        int a = 3;
        int b = 4;
        boolean isSunny = false;
        boolean amHappy = false;

        if((a < b && isSunny) || amHappy) {
            System.out.println("It's a good day!");
        }   
    }
}
