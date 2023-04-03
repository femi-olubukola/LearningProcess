package StringsCharactersRegularExpressions;

// String methods equals, equalsIgnoreCase, compareTo and regionMatches.

public class StringCompare {

    public static void main(String[] args) {

        String s1 = new String("hello"); // s1 is a copy of "hello"
        String s2 = "goodbye";
        String s3 = "Happy Birthday";
        String s4 = "happy birthday";

        System.out.printf(
                "s1 = %s%ns2 = %s%ns3 = %s%ns4 = %s%n%n", s1, s2, s3, s4);

        // test for equality
        if (s1.equals("hello")) // true
            System.out.println("s1 equals \"hello\"");
        else
        System.out.println("s1 does not equal \"hello\"");

        // test for equality with ==
        if (s1 == "hello") // false; they are not the same object
            System.out.println("s1 is the same object as \"hello\"");
        else
        System.out.println("s1 is not the same object as \"hello\"");

        // test for equality (ignore case)
        if (s3.equalsIgnoreCase(s4)) // true
            System.out.printf("%s equals %s with case ignored%n", s3, s4);
        else
        System.out.println("s3 does not equal s4");
    }
}
