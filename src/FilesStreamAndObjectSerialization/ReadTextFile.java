package FilesStreamAndObjectSerialization;

import java.util.Scanner;

public class ReadTextFile {

    private static Scanner input;

    public static void main(String[] args) {

        openFile();
        readRecords();
        closeFile();
    }
}
