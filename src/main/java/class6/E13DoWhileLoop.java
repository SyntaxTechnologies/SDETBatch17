package class6;

import java.util.Scanner;

public class E13DoWhileLoop {
    public static void main(String[] args) {
        // Break till 1:51
        Scanner scanner = new Scanner(System.in);
        int input;
        System.out.println("Please Enter a number or -1 to terminate");
        input = scanner.nextInt();
        System.out.println("You have entered "+input );
        while (input != -1) {
            System.out.println("Please Enter a number or -1 to terminate");
            input = scanner.nextInt();
            System.out.println("You have entered " + input);
        }




    }
}
