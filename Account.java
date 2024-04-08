public class Account{
  private String owner;
  private String number;
  private double balance;

  public Account(String owner, String number, double balance){
    this.owner = owner;
    this.number = number;
    this.balance = balance;
    System.out.println("Testando o código");
  }

  public Account(String owner, String number){
    this.owner = owner;
    this.number = number;
    System.out.println("Testando o código com dois parâmetros");
  }

  public Account(String owner){
    this.owner = owner;
    System.out.println("Testando o código com um parâmetro");
  }
  
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
