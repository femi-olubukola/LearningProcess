package OOPInterfaces;
// Invoice class that implements Payable.

public class Invoice implements Payable{

    private final String partNumber;
    private final String partDescription;
    private int quantity;
    private double pricePerItem;

    // constructor
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {

        // validate quantity
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity must be >= 0");
        }

        // validate price per item
        if (pricePerItem < 0) {
            throw new IllegalArgumentException("Price per item must be >= 0");
        }

        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    } // end constructor

    // get part number
    public String getPartNumber() {
        return partNumber;
    }

    // get description
    public String getPartDescription() {
        return partDescription;
    }

    // set quantity
    public void setQuantity(int quantity) {

        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity must be >= 0");
        }
        this.quantity = quantity;
    }

    // get quantity
    public int getQuantity() {
        return quantity;
    }

    // set price per item
    public void setPricePerItem(double pricePerItem) {

        if (pricePerItem < 0) {
            throw new IllegalArgumentException("Price per item must be >= 0");
        }
        this.pricePerItem = pricePerItem;
    }

    // get price per item
    public double getPricePerItem() {
        return pricePerItem;
    }

    // return String representation of Invoice object
    @Override
    public String toString() {
        return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f",
                "invoice", "part number", getPartNumber(), getPartDescription(),
                "quantity", getQuantity(), "price per item", getPricePerItem());
    }

    // method required to carry out contract with interface Payable
    @Override
    public double getPaymentAmount() {

        return getQuantity() * getPricePerItem(); // calculate total cost
    }
}
