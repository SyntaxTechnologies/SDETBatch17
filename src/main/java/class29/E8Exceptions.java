package class29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E8Exceptions {
    public static void main(String[] args) {
        E8Exceptions e=new E8Exceptions();
        e.readFile();
    }



    void readFile()  {
        read();
    }


    void read()  {
    try {
        FileInputStream fis=new FileInputStream("C://sdsds");
    }catch (FileNotFoundException f){

    }

    }
}
