package enumTypes;

// Declaring an enum type with a constructor and explicit instance fields
// and accessors for these fields

public enum Books {

    // declare constants of enum type
    JHTP("Java How to Program", "2015"),
    CHTP("C How to Program", "2013"),
    IW3HTP("Internet & World Wide Web How to Program", "2012"),
    CPPHTP("C++ How to Program", "2014"),
    VBHTP("Visual Basic How to Program", "2014"),
    CSHARPHTP("Visual C# How to Program", "2014");

    // instance fields
    private final String title;
    private final String copyrightYear;

    // enum constructor
    Books (String title, String copyrightYear) {

        this.copyrightYear = copyrightYear;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getCopyrightYear() {
        return copyrightYear;
    }
}
