package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private Properties properties;

    public void openPropFiles(String path) {
        try(FileInputStream fis=new FileInputStream(path)){
            properties=new Properties();
            properties.load(fis);
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public String getPropertyValue(String key){
        return properties.getProperty(key);
    }


    public static String getProperty(String propKey)  {
      return getProperty(Constants.CONFIG_FILE_PATH,propKey);
    }

    public static String getProperty(String path,String propKey)  {
        String value=null;
        try( FileInputStream fis = new FileInputStream(path)) {
            Properties prop = new Properties();
            prop.load(fis);
            //return the value of the property that we provide in the parameter
             value = prop.getProperty(propKey);
        }catch (IOException e){
           e.printStackTrace();
        }
        return value;
    }

}
