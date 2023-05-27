package FilesStreamAndObjectSerialization;

// Demonstrating JFileChooser. (Opening Files with JFileChooser)

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JFileChooserDemo extends JFrame {

    private final JTextArea outputArea; // displays file contents

        // set up GUI
        public JFileChooserDemo() throws IOException {
        super("JFileChooser Demo");
        outputArea = new JTextArea();
        add(new JScrollPane(outputArea)); // outputArea is scrollable
        analyzePath(); // get Path from user and display info
        }

    // display information about file or directory user specifies


}
