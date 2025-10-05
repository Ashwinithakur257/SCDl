//How to convert string to date in java program//


import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateSimple {
    public static void main(String[] args) {
        try {
            // Define the date format
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

            // Input string
            String dateString = "04-10-2025";

            // Convert string to date
            Date date = formatter.parse(dateString);

            // Print the result
            System.out.println("Converted Date: " + date);
        } catch (Exception e) {
            System.out.println("Invalid date format!");
        }
    }
}

