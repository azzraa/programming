public class SavingsAccount {

  public String owner;
  public double balanceDollar;
  public double balanceEuro;

  public SavingsAccount(String owner, double balanceDollar) {
      this.owner = owner;
      this.balanceDollar = balanceDollar;
      this.balanceEuro = balanceDollar * 0.85;
  }

  public void addMoney(int balanceDollar) {
      this.balanceDollar += balanceDollar;
      System.out.println("Adding " + balanceDollar + " dollars to the account.");
      System.out.println("The new balance is " + this.balanceDollar + " dollars.");
  }

  public static void main(String[] args) {
    SavingsAccount zeusSavingsAccount = new SavingsAccount("Zeus", 1000);
    
    zeusSavingsAccount.addMoney(2000);
}
}
