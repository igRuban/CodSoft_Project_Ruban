public class BankAccount {
    double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public BankAccount(){

    }
    public void withDraw(double a){
      if(this.amount < a ){
          System.out.println("Bank Balance is less than your Amount\n" +
                  "Check Your bank balance");

      }else {
          this.amount = this.amount - a;
          System.out.println("Withdraw Successful");
      }
    }

    public void deposit(double amount){
      this.amount = this.amount+ amount;
        System.out.println("Amount Successfully Deposited...");
    }

    public void checkBalance(){
        System.out.println("the current Balance  is " +  this.amount);
    }
}
