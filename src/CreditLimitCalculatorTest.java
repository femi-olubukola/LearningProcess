import java.util.Scanner;

public class CreditLimitCalculatorTest {

    public static void main(String[] args) {

        CreditLimitCalculator account = new CreditLimitCalculator(23, 5000, 1000);
        CreditLimitCalculator account1 = new CreditLimitCalculator(45, 500, 400);
        CreditLimitCalculator account2 = new CreditLimitCalculator(67, 2500, 500);


        Scanner input = new Scanner(System.in);

        System.out.println("items charged: ");
        int itemsCharged = input.nextInt();
        System.out.println("credits applied: ");
        int creditsApplied = input.nextInt();

        account.getNewBalance(itemsCharged, creditsApplied);

        System.out.println(account.getBalance());

    }
}
