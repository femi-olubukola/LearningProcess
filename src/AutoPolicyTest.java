// Demonstrating Strings in switch.

public class AutoPolicyTest {

    public static void main(String[] args) {

        // create two AutoPolicy objects
        AutoPolicy policy1 = new AutoPolicy(01, "Toyota Camry", "NJ");
        AutoPolicy policy2 = new AutoPolicy(02, "Ford Fusion", "ME");

        // display whether each policy is in a no-fault state
        System.out.println(" " + policy1);
        System.out.println(" " + policy2);


    }
}
