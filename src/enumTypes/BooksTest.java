package enumTypes;
// Testing enum type Books

import java.util.EnumSet;

public class BooksTest {

    public static void main(String[] args) {

        System.out.println("All books:");

        // print all books in enum Books
        for (Books book : Books.values())
            System.out.printf("%-10s%-45s%s%n", book,
                    book.getTitle(), book.getCopyrightYear());

        System.out.printf("%nDisplay a range of enum constants:%n");

        for (Books book : EnumSet.range(Books.JHTP, Books.CPPHTP))
            System.out.printf("%-10s%-45s%s%n", book,
                    book.getTitle(), book.getCopyrightYear());
    }
}
