package review13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;

public class E6Exceptions {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(1);
        System.out.println(2);
        try{
        FileInputStream fileInputStream=new FileInputStream("sjndjs");}
        catch (FileNotFoundException f){
            System.out.println("My alternate code as well");
            //System.out.println(f.getMessage());
           // System.out.println(f);
            f.printStackTrace();
        }
        System.out.println(3);
        System.out.println(4);




    }
}
