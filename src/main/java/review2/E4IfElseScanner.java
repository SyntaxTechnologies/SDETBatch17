package review2;

import java.util.Scanner;

public class E4IfElseScanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter the price of the item");
        double price=scanner.nextDouble();
        // Break till 8:50
        if(price>10000){
            System.out.println("I can't buy this item");
        }else {
            System.out.println("lets buy it");
        }

    }
}
