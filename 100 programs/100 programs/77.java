//How to dropdown in AWT program in java//

import java.awt.*;



public class AWTDrowdownExample {
    public static void main(String[] args) {
        // Create a frame
        Frame frame = new Frame("AWT Dropdown Example");

        // Create a dropdown using Choice
        Choice dropdown = new Choice();

        // Add items to the dropdown
        dropdown.add("Option 1");
        dropdown.add("Option 2");
        dropdown.add("Option 3");

        // Set position and size
        dropdown.setBounds(100, 100, 100, 30);

        // Add dropdown to frame
        frame.add(dropdown);

        // Set frame properties
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);

        // Handle window close
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                frame.dispose();
            }
        });
    }
}

