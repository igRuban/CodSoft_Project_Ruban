public class Main {
    public static void main(String[] args) throws  Exception {

        BankAccount bankAccount = new BankAccount();
        ATM atm = new ATM();
        atm.ATMmachine(bankAccount);
    }
}
