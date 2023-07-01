package recursion;

// Fractal user interface.

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JColorChooser;

public class Fractal {

    private static final int WIDTH = 400; // define width of GUI
    private static final int HEIGHT = 480; // define height of GUI
    private static final int MIN_LEVEL = 0;
    private static final int MAX_LEVEL = 15;

    // set up GUI
    public Fractal(){

        super("Fractal");

        // set up levelJLabel to add to controlJPanel
        final JLabel levelJLabel = new JLabel("Level: 0");

        final FractalJPanel drawSpace = new FractalJPanel(0);

        // set up control panel
        final JPanel controlJPanel = new JPanel();
        controlJPanel.setLayout(new FlowLayout());

        // set up color button and register listener
        final JButton changeColorJButton = new JButton("Color");
        controlJPanel.add(changeColorJButton);
        changeColorJButton.addActionListener(
                new ActionListener() // anonymous inner class
        {
            // process changeColorJButton event
            @Override
            public void actionPerformed(ActionEvent event) {
                Color color = JColorChooser.showDialog(
                        Fractal.this, "Choose a color", Color.BLUE);

                // set default color, if no color is returned
                if (color == null)
                    color = Color.BLUE;

                drawSpace.setColor(color);
                }
        } // end anonymous inner class
        ); // end addActionListener



    } // end Fractal constructor


}
