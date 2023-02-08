import javax.swing.*;

public class NameDialog {

    public static void main(String[] args) {

        // Prompt the user to enter name
        String name = JOptionPane.showInputDialog("What's your name?");

        // Create the message
        String message = String.format("Welcome, %s, to Java Programming!", name);

        // Display the message to welcome the user by name
        JOptionPane.showMessageDialog(null, message);
    }
}
