package StringsCharactersRegularExpressions;

import java.util.Scanner;

// StringTokenizer object used to tokenize strings.
public class TokenTest {

    // execute application
    public static void main(String[] args) {

        // get sentence
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence and press Enter");
        String sentence = scanner.nextLine();

        // process user sentence
        String[] tokens = sentence.split(" ");
        System.out.printf("Number of elements: %d%nThe tokens are:%n",
                tokens.length);

        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
