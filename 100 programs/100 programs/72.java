//How to get URL of site using java Programs//

import java.net.URL;

public class GetURLExample {
    public static void main(String[] args) {
        try {
            // Create a URL object
            URL url = new URL("https://www.example.com");

            // Print different parts of the URL
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort()); // -1 if not set
            System.out.println("File: " + url.getFile());
            System.out.println("Full URL: " + url.toString());
        } catch (Exception e) {
            System.out.println("Invalid URL");
        }
    }
}
