package recursion;

// Drawing the "Lo feather fractal" using recursion.

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class FractalJPanel  extends JPanel{

    private Color color; // stores color used to draw fractal
    private int level; // stores current level of fractal

    private static final int WIDTH = 400; // defines width of JPanel
    private static final int HEIGHT = 400; // defines height of JPanel

    // set the initial fractal level to the value specified and set up JPanel specifications
    public FractalJPanel(int currentLevel) {
        color = Color.BLUE; // initialize drawing color to blue
        level = currentLevel; // set initial fractal level
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }



}
