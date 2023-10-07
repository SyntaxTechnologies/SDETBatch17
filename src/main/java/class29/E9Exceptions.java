package class29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E9Exceptions {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("C:\\Users\\Syntax\\Desktop\\Batch 17\\salaries.xlsx");

        } catch (FileNotFoundException f) {
            System.out.println("Please check the file path");
        } finally {
            try {
                if(fileInputStream!=null)
                fileInputStream.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }

    }


}
