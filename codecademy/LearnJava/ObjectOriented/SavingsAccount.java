public class SavingsAccount {
    public static void main(String[] args) {
        // Create a Savings object with an initial balance of 2000
        Savings savings = new Savings(2000);
        
        // Check balance
        savings.checkBalance();
        
        // Withdrawing
        savings.withdraw(300);
        
        // Check balance
        savings.checkBalance();
        
        // Deposit
        savings.deposit(600);
        
        // Check balance
        savings.checkBalance();
        
        // Deposit
        savings.deposit(600);
        
        // Check balance
        savings.checkBalance();
        
        // Print the savings account details
        System.out.println(savings);
    }
}

class Savings {
    // Instance variable to store the balance
    private int balance;

    // Constructor to initialize the balance
    public Savings(int initialBalance){
        balance = initialBalance;
    }

    // Auto-generated constructor (unused, so it can be removed if not needed)
    public Savings(String string, int i) {
        // TODO Auto-generated constructor stub
    }

    // Method to check the balance
    public void checkBalance(){
        System.out.println("Hello!");
        System.out.println("Your balance is " + balance);
    }

    // Method to deposit money
    public void deposit(int amountToDeposit){
        balance += amountToDeposit;
        System.out.println("You just deposited " + amountToDeposit);
    }

    // Method to withdraw money
    public int withdraw(int amountToWithdraw){
        balance -= amountToWithdraw;
        System.out.println("You just withdrew " + amountToWithdraw);
        return amountToWithdraw;
    }

    // Override the toString method to provide a string representation of the savings account
    @Override
    public String toString(){
        return "This is a savings account with " + balance + " saved.";
    }

    // Placeholder method (if not needed, it can be removed)
    public void addMoney(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addMoney'");
    }
}
