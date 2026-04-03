package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    Properties prop;

    public ConfigReader() throws IOException {
        prop = new Properties();
        FileInputStream fis = new FileInputStream("src/resources/config.properties");
        prop.load(fis);
    }

    public String getUrl() {
        return prop.getProperty("url");
    }

    public String getUsername() {
        return prop.getProperty("userName");
    }

    public String getPassword() {
        return prop.getProperty("password");
    }
    public String getFname() {
        return prop.getProperty("fname");
    }
    public String getLname() {
        return prop.getProperty("lname");
    }
    public String getZIPCode() {
        return prop.getProperty("Zip");
    }

    public String getBrowser() {
        return prop.getProperty("browser");
    }

    public String getFilepath() {
        return prop.getProperty("filepath");
    }


}
