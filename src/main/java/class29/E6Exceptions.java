package class29;


import java.sql.SQLOutput;
import java.util.Scanner;

public class E6Exceptions {
    public static void main(String[] args) {

        System.out.println("1");


        try {
            //place the code that might throw an exception
            // System.out.println(10/0);
            /*String name=null;
            name.length();*/
            int[] arr = new int[-5];
        } catch (ArithmeticException e) {
            System.out.println("Don't divide by zero");
        } catch (NullPointerException e) {
            System.out.println("Check if you stored the null value in the variable");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }


    }

}
