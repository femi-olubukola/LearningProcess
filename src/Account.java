public class Account {
    private String name; // instance variable (creating an instance of an object)

    public Account(String name){ // constructor name is class name
        this.name = name;
    }

    // method to set the name in the object
    public void setName(String name) {

        this.name = name; // store the name
    }

    // method to get the name from the object
    public String getName() {

        return name; // return value of name to caller
    }
} // end class Account
