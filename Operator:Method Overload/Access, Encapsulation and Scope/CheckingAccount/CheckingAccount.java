public class CheckingAccount{
    private String name;
    private int balance;
    
    public CheckingAccount(String inputName, int inputBalance){
      name = inputName;
      balance = inputBalance;
    }

    CheckingAccount(String mike, int i, Object object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    private void addFunds(int fundsToAdd){
      balance += fundsToAdd;
    }
    
    private void getInfo(){
      System.out.println("This checking account belongs to " + name +". It has " + balance + " dollars in it.");
    }
  
    public void printBalance() {
      System.out.println("Account balance is " + balance);
    }

    void getBalance() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
  }