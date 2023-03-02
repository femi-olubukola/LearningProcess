// Time1 class declaration maintains the time in 24-hour format.

public class Time1 {

    private int hour;
    private int minutes;
    private int seconds;

    public void setTime(int hour, int minutes, int seconds) {
         if (hour < 0 || hour >= 24 || minutes < 0 || minutes >= 60 || seconds < 0 || seconds >= 60) {

             throw new IllegalArgumentException(
                     "hour, minute or second was out of range");
         }

         this.hour = hour;
         this.minutes = minutes;
         this.seconds = seconds;
    }

    // convert to String in universal-time format (HH:MM:SS)
    public String toUniversalString() {

        return String.format("%2d:%02d:%02d", hour, minutes, seconds);
    }

    // convert to String in standard-time format (H:MM:SS AM or PM)
    public String toString() {

        return String.format("%d:%02d:%02d %s",
                ((hour == 0 || hour == 12) ? 12 : hour % 12),
                minutes, seconds, (hour < 12 ? "AM" : "PM"));
    }
}
