import java.net.*;

public class Main {
    public static void main(String[] args) {
    InetAddress host = null;
    System.out.println("Looking for the host");

    try {
        host = InetAddress.getLocalHost();

        System.out.println("Host name: " + host.getHostName());
        System.out.println("Host address: " + host.getHostAddress());
    }
    catch (UnknownHostException e) {
        System.out.println("Unable to resolve name and address");
    }

    }
}