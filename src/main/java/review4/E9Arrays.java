package review4;

import java.util.Arrays;
import java.util.Scanner;

public class E9Arrays {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter the size of the array");
        int size=scanner.nextInt();
        int[] numbers =new int[size];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please Enter the number "+i);
            numbers[i]=scanner.nextInt();
        }
        System.out.println("You entered these numbers");
        System.out.println(Arrays.toString(numbers));

    }
}
