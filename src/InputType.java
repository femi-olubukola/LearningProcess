import java.util.Scanner;

public class InputType {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x;
        String y;

        System.out.print("Enter an input");
        x = input.nextInt();
        y = input.next();
        if(y.length() > 1){
            System.out.println("Input is a String");
        }
        else
            System.out.println("Input is a number");
    }
}
