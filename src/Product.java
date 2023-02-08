import java.util.Scanner;

public class Product {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x;
        int y;
        int z;
        int result;

        System.out.println("Enter First Integer");
        x = input.nextInt();

        System.out.println("Enter Second Integer");
        y = input.nextInt();

        System.out.println("Enter Third Integer");
        z = input.nextInt();

        result = x * y * z;

        System.out.println("Product is " + result);
    }
}
