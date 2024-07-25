package thisIsJava.collectionEx.mapEx;

import java.io.IOException;
import java.util.Properties;

public class PropertiesEx {
    public static void main(String[] args) throws Exception {
        Properties prop = new Properties();

        prop.load(PropertiesEx.class.getResourceAsStream("db.properties"));

        String driver = prop.getProperty("driver");
        String url = prop.getProperty("url");
        String username = prop.getProperty("username");
        String password = prop.getProperty("password");
        String admin = prop.getProperty("admin");

        System.out.println("driver: " + driver);
        System.out.println("url: " + url);
        System.out.println("username: " + username);
        System.out.println("password: " + password);
        System.out.println("admin: " + admin);
    }
}
