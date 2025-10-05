//How to add text area program in java//


import java.awt.*;

public class AWTTextAreaExample {
    public static void main(String[] args) {
        // Create a frame
        Frame frame = new Frame("AWT TextArea Example");

        // Create a TextArea
        TextArea textArea = new TextArea("Type something here...", 5, 30);

        // Set position and size
        textArea.setBounds(50, 100, 200, 100);

        // Add TextArea to frame
        frame.add(textArea);

        // Set frame properties
        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setVisible(true);

        // Handle window close
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                frame.dispose();
            }
