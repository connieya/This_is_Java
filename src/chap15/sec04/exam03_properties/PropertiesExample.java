package chap15.sec04.exam03_properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {

    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        String path = PropertiesExample.class.getResource("database.properties").getPath();
        path = URLDecoder.decode(path,"utf-8");
        properties.load(new FileReader(path));

        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        System.out.println("driver : " +driver );
        System.out.println("url : " +url );
        System.out.println("username : " +username );
        System.out.println("password : " +password );


        path = PropertiesExample.class.getResource("/chap15/sec04/example/database.properties").getPath();
        properties.load(new FileReader(path));


         driver = properties.getProperty("driver");
         url = properties.getProperty("url");
         username = properties.getProperty("username");
         password = properties.getProperty("password");

        System.out.println("driver : " +driver );
        System.out.println("url : " +url );
        System.out.println("username : " +username );
        System.out.println("password : " +password );



    }
}
