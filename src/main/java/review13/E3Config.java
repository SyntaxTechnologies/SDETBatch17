package review13;

import utils.ConfigReader;

import java.sql.SQLOutput;

public class E3Config {
    public static void main(String[] args) {

        System.out.println(ConfigReader.getProperty("C:\\Users\\Syntax\\IdeaProjects\\JavaSdetBatch17\\src\\Test.properties","name"));

    }
}
