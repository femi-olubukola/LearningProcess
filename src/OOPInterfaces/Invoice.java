package OOPInterfaces;
// Invoice class that implements Payable.

public class Invoice {

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
}
