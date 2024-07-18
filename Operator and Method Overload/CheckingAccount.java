public class CheckingAccount {
    private String name;
    private int balance;

    // Constructor to initialize name and balance
    public CheckingAccount(String inputName, int inputBalance) {
        this.name = inputName;
        this.balance = inputBalance;
    }

    // Method to add funds to the balance
    public void addFunds(int fundsToAdd) {
        balance += fundsToAdd;
    }

    // Method to display account information
    public void getInfo() {
        System.out.println("This checking account belongs to " + name + ". It has " + balance + " dollars in it.");
    }

    // Method to print the current balance
    public void printBalance() {
        System.out.println("Account balance is " + balance);
    }

    // Getter method for retrieving the balance
    public int getBalance() {
        return balance;
    }

    // Main method to demonstrate the usage of CheckingAccount
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount("John Doe", 500);
        account.getInfo();  // Display initial account info

        account.addFunds(200);  // Add funds to the account
        account.printBalance(); // Print updated balance

        // Example of retrieving balance using getBalance method
        int currentBalance = account.getBalance();
        System.out.println("Retrieved balance: " + currentBalance);
    }
}
