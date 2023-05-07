package ArrayandArrayLists;

import java.awt.*;

// Drawing a rainbow using arcs and an array of colors.
public class DrawRainbow {

    // define indigo and violet
    private final static Color VIOLET = new Color(128, 0, 128);
    private final static Color INDIGO = new Color(75, 0, 130);

        // colors to use in the rainbow, starting from the innermost
        // The two white entries result in an empty arc in the center
        private Color[] colors = {
                Color.WHITE, Color.WHITE, VIOLET, INDIGO, Color.BLUE,
                Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED };

        // constructor
        public DrawRainbow() {
        setBackground(Color.WHITE); // set the background to white
        }


}
