package class29;


import java.io.File;
import java.io.FileInputStream;
import java.sql.SQLOutput;
import java.util.Scanner;

public class E5Exceptions {
    public static void main(String[] args) {

        System.out.println("1");
        System.out.println("1");
        System.out.println("1");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the size of the array");
        try {
            //plan A
            int size = scanner.nextInt();
            int[] ali = new int[size];
        }catch (Exception ahmed){
            //Plans B
            System.out.println("Something went wrong please contact support ");
        }

        System.out.println("2");
        System.out.println("3");
        System.out.println("4");


    }

}
