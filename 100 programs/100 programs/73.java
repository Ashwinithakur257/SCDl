//How to get IP address from site URL using java program//

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIPAddress {
    public static void main(String[] args) {
        try {
            // Replace with your desired website
            String website = "www.example.com";

            // Get InetAddress object
            InetAddress address = InetAddress.getByName(website);

            // Print IP address
            System.out.println("IP address of " + website + " is: " + address.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("Unable to resolve host.");
        }
    }
}
