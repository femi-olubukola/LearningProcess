package genericCollections;

// Demonstrates class Properties of the java.util package.

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {

    public static void main(String[] args) {

        Properties table = new Properties();

        // set properties
        table.setProperty("color", "blue");
        table.setProperty("width", "200");

        System.out.println("After setting properties");

        System.out.println("After replacing properties");

        saveProperties(table);

        table.clear(); // empty table

        System.out.println("After clearing properties");




        // get value of property color
        Object value = table.getProperty("color");

        // check if value is in table
        if (value != null)
            System.out.printf("Property color's value is %s%n", value);
        else
        System.out.println("Property color is not in table");

    }

    // save properties to a file
    private static void saveProperties(Properties props) {

        // save contents of table
        try {
            FileOutputStream output = new FileOutputStream("props.dat");
            props.store(output, "Sample Properties"); // save properties
            output.close();
            System.out.println("After saving properties");

        }
        catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
