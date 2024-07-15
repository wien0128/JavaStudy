package thisIsJava.systemEx;

import java.util.Properties;
import java.util.Set;

public class SystemProperty {
    public static void main(String[] args) {
        String osName = System.getProperty("os.name");
        String osArch = System.getProperty("os.arch");
        String osVersion = System.getProperty("os.version");
        String userName = System.getProperty("user.name");
        String userHome = System.getProperty("user.home");
        System.out.println(osName);
        System.out.println(osArch);
        System.out.println(osVersion);
        System.out.println(userName);
        System.out.println(userHome);

        System.out.println("------------------------------------");
        System.out.println("key:  value");
        System.out.println("------------------------------------");

        Properties props = System.getProperties();
        Set keys = props.keySet();

        for (Object key : keys) {
            String k = (String) key;
            String v = System.getProperty(k);
            System.out.printf("%-40s: %s\n", k, v);
        }
    }
}
