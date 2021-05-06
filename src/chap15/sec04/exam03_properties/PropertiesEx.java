package chap15.sec04.exam03_properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            properties
                    .load(new FileReader
                            ("C:\\study\\ThisIsJava\\src\\chap15\\sec04\\exam03_properties/database.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        System.out.println("driver = " +driver);
        System.out.println("url  = " +url);
        System.out.println("username = " +username);
        System.out.println("password = " +password);

        String  driver1 = (String) properties.get("driver");
        System.out.println("driver1 = " +driver1);

    }
}
