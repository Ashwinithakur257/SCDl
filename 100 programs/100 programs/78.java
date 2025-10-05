//How to create Swing program in java//


import javax.swing.*;

public class SimpleSwing {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Swing Example");

        // Create a button
        JButton button = new JButton("Click Me");

        // Set button position and size
        button.setBounds(100, 100, 100, 40);

        // Add button to frame
        frame.add(button);

        // Set frame properties
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
