package FilesStreamAndObjectSerialization.sequentialaccessfiles;

// Reading a file of objects sequentially with ObjectInputStream
// and displaying each record.

import java.io.EOFException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.ObjectInputStream;

public class ReadSequentialFile {

    private static ObjectInputStream input;

    public static void main(String[] args) {

        openFile();
        closeFile();
    }

    // enable user to select file to open
    public static void openFile() {
        try // open file
        {
            input = new ObjectInputStream(
                    Files.newInputStream(Paths.get("clients.ser")));
        } catch (IOException ioException) {
            System.err.println("Error opening file.");
            System.exit(1);
        }
    }



    // close file and terminate application
    public static void closeFile() {
        try
        {
            if (input != null)
                input.close();
        }
        catch (IOException ioException)
        {
            System.err.println("Error closing file. Terminating.");
            System.exit(1);
        }
    }

}
