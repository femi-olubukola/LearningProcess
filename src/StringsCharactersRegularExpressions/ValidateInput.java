package StringsCharactersRegularExpressions;

// Validating user information using regular expressions.
public class ValidateInput {

    // validate first name
    public static boolean validateFirstName(String firstName) {

        return firstName.matches("[A-Z] [a-zA-Z]*");
    }

    public static boolean validateLastName(String lastName) {

        return lastName.matches("[a-zA-z]+(['-][a-zA-Z]+)*");
    }
}
