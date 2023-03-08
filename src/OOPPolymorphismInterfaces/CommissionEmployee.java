package OOPPolymorphismInterfaces;
// CommissionEmployee class extends Employee.

public class CommissionEmployee extends Employee {

    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage

    public CommissionEmployee (String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {

        super(firstName, lastName, socialSecurityNumber);

        // validate
        if (grossSales < 0.0) {
            throw new IllegalArgumentException(
                    "Gross sales must be >= 0.0");
        }

        // validate
        if (commissionRate < 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException(
                    "Commission rate must be > 0.0 and < 1.0");
        }

        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    } // end constructor

    // get gross sales amount
    public void setGrossSales(double grossSales) {

        // validate
        if (grossSales < 0.0) {
            throw new IllegalArgumentException(
                    "Gross sales must be >= 0.0");
        }

        this.grossSales = grossSales;
    }

    // return gross sales amount
    public double getGrossSales() {
        return grossSales;
    }

    // set commission rate
    public void setCommissionRate(double commissionRate) {

        // validate
        if (commissionRate < 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException(
                    "Commission rate must be > 0.0 and < 1.0");
        }

        this.commissionRate = commissionRate;
    }

    // get commission rate
    public double getCommissionRate() {

        return commissionRate;
    }

    // calculate earnings; override abstract method earnings in Employee
    @Override
    public double earnings() {

        return commissionRate * grossSales;
    }

    // return String representation of CommissionEmployee object
    @Override // indicates that this method overrides a superclass method
    public String toString() {

        return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",
                "commission employee", super.toString(),
                "gross sales", getGrossSales(),
                "commission rate", getCommissionRate());
    }
}

