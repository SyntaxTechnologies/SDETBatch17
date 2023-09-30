package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private Properties properties;

    public void openPropFiles(String path) throws IOException {
        FileInputStream fis=new FileInputStream(path);
        properties=new Properties();
        properties.load(fis);
    }

    public String getPropertyValue(String key){
        return properties.getProperty(key);
    }


    public static String getProperty(String propKey) throws IOException {

        FileInputStream fis = new FileInputStream(Constants.CONFIG_FILE_PATH);
        Properties prop = new Properties();
        prop.load(fis);
        //return the value of the property that we provide in the parameter
        String value = prop.getProperty(propKey);
        return value;
    }

    public static String getProperty(String path,String propKey) throws IOException {
        FileInputStream fis = new FileInputStream(path);
        Properties prop = new Properties();
        prop.load(fis);
        //return the value of the property that we provide in the parameter
        String value = prop.getProperty(propKey);
        return value;
    }

}
