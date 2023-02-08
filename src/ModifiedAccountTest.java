import java.util.Scanner;

public class ModifiedAccountTest {
    public static void main(String[] args) {

        ModifiedAccount account = new ModifiedAccount(500.00, "Tejiri");
        ModifiedAccount account1 = new ModifiedAccount(200.00, "Obus");
        ModifiedAccount account2 = new ModifiedAccount(2000.00, "Titus");


        System.out.println("$" + account.getBalance() + " belongs to " + account.getName());
        System.out.println("$" + account1.getBalance() + " belongs to " + account1.getName());
        System.out.println("$" + account2.getBalance() + " belongs to " + account2.getName());


        Scanner input = new Scanner(System.in);

        System.out.println("Enter an amount to withdraw for " + account.getName() );
        double withdrawalAmount = input.nextDouble();

//        System.out.println("Withdrawing $" + withdrawalAmount + " from " + account.getName() + "'s account");
//        System.out.println("Press Enter after entering 1 to confirm");
//        String x = input.next();
        account.withdraw(withdrawalAmount);

//        System.out.println("$" + withdrawalAmount + " have been successfully withdrawn");
        System.out.println(account.getName() + "'s new account balance now is: " + account.getBalance());
    }
}
