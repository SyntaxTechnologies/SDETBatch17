package class5;

import java.util.Scanner;

public class E3NotOperator {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter the name of the country");
        String country=input.nextLine();

        if(!country.equals("Iran")){
            System.out.println("Welcome you are allowed");
        }

        if(!country.equalsIgnoreCase("Iran")){
            System.out.println("Welcome you are allowed");
        }

    }
}
