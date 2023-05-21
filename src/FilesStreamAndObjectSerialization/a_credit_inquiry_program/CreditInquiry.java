package FilesStreamAndObjectSerialization.a_credit_inquiry_program;

public class CreditInquiry {

    private final static MenuOption[] choices = MenuOption.values();

    public static void main(String[] args) {

        // get user's request (e.g., zero, credit or debit balance)
        MenuOption accountType = getRequest();

        while (accountType != MenuOption.END) {
            switch (accountType)
            {
                case ZERO_BALANCE:
                    System.out.printf("%nAccounts with zero balances:%n");
                    break;
                case CREDIT_BALANCE:
                    System.out.printf("%nAccounts with credit balances:%n");
                    break;
                case DEBIT_BALANCE:
                    System.out.printf("%nAccounts with debit balances:%n");
                    break;
            }

            readRecords(accountType);
            accountType = getRequest(); // get user's request
        }
    }

    // obtain request from user
    private static MenuOption getRequest() {
        int request = 4;

        // display request options
        System.out.printf("%nEnter request%n%s%n%s%n%s%n%s%n",
                " 1 - List accounts with zero balances",
                " 2 - List accounts with credit balances",
                " 3 - List accounts with debit balances",
                " 4 - Terminate program");

        try
           {
            Scanner input = new Scanner(System.in);

            do // input user request
                {
                System.out.printf("%n? ");
                request = input.nextInt();
                } while ((request < 1) || (request > 4));
            }
        catch (NoSuchElementException noSuchElementException)
           {
            System.err.println("Invalid input. Terminating.");
            }

        return choices[request - 1]; // return enum value for option
    }
}

