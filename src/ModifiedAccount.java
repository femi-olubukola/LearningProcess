public class ModifiedAccount {

    private double balance;
    private String name;
    public String x;

    public ModifiedAccount(double balance, String name){
        this.name = name;
        if (balance > 0.0)
            this.balance = balance;
    }

    public void withdraw ( double withdrawalAmount) {
        if (withdrawalAmount > balance) {
            System.out.println("Withdrawal Amount Exceeded Account Balance");
        }
        else
            balance = balance - withdrawalAmount;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {

        this.name = name;
    }

    // method to get the name from the object
    public String getName() {

        return name;
    }
}
