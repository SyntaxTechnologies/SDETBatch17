package review2;

import java.util.Scanner;

public class E8CommonScannerIssues {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your FullName");
        String fName=scanner.next();
        System.out.println("Please Enter your City");
        scanner.nextLine(); // to consume the enter press
        String city= scanner.nextLine();
        System.out.println(fName+" "+city);

    }
}
