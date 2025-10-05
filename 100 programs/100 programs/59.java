import java.io.IOException;

public class OpenNotepad {
    public static void main(String[] args) {
        try {
            Runtime.getRuntime().exec("notepad");
            System.out.println("Notepad opened successfully");
        } catch (IOException e) {
            System.out.println("Error opening Notepad: " + e.getMessage());
        }
    }
}
