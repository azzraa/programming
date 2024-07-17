public class CheckingAccount {
  private String ownerName;
  private double balance;
  private String accountNumber;
  
  public CheckingAccount(String ownerName, double balance, String accountNumber) {
      this.ownerName = ownerName;
      this.balance = balance;
      this.accountNumber = accountNumber;
  }
  
  public double getBalance() {
      return balance;
  }
  
  public void setBalance(double balance) {
      this.balance = balance;
  }
}
