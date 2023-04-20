package StringsCharactersRegularExpressions;

// Validating user information using regular expressions.
public class ValidateInput {

    // validate first name
    public static boolean validateFirstName(String firstName) {

        return firstName.matches(
                "[A-Z] [a-zA-Z]*");
    }

    // validate last name
    public static boolean validateLastName(String lastName) {

        return lastName.matches(
                "[a-zA-z]+(['-][a-zA-Z]+)*");
    }

    // validate email address
    public static boolean validateEmailAddress(String emailAddress) {

        return emailAddress.matches(
                "\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }

    // validate city
    public static boolean validateCity(String city) {

        return city.matches(
                "([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }

    // validate state
    public static boolean validateState(String state) {

        return state.matches(
                "([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }
}
