public class Account{
  private String owner;
  private String number;
  private double balance;

  public String getOwner(){
    return owner;
  }

  public void SetOwner(String owner){
    this.owner = owner;
  }

  public String getNumber(){
    return number;
  }

  public void Setnumber(String number){
    this.number = number;
  }

  public double getBalance(){
    return balance;
  }

  public void SetBalance(double balance){
    this.balance = balance;
  }

  public void Print(){
    System.out.println(
      "Account{" + 
      "owner: " + owner + '\''
      "number: " + number + '\''
      "balance: " + balance + 
      }
    );
  }
}
