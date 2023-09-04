    import java.util.Scanner;
public class ATM {
    Scanner scanner = new Scanner(System.in);
    public  void ATMmachine(BankAccount bankAccount) {
        while (true) {
            System.out.println("*********************************************\n"
                    + "Welcome to the ATM InterFace\n"
                    + "1.WithDraw Amount\n" + "2.Deposit Amount\n" + "3.CheckBalance\n" + "4.Exit the ATM Interface\n" +
                    "***********************************************");

            System.out.println("Enter the Choice");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the Withdraw Amount :");
                    double withDrawAmount = scanner.nextDouble();
                    bankAccount.withDraw(withDrawAmount);
                    break;
                case 2:
                    System.out.println("Enter the amount You will deposit :");
                    Double depositAmount = scanner.nextDouble();
                    bankAccount.deposit(depositAmount);
                    break;
                case 3:
                    bankAccount.checkBalance();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
