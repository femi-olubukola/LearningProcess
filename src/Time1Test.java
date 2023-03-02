// Time1 object used in an app.

public class Time1Test {
    public static void main(String[] args) {

        // create and initialize a Time1 object
        Time1 time = new Time1(); // invokes Time1 default constructor

        // output string representations of the time
        displayTime("After time object is created", time);
        System.out.println();

        // change time and output updated time
        time.setTime(13, 27, 6);
        displayTime("After calling setTime", time);
        System.out.println();

        // attempt to set time with invalid values
        try {
            time.setTime(99,99,99); // all values out of range
        }
        catch (IllegalArgumentException e) {
            System.out.println("Exception is " + e.getMessage());
        }

        System.out.println();

        // display time after attempt to set invalid values
        displayTime("After calling setTime with invalid values", time);
    }

    private static void displayTime(String header, Time1 time) {

        // displays a Time1 object in 24-hour and 12-hour formats
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n",
                header, time.toUniversalString() , time.toString());

//        System.out.println(header);
//        System.out.println("Universal Time is " + time.toUniversalString());
//        System.out.println("Standard Time is " + time.toString());
    }
}
