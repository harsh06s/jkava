import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAddressProject {
    public static void main(String[] args) {
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("Local IP Address: " + localHost.getHostAddress());

            InetAddress[] allLocal = InetAddress.getAllByName(localHost.getHostName());
            System.out.println("All Local IP Addresses:");
            for (InetAddress address : allLocal) {
                System.out.println(address.getHostAddress());
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
