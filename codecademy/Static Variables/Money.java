public class Money{
    // Static variables
    public static int totalMoney = 0;
    public static int numATMs = 0;
  
    // Instance variables
    public int money;
  
    public Money(int inputMoney){
      this.money = inputMoney;
      numATMs += 1;
      totalMoney += inputMoney;
    }
  
    public void withdrawMoney(int amountToWithdraw){
      if(amountToWithdraw <= this.money){
        this.money -= amountToWithdraw;
        totalMoney -= amountToWithdraw;
      }
    }
  
    // Write your averageMoney() method here
    public static void averageMoney() {
      System.out.println(totalMoney / numATMs);
        }
  
    public static void main(String[] args){
  
      System.out.println("Total number of ATMs: " + Money.numATMs); 
      Money firstATM = new Money(1000);
      Money secondATM = new Money(500);
      System.out.println("Total number of ATMs: " + Money.numATMs); 
  
      System.out.println("Total amount of money in all ATMs: " + Money.totalMoney);  
      firstATM.withdrawMoney(500);
      secondATM.withdrawMoney(200);
      System.out.println("Total amount of money in all ATMs: " + Money.totalMoney);    
  
      // Call averageMoney() here
      averageMoney();
  
    }
  
  }