// Strings in switch statements

//        You’ve been hired by an auto insurance company that serves these northeast states—
//        Connecticut, Maine, Massachusetts, New Hampshire, New Jersey, New York, Pennsylvania,
//        Rhode Island and Vermont. The company would like you to create a program
//        that produces a report indicating for each of their auto insurance policies whether the
//        policy is held in a state with “no-fault” auto insurance—Massachusetts, New Jersey,
//        New York and Pennsylvania.

// Class that represents an auto insurance policy.

public class AutoPolicy {

    private int accountNumber; // policy account number
    private String makeAndModel; // car that the policy applies to
    private String state; // two-letter state abbreviation

    // constructor
    public AutoPolicy(int accountNumber, String makeAndModel, String state){

        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }

    // sets the account number
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    // returns the account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // sets the makeAndModal
    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    // returns the makeAndModal
    public String getMakeAndModel() {
        return makeAndModel;
    }

    // sets the state
    public void setState(String state) {
        this.state = state;
    }

    // returns the state
    public String getState() {
        return state;
    }

    // predicate method returns whether the state has no-fault insurance
    public boolean isNoFaultState() {

        boolean noFaultState;

        switch (getState()) {

            case "MA": case "NJ": case "NY": case "PA":
                noFaultState = true;
                break;

            default:
                noFaultState = false;
                break;

        }

        return noFaultState;

    }
}  // end class AutoPolicy
