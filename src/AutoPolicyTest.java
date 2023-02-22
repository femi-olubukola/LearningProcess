// Demonstrating Strings in switch.

public class AutoPolicyTest {

    public static void main(String[] args) {

        // create two AutoPolicy objects
        AutoPolicy policy1 = new AutoPolicy(01, "Toyota Camry", "NJ");
        AutoPolicy policy2 = new AutoPolicy(02, "Ford Fusion", "ME");
        AutoPolicy policy3 = new AutoPolicy(03, "Toyota Sienna", "PA");
        AutoPolicy policy4 = new AutoPolicy(04, "Lexus E300", "NH");


        // display whether each policy is in a no-fault state
        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);
        policyInNoFaultState(policy3);
        policyInNoFaultState(policy4);

    }

    // method that displays whether an AutoPolicy
    // is in a state with no-fault auto insurance
    public static void policyInNoFaultState(AutoPolicy policy) {

        System.out.println();
        System.out.println("The auto policy: ");
        System.out.printf("Account #: %d; Car: %s; State %s %s a no-fault state%n%n",
                policy.getAccountNumber(), policy.getMakeAndModel(), policy.getState(),
                (policy.isNoFaultState() ? "is" : "is not"));

    }
}
