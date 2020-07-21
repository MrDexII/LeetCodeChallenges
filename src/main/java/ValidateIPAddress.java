import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.regex.Pattern;

public class ValidateIPAddress {

    private String chunkIPv4 = "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
    private Pattern pattenIPv4 =
            Pattern.compile("^(" + chunkIPv4 + "\\.){3}" + chunkIPv4 + "$");

    String chunkIPv6 = "([0-9a-fA-F]{1,4})";
    Pattern pattenIPv6 =
            Pattern.compile("^(" + chunkIPv6 + "\\:){7}" + chunkIPv6 + "$");

    public String validIPAddress(String IP) {
        if (pattenIPv4.matcher(IP).matches()) return "IPv4";
        return (pattenIPv6.matcher(IP).matches()) ? "IPv6" : "Neither";
    }


    public String validIPAddress2(String IP) {
        try {
            return (InetAddress.getByName(IP) instanceof Inet6Address) ? "IPv6" : "IPv4";
        } catch (Exception e) {
        }
        return "Neither";
    }


    public static void main(String[] args) {
        ValidateIPAddress validateIPAddress = new ValidateIPAddress();

        System.out.println(validateIPAddress.validIPAddress2("172.16.256.1"));
        System.out.println(validateIPAddress.validIPAddress2("2001:0db8:85a3:0000:0000:8a2e:0370:7334"));

    }
}
