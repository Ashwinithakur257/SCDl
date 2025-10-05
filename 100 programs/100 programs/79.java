//How to add checkbox in Swing program in java//


import javax.swing.*;

public class SwingCheckboxExample {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Swing Checkbox Example");

        // Create a checkbox
        JCheckBox checkbox = new JCheckBox("I agree");

        // Set position and size
        checkbox.setBounds(100, 100, 150, 30);

        // Add checkbox to frame
        frame.add(checkbox);

        // Set frame properties
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
