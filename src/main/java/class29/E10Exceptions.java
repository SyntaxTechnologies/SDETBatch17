package class29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E10Exceptions {
    public static void main(String[] args) {

        try( FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Syntax\\Desktop\\Batch 17\\salaries.xlsx")) {


        } catch (Exception f) {
            System.out.println("Please check the file path");
        }

    }


}
