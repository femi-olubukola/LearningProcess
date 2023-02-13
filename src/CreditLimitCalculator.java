//4.18 (Credit Limit Calculator) Develop a Java application that determines whether any of several
//        department-store customers has exceeded the credit limit on a charge account. For each customer,
//        the following facts are available:
//        a) account number
//        b) balance at the beginning of the month
//        c) total of all items charged by the customer this month
//        d) total of all credits applied to the customer’s account this month
//        e) allowed credit limit.
//        The program should input all these facts as integers, calculate the new balance (= beginning balance
//        + charges – credits), display the new balance and determine whether the new balance exceeds the
//        customer’s credit limit. For those customers whose credit limit is exceeded, the program should display
//        the message "Credit limit exceeded".


// pseudocode

//    create a credit limit calculator class and a credit limit calculator test class
//
//    instantiate variables
//    create constructor that initializes instance variables



public class CreditLimitCalculator {

    int accountNumber;
    int balance;
//    int itemsCharged;
//    int creditsApplied;
    int creditLimit;

    public CreditLimitCalculator(int accountNumber,
                                 int balance,
//                                 int itemsCharged,
//                                 int creditsApplied,
                                 int creditLimit) {

        this.accountNumber = accountNumber;

        if (balance > 0.0){
            this.balance = balance;
        }
//        if (itemsCharged > 0.0){
//            this.itemsCharged = itemsCharged;
//        }
//        if (creditsApplied > 0.0){
//            this.creditsApplied = creditsApplied;
//        }
        if (creditLimit > 0.0){
            this.creditLimit = creditLimit;
        }

    }

    public void getNewBalance(int itemsCharged, int creditsApplied) {
        int newBalance = balance + itemsCharged - creditsApplied;

        if (newBalance > creditLimit) {
            System.out.println("Credit limit exceeded");
        }

    }

    public int getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getCreditLimit() {
        return creditLimit;
    }
}
