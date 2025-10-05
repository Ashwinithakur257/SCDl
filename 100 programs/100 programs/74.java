//How to create AWT program in java//

import java.awt.*;
import java.awt.event.*;

public class SimpleAWT {
    public static void main(String[] args) {
        // Create a frame
        Frame frame = new Frame("My First AWT Program");

        // Create a button
        Button button = new Button("Click Me");

        // Set button position and size
        button.setBounds(100, 100, 80, 30);

        // Add button to frame
        frame.add(button);

        // Set frame size and layout
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);

        // Close the window when user clicks the close button
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}
