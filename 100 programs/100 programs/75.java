//How to add lable in AWT program in java//


import java.awt.*;

public class AWTLabelExample {
    public static void main(String[] args) {
        // Create a frame
        Frame frame = new Frame("AWT Label Example");

        // Create a label
        Label label = new Label("Hello, this is a label!");

        // Set label position and size
        label.setBounds(50, 100, 200, 30);

        // Add label to the frame
        frame.add(label);

        // Set frame properties
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);

        // Close the window when user clicks the close button
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                frame.dispose();
            }
        });
    }
}
