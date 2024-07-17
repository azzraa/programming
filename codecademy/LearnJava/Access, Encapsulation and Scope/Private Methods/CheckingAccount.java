public class CheckingAccount{
    private String name;
    private int balance;
    private String id;
    private double interestRate;
    
    public CheckingAccount(String inputName, int inputBalance, String inputId){
      this.name = inputName;
      this.balance = inputBalance;
      this.id = inputId;
      this.interestRate = 0.02;
    }
    
    public CheckingAccount(String string, int i) {
        //TODO Auto-generated constructor stub
    }

    public void getAccountInformation(){
      System.out.println("Money in account: " + this.getBalance());
      System.out.println("Next Month's Interest: " + this.calculateNextMonthInterest());
    }
  
    private double calculateNextMonthInterest() {
      return this.balance * this.interestRate; 
  
    }
    
    int getBalance(){
      return this.balance;
    }

    public void setBalance(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setBalance'");
    }
    
  }