public class NewAccount {

    private String name; // instance variable
    private double balance; // instance variable

    // Account constructor that receives two parameters
    public NewAccount(String name, double balance) {

        this.name = name; // assign name to instance variable name

        if (balance > 0.0) { // if the balance is valid
            this.balance = balance; // assign it to the instance variable balance
        }
    }

        // method that deposits only a valid amount to the balance
        public void deposit (double depositAmount) {
            if (depositAmount > 0.0) {
                balance = balance + depositAmount;
            }
        }

        public double getBalance() {
            return balance;
        }

        public void setName(String name) {

            this.name = name; // store the name
        }

        // method to get the name from the object
        public String getName() {

            return name; // return value of name to caller
        }

}

